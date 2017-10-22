package barrylui.nycbball;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CourtActivity extends AppCompatActivity implements CourtDetail.OnPanoListener, CourtDetail.OnDirection {

    Fragment mContent;
    int index;
    CourtData courtData = new CourtData();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Get index to access courtdata
        index = getIntent().getIntExtra("position", 1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court);

        //Passing index to the CourtDetail fragment
        mContent = CourtDetail.newInstance(index);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1, mContent).commit();
    }

    //Launches new activity for directions to court when button is pressed on fragment
    public void onDirection(int number) {
        //get the url for directions for specific court
        String url = (String) courtData.getItem(number).get("dlink");
        //browser intent with url
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }

    //Launches panoramic activity when button is pressed on fragment
    public void onPanoListener(int number){
        int num = number;
        Intent pano = new Intent(this, PanoActivity.class);
        pano.putExtra("position", num);
        startActivity(pano);
    }
}
