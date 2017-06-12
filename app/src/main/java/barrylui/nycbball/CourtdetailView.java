package barrylui.nycbball;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

    public interface OnListItemSelectedListener {
        public void onListItemSelectedListener(int num);
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
        final OnListItemSelectedListener mListener = (OnListItemSelectedListener) getContext();
        rootView = inflater.inflate(R.layout.fragment_courtdetail_view, container, false);

        courtTitle = (TextView) rootView.findViewById(R.id.courtname);
        final int getName = getArguments().getInt("pos");
        courtTitle.setText((String)courtData.getItem(getName).get("name"));

        Button directions = (Button) rootView.findViewById(R.id.button);
        Button image = (Button) rootView.findViewById(R.id.button2);

        directions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onListItemSelectedListener(1);
            }
        });
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onListItemSelectedListener(getName);
            }
        });

        // Inflate the layout for this fragment
        return rootView;
    }
}
