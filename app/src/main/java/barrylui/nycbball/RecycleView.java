package barrylui.nycbball;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
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
import android.widget.RelativeLayout;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecycleView extends Fragment{

    RelativeLayout r1;
    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    //MovieData movieData = new MovieData();
    private int mParam1;
    private static final String ARG_SECTION_NUMBER = "section_number";
    private MyRecycleViewAdapter mRecyclerViewAdapter;
    private OnFragmentInteractionListener mListener;
    private CourtData courtData = new CourtData();
    LocationManager locationManager ;
    String provider;
    public static List<Map<String, ?>> courtsNearMe = new ArrayList<Map<String,?>>();

    public static RecycleView newInstance(int sectionNumber) {
        RecycleView fragment = new RecycleView();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public RecycleView() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        //if (getArguments().getInt(ARG_SECTION_NUMBER) == -1) {
            CourtsRecycleView activity = (CourtsRecycleView) getActivity();
            double curLat = activity.getcurLat();
            double curLng = activity.getcurLng();
            courtsNearMe.clear();
            compareLatLng(curLat, curLng);
            quickSort(courtsNearMe);
           // }

        //setRetainInstance(true);
    }

    public static void quickSort(List<Map<String, ?>> thelist ){
        quickSort(thelist, 0, thelist.size() - 1);
    }

    public static void quickSort(List<Map<String, ?>> thelist, int from, int to) {
        if (from < to) {
            int pivot = from;
            int left = from + 1;
            int right = to;
            double pivotValue = Double.parseDouble((String)thelist.get(pivot).get("distance"));
            while (left <= right) {
                // left <= to -> limit protection
                while ((double)left <= to && pivotValue >= Double.parseDouble((String)thelist.get(left).get("distance"))) {
                    left++;
                }
                // right > from -> limit protection
                while (right > from && pivotValue < Double.parseDouble((String)thelist.get(right).get("distance"))){
                    right--;
                }
                if (left < right) {
                    Collections.swap(thelist, left, right);
                }
            }
            Collections.swap(thelist, pivot, left - 1);
            quickSort(thelist, from, right - 1); // <-- pivot was wrong!
            quickSort(thelist, right + 1, to);   // <-- pivot was wrong!

        }

    }


    /*
    @Override
    public void onPause(){
        super.onPause();
        courtsNearMe.clear();
        mRecyclerViewAdapter.notifyDataSetChanged();
    }
    @Override
    public void onStop(){
        super.onStop();
        courtsNearMe.clear();
        mRecyclerViewAdapter.notifyDataSetChanged();
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        courtsNearMe.clear();

        mRecyclerViewAdapter.notifyDataSetChanged();
    }


*/


    public void compareLatLng (double curLat, double curLng)
    {
        double clat = curLat;
        double clng = curLng;
        for (int i=0; i<courtData.getSize();i++)
        {
            double lat = (double)courtData.getItem(i).get("lat");
            double lng = (double)courtData.getItem(i).get("lng");
            String name = (String)courtData.getItem(i).get("name");
            String descrip = (String)courtData.getItem(i).get("description");
            String iurl = (String)courtData.getItem(i).get("imageurl");
            String rating = (String)courtData.getItem(i).get("rating");
            String directlink = (String)courtData.getItem(i).get("dlink");


            if(calcDistance(lat, lng, clat, clng) < 4)
            {
                DecimalFormat distanceformat = new DecimalFormat("#.##");
                double dis = Double.valueOf(distanceformat.format(calcDistance(lat, lng, clat, clng)));
                String dist = Double.toString(dis);
                courtsNearMe.add(createCourt(name, lat, lng, descrip, iurl, rating, directlink,dist));
            }
        }
    }

    private HashMap createCourt (String name, double lat, double lng, String description,String imageurl, String rating, String dlink, String distance) {
        HashMap court = new HashMap();
        court.put("name", name);
        court.put("lat",lat);
        court.put("lng",lng);
        court.put("description", description);
        court.put("imageurl",imageurl);
        court.put("rating", rating);
        court.put("dlink", dlink);
        court.put("distance", distance);
        return court;
    }

    public double calcDistance(double lat1, double lon1, double lat2, double lon2)
    {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        return (dist);
    }

    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_recycle_view, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);

        mRecyclerView.setHasFixedSize(false);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        if (courtsNearMe.isEmpty()){
            r1 = (RelativeLayout)rootView.findViewById(R.id.container2);
            r1.setBackgroundResource(R.drawable.msg);
        }

            mRecyclerViewAdapter = new MyRecycleViewAdapter(getActivity(), courtsNearMe);
            mRecyclerView.setAdapter(mRecyclerViewAdapter);
            mRecyclerViewAdapter.notifyDataSetChanged();


        mRecyclerViewAdapter.SetOnItemClickListener(new MyRecycleViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                int data = courtData.getIndex((String)courtsNearMe.get(position).get("name"));
                Intent info = new Intent(getContext(), CourtActivity.class);
                info.putExtra("position", data);
                startActivity(info);
                mRecyclerViewAdapter.notifyDataSetChanged();

            }

            @Override
            public void onItemLongClick(View view, int position) {
                //Log.d("Click", "Long Click");
                //courtData.addCourt(position);
                //mRecyclerViewAdapter.notifyItemInserted(position + 1);

            }
        });
        return rootView;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(int num);

    }

}