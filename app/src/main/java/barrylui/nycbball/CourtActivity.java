package barrylui.nycbball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CourtActivity extends AppCompatActivity implements CourtdetailView.OnListItemSelectedListener {

    int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        num = getIntent().getExtras().getInt("position");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court);

        Bundle posdata = new Bundle();
        posdata.putInt("pos", num);
        CourtdetailView passId = new CourtdetailView();
        passId.setArguments(posdata);
        PanoFragment pf = new PanoFragment();
        pf.setArguments(posdata);



        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1, CourtdetailView.newInstance(R.id.courtdv)).commit();
    }

    public void onListItemSelectedListener(int number){
        if(number==1){
            //getSupportFragmentManager().beginTransaction()
                    //.replace(R.id.container, aboutme.newInstance(R.id.about)).addToBackStack(null)
                    //.commit();
        }
        if(number!=1){

            getSupportFragmentManager().beginTransaction()
            .replace(R.id.container1, PanoFragment.newInstance(R.id.pano)).addToBackStack(null)
            .commit();
        }
    }
}
