package barrylui.nycbball;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CourtActivity extends AppCompatActivity implements CourtdetailView.OnListItemSelectedListener, CourtdetailView.DirectionListener {

    int in;
    Fragment mContent;
    Fragment bContent;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        index = getIntent().getIntExtra("position", 1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court);

        //Bundle posdata = new Bundle();
        //posdata.putInt("pos", num);
        //CourtdetailView passId = new CourtdetailView();
        //passId.setArguments(posdata);
        //PanoFragment pf = new PanoFragment();
        //pf.setArguments(posdata);

        mContent = CourtdetailView.newInstance(index);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1, mContent).commit();
    }

    public void ondirection(int number){
        //bContent = PanoFragment.newInstance(number);
        //getSupportFragmentManager().beginTransaction()
        //        .replace(R.id.container1, bContent).addToBackStack(null)
        //        .commit();
    }


    public void onListItemSelectedListener(int number){
            bContent = PanoFragment.newInstance(number);
            getSupportFragmentManager().beginTransaction()
            .replace(R.id.container1, bContent).addToBackStack(null)
            .commit();
        }
    }
