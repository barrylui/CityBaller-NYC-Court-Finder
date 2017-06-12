package barrylui.nycbball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CourtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int num = getIntent().getExtras().getInt("position");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_court);

        Bundle posdata = new Bundle();
        posdata.putInt("pos", num);
        CourtdetailView passId = new CourtdetailView();
        passId.setArguments(posdata);


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container1, CourtdetailView.newInstance(R.id.courtdv)).commit();
        //sometexthere
    }
}
