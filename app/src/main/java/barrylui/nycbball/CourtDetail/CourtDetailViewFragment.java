package barrylui.nycbball.CourtDetail;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import barrylui.nycbball.Data.CourtData;
import barrylui.nycbball.R;


/* ----------------------------------------------------------------------------------------------------------
 * This is the Court Detail View
 * Users can see details about the court such as panoramic photos, receive directions, ratings, descriptions
 * ----------------------------------------------------------------------------------------------------------
 */
public class CourtDetailViewFragment extends Fragment {

    private static final String ARG_SEC= "";
    TextView courtTitle;
    TextView descrip;
    RatingBar ratingView;
    WebView webView;

    CourtData courtData = new CourtData();

    public CourtDetailViewFragment() {
        //empty constructor
    }

    //Interface for fragment & activity to interact when panoramic button is pressed
    public interface OnPanoramicViewListener {
        public void onPanoramicViewListener(int num);
    }

    //Interface for fragment & activity to interact when direction button is pressed
    public interface OnDirection{
        public void onDirection(int num);
    }


    public static CourtDetailViewFragment newInstance(int section) {
        CourtDetailViewFragment fragment = new CourtDetailViewFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SEC, section);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Listeners for interface
        final OnPanoramicViewListener panoramicListener = (OnPanoramicViewListener) getContext();
        final OnDirection directionListener = (OnDirection)getContext();

        View rootView = inflater.inflate(R.layout.fragment_court_detail, container, false);
        final int index = getArguments().getInt(ARG_SEC);


        ratingView = (RatingBar) rootView.findViewById(R.id.rating);
        String rating = (String) courtData.getItem(index).get("rating");
        int val = Integer.parseInt(rating);
        ratingView.setProgress(val);

        descrip = (TextView) rootView.findViewById(R.id.descrip);
        descrip.setText((String)courtData.getItem(index).get("description"));

        //webview for panoramic
        webView = (WebView) rootView.findViewById(R.id.webpreview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl((String)courtData.getItem(index).get("imageurl"));
        webView.setWebViewClient(new WebViewClient());

        Button directions = (Button) rootView.findViewById(R.id.getdirections);
        Button panoramic = (Button) rootView.findViewById(R.id.panobutton);

        directions.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                directionListener.onDirection(index);
            }
        });
        panoramic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                panoramicListener.onPanoramicViewListener(index);;
            }
        });


        return rootView;
    }
}
