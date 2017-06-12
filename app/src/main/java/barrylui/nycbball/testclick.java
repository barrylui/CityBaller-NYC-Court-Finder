package barrylui.nycbball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class testclick extends AppCompatActivity {

    CourtData courtData = new CourtData();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int num = getIntent().getExtras().getInt("position");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testclick);

        TextView test = (TextView)findViewById(R.id.textView3);
        test.setText((String)courtData.getItem(num).get("name"));
    }
}
