package barrylui.nycbball.CourtDetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import barrylui.nycbball.Data.CourtData;
import barrylui.nycbball.R;
/* -------------------------------------------------------------------------------------------------
 * PanoramicViewer for courts
 * Users can see what the court looks like by scrolling through the 360 degrees panoramic image
 * Users can look around by physically turning with the phone in hand or swiping left or right
 * -------------------------------------------------------------------------------------------------
 */

public class PanoramicViewer extends AppCompatActivity {

    CourtData courtData = new CourtData();
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        index = getIntent().getIntExtra("position", 1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panoramicviewer);

        //Setup embeded webview and start
        WebView myWebView = (WebView) findViewById(R.id.webview1);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl((String)courtData.getItem(index).get("imageurl"));
    }
}
