package barrylui.nycbball;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

import java.util.List;
import java.util.Map;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyRecycleViewAdapter extends RecyclerView.Adapter<MyRecycleViewAdapter.ViewHolder> {
    private List<Map<String, ?>> mDataset;
    private Context mContext;
    OnItemClickListener mItemClickListener;
    double curlat;
    double curlng;


    public MyRecycleViewAdapter(Context myContext, List<Map<String, ?>> myDataset, double latitude, double longitude) {
        mContext = myContext;
        mDataset = myDataset;
        curlat = latitude;
        curlng = longitude;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Map<String, ?> movie = mDataset.get(position);
        holder.bindMovieData(movie);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);

        public void onItemLongClick(View view, int position);
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    @Override
    public MyRecycleViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_thecardview, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView vTitle;
        public RatingBar ratingView;
        public CircleImageView cImage;
        public TextView distance;

        public void bindMovieData(Map<String, ?> movie) {
            String title = (String) movie.get("name");
            vTitle.setText(title);
            String coordinates = curlat + ", " + curlng;
            distance.setText(coordinates);
            String progress = (String) movie.get("rating");
            double val = Double.valueOf(progress);
            int rate = (int)val;
            ratingView.setProgress(rate);

            if(rate < 4)
            {
                cImage.setImageResource(R.drawable.onetofour);
            }
            else if (rate < 7)
            {
                cImage.setImageResource(R.drawable.fourtosix);
            }
            else
                cImage.setImageResource(R.drawable.seventoten);
        }

        public ViewHolder(View v) {
            super(v);
            vTitle = (TextView) v.findViewById(R.id.title1);
            ratingView = (RatingBar) v.findViewById(R.id.ratingBar1);
            cImage = (CircleImageView) v.findViewById(R.id.circ);
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