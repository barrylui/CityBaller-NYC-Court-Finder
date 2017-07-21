package barrylui.nycbball;


import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecycleView extends Fragment{

    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    //MovieData movieData = new MovieData();
    private int mParam1;
    private int mParam2;
    private MyRecycleViewAdapter mRecyclerViewAdapter;
    private OnFragmentInteractionListener mListener;
    private CourtData courtData = new CourtData();
    LocationManager locationManager ;
    String provider;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public static RecycleView newInstance(int sectionNumber) {
        RecycleView fragment = new RecycleView();
        return fragment;
    }

    public RecycleView() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
            Log.d("Param", mParam1 + "");
            mParam2 = getArguments().getInt(ARG_PARAM2);

            setRetainInstance(true);
        }
    }

    /*public double compareLatLng ()
    {
        double clat;
        double clng;
        for (int i=0; i<courtData.getSize();i++)
        {
            double lat = (double)courtData.getItem(i).get("lat");
            double lng = (double)courtData.getItem(i).get("lng");
        }
        return 0.0;
    }
    */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_recycle_view, container, false);

        //compareLatLng();
        CourtsRecycleView activity = (CourtsRecycleView) getActivity();
        double lat = activity.getcurLat();
        double lng = activity.getcurLng();

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerViewAdapter = new MyRecycleViewAdapter(getActivity(), courtData.getCourtsList(),lat, lng);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);



        mRecyclerViewAdapter.SetOnItemClickListener(new MyRecycleViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent info = new Intent(getContext(), CourtActivity.class);
                info.putExtra("position", position);
                startActivity(info);

            }

            @Override
            public void onItemLongClick(View view, int position) {
                //Log.d("Click", "Long Click");
                courtData.addCourt(position);
                mRecyclerViewAdapter.notifyItemInserted(position + 1);

            }
        });
        return rootView;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(int num);

    }

}