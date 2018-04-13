package barrylui.nycbball.CourtsNearMe;


import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import barrylui.nycbball.CourtDetail.CourtDetailViewActivity;
import barrylui.nycbball.Data.CourtData;
import barrylui.nycbball.R;

/**
 * RecyclerViewFragment that hosts the list of courts near the user
 * Compares user's lat lng with each court's lat lng and adds court to new list if it is less than 1.5 miles away
 * Quicksort is done on the new list and is returned and displayed to the user
 */
public class CourtsNearMeRecyclerView extends Fragment{

    RelativeLayout r1;
    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    GPSTracker gps;

    private int mParam1;
    private CourtsNearMeRecyclerViewAdapter mRecyclerViewAdapter;
    private OnFragmentInteractionListener mListener;
    private CourtData courtData = new CourtData();
    CourtsNearMeActivity recyclerviewactivity = (CourtsNearMeActivity) getActivity();
    double currentLat;
    double currentLng;
    public List<Map<String, ?>> courtsNearMe = new ArrayList<Map<String,?>>(); //List with courts near user

    public static CourtsNearMeRecyclerView newInstance(double userLat,double userLng) {
        CourtsNearMeRecyclerView fragment = new CourtsNearMeRecyclerView();
        Bundle args = new Bundle();
        args.putDouble("USERLAT", userLat);
        args.putDouble("USERLNG", userLng);
        fragment.setArguments(args);
        return fragment;
    }

    public CourtsNearMeRecyclerView() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        currentLat = getArguments().getDouble("USERLAT");
        currentLng = getArguments().getDouble("USERLNG");
        new AsyncFindCourtsNearMe().execute();
    }

    private class AsyncFindCourtsNearMe extends AsyncTask<Void, Void,Void> {

        @Override
        protected Void doInBackground(Void... params) {
            courtsNearMe.clear();
            compareCurrentLatLngToCourts(currentLat, currentLng);
            if (courtsNearMe.isEmpty() != true){
                quickSort(courtsNearMe);
            }
            return null;
        }
        /*
        @Override
        protected void onPostExecute(Void v){

        }
*/
    }

    //Quicksort method to sort list
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
    // Method to compare user location to courts
    public void compareCurrentLatLngToCourts (double curLat, double curLng)
    {
        double currentlat = curLat;
        double currentlng = curLng;
        for (int i=0; i<courtData.getSize();i++)
        {
            double courtlat = (double)courtData.getItem(i).get("lat");
            double courtlng = (double)courtData.getItem(i).get("lng");
            double distanceFromCourt = calculateDistanceBtwnTwoPoints(courtlat, courtlng, currentlat, currentlng);


            if(distanceFromCourt < 1.5)
            {
                String name = (String)courtData.getItem(i).get("name");
                String descrip = (String)courtData.getItem(i).get("description");
                String imgurl = (String)courtData.getItem(i).get("imageurl");
                String rating = (String)courtData.getItem(i).get("rating");
                String directlink = (String)courtData.getItem(i).get("directlink");
                DecimalFormat distanceformat = new DecimalFormat("#.##");
                double dis = Double.valueOf(distanceformat.format(distanceFromCourt));
                String dist = Double.toString(dis);
                courtsNearMe.add(createCourt(name, courtlat, courtlng, descrip, imgurl, rating, directlink,dist));
            }
        }
    }

    //Calculates distance between a pair of lat lng points
    public double calculateDistanceBtwnTwoPoints(double lat1, double lon1, double lat2, double lon2)
    {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        return (dist);
    }

    // Functions to convert between radians and degrees
    // These functions help compute the distance
    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }
    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }

    private HashMap createCourt (String name, double lat, double lng, String description,String imageurl, String rating, String directionlink, String distance) {
        HashMap court = new HashMap();
        court.put("name", name);
        court.put("lat",lat);
        court.put("lng",lng);
        court.put("description", description);
        court.put("imageurl",imageurl);
        court.put("rating", rating);
        court.put("directionlink", directionlink);
        court.put("distance", distance);
        return court;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_courtsnearme_recycler_view, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);
        mRecyclerView.setHasFixedSize(false);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        if(courtsNearMe.isEmpty()==true){
            AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();
            alertDialog.setTitle(R.string.no_courts_found);
            alertDialog.setMessage("Try again after moving closer to Manhattan or enabling location settings. Look around the city with the interactive map or browse our featured courts here");
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            alertDialog.show();

            for(int i =0; i<courtData.getSize(); i++){
                String rating = (String)courtData.getItem(i).get("rating");
                int rate = Integer.valueOf(rating);

                if(rate > 7){
                    String name = (String)courtData.getItem(i).get("name");
                    String descrip = (String)courtData.getItem(i).get("description");
                    String imgurl = (String)courtData.getItem(i).get("imageurl");
                    String directlink = (String)courtData.getItem(i).get("directlink");
                    double courtlat = (double)courtData.getItem(i).get("lat");
                    double courtlng = (double)courtData.getItem(i).get("lng");
                    double distanceFromCourt = calculateDistanceBtwnTwoPoints(courtlat, courtlng, currentLat, currentLng);
                    DecimalFormat distanceformat = new DecimalFormat("#.##");
                    double dis = Double.valueOf(distanceformat.format(distanceFromCourt));
                    String dist = Double.toString(dis);
                    courtsNearMe.add(createCourt(name, courtlat, courtlng, descrip, imgurl, rating, directlink,dist));
                }
            }
        }


        mRecyclerViewAdapter = new CourtsNearMeRecyclerViewAdapter(getActivity(), courtsNearMe);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
        mRecyclerViewAdapter.notifyDataSetChanged();

        //Launches corresponding CourtDetailViewActivity with CourtDetailViewFragment fragment
        mRecyclerViewAdapter.SetOnItemClickListener(new CourtsNearMeRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                int data = courtData.getIndex((String)courtsNearMe.get(position).get("name"));
                Intent info = new Intent(getContext(), CourtDetailViewActivity.class);
                info.putExtra("position", data);
                startActivity(info);
                mRecyclerViewAdapter.notifyDataSetChanged();
            }
            @Override
            public void onItemLongClick(View view, int position) {
            }
        });
        return rootView;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(int num);
    }

}