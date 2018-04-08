package barrylui.nycbball.CourtDetails;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import barrylui.nycbball.CourtData.CourtData;
import barrylui.nycbball.R;



/* ----------------------------------------------------------
 * This is the CourtDetailViewActivity  for CityBaller
 * It contains a container for fragments to be loaded in
 * ----------------------------------------------------------
 */

public class CourtDetailViewActivity extends AppCompatActivity implements CourtDetailViewFragment.OnPanoramicViewListener, CourtDetailViewFragment.OnDirection {

    Fragment mContent;
    int index;
    CourtData courtData = new CourtData();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Get index to access specific court
        index = getIntent().getIntExtra("position", 1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courtsdetailview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        TextView toolbarTitle = (TextView)findViewById(R.id.toolbar_title);
        toolbarTitle.setText((String)courtData.getItem(index).get("name"));

        //Passing index to the CourtDetailViewFragment fragment
        mContent = CourtDetailViewFragment.newInstance(index);

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

    //Launches panoramic activity to view court
    public void onPanoramicViewListener(int index){
        int num = index;
        Intent panoramic = new Intent(this, PanoramicViewer.class);
        panoramic.putExtra("position", num);
        startActivity(panoramic);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
