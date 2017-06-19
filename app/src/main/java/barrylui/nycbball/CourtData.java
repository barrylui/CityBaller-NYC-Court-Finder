package barrylui.nycbball;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by The MACHINE on 5/31/2017.
 */
public class CourtData {
    public static List<Map<String, ?>> courtsList;

    public List<Map<String, ?>> getCourtsList() {return courtsList;}

    public int getSize() { return courtsList.size();}

    public HashMap getItem(int i) {
        if (i >= 0 && i < courtsList.size()){
            return (HashMap) courtsList.get(i);
        } else return null;
    }

    public CourtData(){
        double lat;
        double lng;
        String description;
        String imageurl;
        double rating;
        boolean fullcourt;
        String dlink;

        courtsList = new ArrayList<Map<String, ?>>();


        lat = 40.6875;
        lng = -73.9258333;
        description = "My court";
        imageurl = "http://graphics.wsj.com/brooklyn-best-and-worst-basketball-courts/img/reinaldo.jpg";
        rating = 4;
        fullcourt = true;
        dlink = "https://citymapper.com/directions?endcoord=40.6875%2C-73.9258333&endname=Reinaldo%20Salgado%20Playground";
        courtsList.add(createCourt("Reinaldo Salgado Playground",lat,lng,description,imageurl,rating, fullcourt,dlink));


        lat = 40.7148246;
        lng = -73.9895836;
        description = "Seward Park court";
        imageurl = "http://www.dermandar.com/p/bqantM";
        fullcourt = false;
        dlink = "https://citymapper.com/directions?endcoord=40.7148246%2C-73.9895836&endname=Seward%20Park";
        courtsList.add(createCourt("Seward Park",lat,lng,description,imageurl,rating, fullcourt,dlink));

        lat = 40.8122222;
        lng = -73.9463889;
        description = "shitty park";
        imageurl = "http://www.dermandar.com/p/cnVCRl";
        rating = 3;
        fullcourt = true;
        dlink = "https://citymapper.com/directions?endcoord=40.8122222%2C-73.9463889&endname=St%20Nicholas%20Playground%20North";
        courtsList.add(createCourt("St. Nicholas Playground North",lat,lng,description,imageurl,rating, fullcourt,dlink));

    }

    private HashMap createCourt (String name, double lat, double lng, String description,String imageurl, double rating, boolean fullcourt,String dlink) {
        HashMap court = new HashMap();
        court.put("name", name);
        court.put("lat",lat);
        court.put("lng",lng);
        court.put("description", description);
        court.put("imageurl",imageurl);
        court.put("rating", rating);
        court.put("fullcourt", fullcourt);
        court.put("dlink", dlink);
        return court;
    }

    public void addCourt(int position) {
        HashMap original = (HashMap) courtsList.get(position);
        HashMap court = original;

        courtsList.add(position+1, court);
        Log.d("added", "to" + (position));
    }

    public void removeCourt(int position) {

        courtsList.remove(position);
    }

    public void setMoviesList(List<Map<String,?>> moviesList) {
        this.courtsList = courtsList;
    }


    public void addToList(int num , Map<String,?> court) {
        courtsList.add(num,court);
    }

}
