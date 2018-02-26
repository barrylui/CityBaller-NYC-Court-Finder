package barrylui.nycbball;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import de.hdodenhof.circleimageview.CircleImageView;


/* ----------------------------------------------------------
 * This is the Adapter for the CourtsNearMeRecyclerView
 *
 * ----------------------------------------------------------
 */
public class CourtsNearMeRecyclerViewAdapter extends RecyclerView.Adapter<CourtsNearMeRecyclerViewAdapter.ViewHolder> {
    private List<Map<String, ?>> mDataset;
    private Context mContext;
    OnItemClickListener mItemClickListener;
    double curlat;
    double curlng;


    public CourtsNearMeRecyclerViewAdapter(Context myContext, List<Map<String, ?>> myDataset) {
        mContext = myContext;
        mDataset = myDataset;
    }

    @Override
    //bind data to position
    public void onBindViewHolder(ViewHolder holder, int position) {
        Map<String, ?> court = mDataset.get(position);
        holder.bindCourtData(court);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    //Set up listeners for recyclerview
    public interface OnItemClickListener {
        public void onItemClick(View view, int position);

        public void onItemLongClick(View view, int position);
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    //Inflate the layout provided by layout file
    @Override
    public CourtsNearMeRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_thecardview, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //Declaring items
        public TextView vTitle;
        public RatingBar ratingView;
        public CircleImageView circleImage;
        public TextView distance;

        //Binding data from courts to appropriate fields
        public void bindCourtData(Map<String, ?> court) {
            String title = (String) court.get("name");
            vTitle.setText(title);
            String dist = (String) court.get("distance");
            distance.setText(dist + " Miles Away");
            String progress = (String) court.get("rating");
            double val = Double.valueOf(progress);
            int rate = (int)val;
            ratingView.setProgress(rate);

            //circleImage.setImageResource(R.drawable.promo512);

            if(rate < 7)
            {
                circleImage.setImageResource(R.drawable.seventoten);
            }
            //else if (rate < 7)
            //{
            //    circleImage.setImageResource(R.drawable.seventoten);
            //}
            else
                circleImage.setImageResource(R.drawable.promo512);

        }

        public ViewHolder(View v) {
            super(v);
            vTitle = (TextView) v.findViewById(R.id.title1);
            ratingView = (RatingBar) v.findViewById(R.id.ratingBar1);
            circleImage = (CircleImageView) v.findViewById(R.id.circ);
            distance = (TextView) v.findViewById(R.id.distance);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mItemClickListener != null) {
                        mItemClickListener.onItemClick(v, getLayoutPosition());
                    }
                }
            });

            v.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    if (mItemClickListener != null) {
                        mItemClickListener.onItemLongClick(v, getLayoutPosition());
                    }
                    return true;
                }
            });
        }
    }
}