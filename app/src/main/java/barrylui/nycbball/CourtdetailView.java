package barrylui.nycbball;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CourtdetailView extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    //private static final String ARG_PARAM1 = "param1";
    //private static final String ARG_PARAM2 = "param2";
    private static final String ARG_SECTION_NUMBER = "section_number";
    TextView courtTitle;
    CourtData courtData = new CourtData();

    // TODO: Rename and change types of parameters
    //private String mParam1;
    //private String mParam2;


    public CourtdetailView() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static CourtdetailView newInstance(int sectionNumber) {
        CourtdetailView fragment = new CourtdetailView();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
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
        View rootView;
        rootView = inflater.inflate(R.layout.fragment_courtdetail_view, container, false);
        courtTitle = (TextView) rootView.findViewById(R.id.courtname);
        int getName = getArguments().getInt("pos");
        courtTitle.setText((String)courtData.getItem(getName).get("name"));
        // Inflate the layout for this fragment
        return rootView;
    }
}
