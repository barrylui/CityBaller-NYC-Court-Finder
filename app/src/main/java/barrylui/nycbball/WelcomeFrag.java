package barrylui.nycbball;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import pl.droidsonroids.gif.GifTextView;


public class WelcomeFrag extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    //private static final String ARG_PARAM1 = "param1";
    //private static final String ARG_PARAM2 = "param2";
    private static final String ARG_SECTION_NUMBER = "section_number";
    GifTextView spinball;

    // TODO: Rename and change types of parameters
    //private String mParam1;
    //private String mParam2;

    public WelcomeFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment WelcomeFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static WelcomeFrag newInstance(int sectionNumber) {
        WelcomeFrag fragment = new WelcomeFrag();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public interface OnBallClickListener {
        public void onBallClick();

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_welcome, container, false);

        final OnBallClickListener bListener = (OnBallClickListener) getContext();
        spinball = (GifTextView) rootView.findViewById(R.id.gifView);
        spinball.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                bListener.onBallClick();
            }
        });
        return rootView;

    }

}
