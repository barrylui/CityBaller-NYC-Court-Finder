package barrylui.nycbball;


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

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecycleView extends Fragment {

    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    //MovieData movieData = new MovieData();
    private int mParam1;
    private int mParam2;
    private MyRecycleViewAdapter mRecyclerViewAdapter;
    private OnFragmentInteractionListener mListener;
    private CourtData courtData = new CourtData();

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public static RecycleView newInstance(int sectionNumber) {
        RecycleView fragment = new RecycleView();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, sectionNumber);
        fragment.setArguments(args);
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.activity_recycle_view, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.cardList);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerViewAdapter = new MyRecycleViewAdapter(getActivity(), courtData.getCourtsList());
        mRecyclerView.setAdapter(mRecyclerViewAdapter);



        mRecyclerViewAdapter.SetOnItemClickListener(new MyRecycleViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                mListener.onFragmentInteraction(position);

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