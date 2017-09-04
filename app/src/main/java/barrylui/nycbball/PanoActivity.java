package barrylui.nycbball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PanoActivity extends AppCompatActivity {

    CourtData courtData = new CourtData();
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        index = getIntent().getIntExtra("position", 1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pano);

        WebView myWebView = (WebView) findViewById(R.id.webview1);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl((String)courtData.getItem(index).get("imageurl"));
    }
}
