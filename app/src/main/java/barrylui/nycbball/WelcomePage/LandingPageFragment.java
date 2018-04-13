package barrylui.nycbball.WelcomePage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import barrylui.nycbball.R;
import pl.droidsonroids.gif.GifTextView;

/* ------------------------
 * Landing Page Fragment
 * ------------------------
 */

public class LandingPageFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";
    GifTextView animatedAppLogo;



    public LandingPageFragment() {
        // Required empty public constructor
    }

    public static LandingPageFragment newInstance(int sectionNumber) {
        LandingPageFragment fragment = new LandingPageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
    //Interface for fragment to interact with activity
    public interface OnBallClickListener {
        public void onBallClick();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_welcome, container, false);
        //Click listener for the gif
        final OnBallClickListener bListener = (OnBallClickListener) getContext();
        animatedAppLogo = (GifTextView) rootView.findViewById(R.id.gifView);
        animatedAppLogo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                bListener.onBallClick();//calls method in activity to launch map activity
            }
        });
        return rootView;
    }
}
