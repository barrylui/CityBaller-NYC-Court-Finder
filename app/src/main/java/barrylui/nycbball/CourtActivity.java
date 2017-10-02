package barrylui.nycbball;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CourtActivity extends AppCompatActivity implements CourtDetail.OnPanoListener, CourtDetail.OnDirection {

    int in;
    Fragment mContent;
    Fragment bContent;
    int index;
    CourtData courtData = new CourtData();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        index = getIntent().getIntExtra("position", 1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court);

        mContent = CourtDetail.newInstance(index);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1, mContent).commit();
    }

    public void onDirection(int number) {
        String url = (String) courtData.getItem(number).get("dlink");
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(browserIntent);
    }

    public void onPanoListener(int number){
        int num = number;
        Intent pano = new Intent(this, PanoActivity.class);
        pano.putExtra("position", num);
        startActivity(pano);
    }

/*
    public void onListItemSelectedListener(int number){
        int num = number;
        Intent pano = new Intent(this, PanoActivity.class);
        pano.putExtra("position", num);
        startActivity(pano);
        }
        */
    }
