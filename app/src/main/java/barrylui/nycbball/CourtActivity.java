package barrylui.nycbball;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



/* ----------------------------------------------------------
 * This is the CourtActivity  for CityBaller
 * It contains a container for fragments to be loaded in
 * ----------------------------------------------------------
 */

public class CourtActivity extends AppCompatActivity implements CourtDetailView.OnPanoramicViewListener, CourtDetailView.OnDirection {

    Fragment mContent;
    int index;
    CourtData courtData = new CourtData();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Get index to access courtdata
        index = getIntent().getIntExtra("position", 1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court);

        //Passing index to the CourtDetailView fragment
        mContent = CourtDetailView.newInstance(index);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1, mContent).commit();
    }

    //Launches new activity for directions to court when button is pressed on fragment
    public void onDirection(int index) {
        //get the url for directions for specific court
        String url = (String) courtData.getItem(index).get("directionsLink");
        //browser intent with url
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }

    //Launches panoramic activity when button is pressed on fragment
    public void onPanoramicViewListener(int index){
        int num = index;
        Intent panoramic = new Intent(this, PanoramicViewer.class);
        panoramic.putExtra("position", num);
        startActivity(panoramic);
    }
}
