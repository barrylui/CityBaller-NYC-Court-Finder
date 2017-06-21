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


        /*lat = 40.6875;
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
        rating = 0;
        fullcourt = false;
        dlink = "https://citymapper.com/directions?endcoord=40.7148246%2C-73.9895836&endname=Seward%20Park";
        courtsList.add(createCourt("Seward Park",lat,lng,description,imageurl,rating, fullcourt,dlink));
        */

        lat = 40.8122222;
        lng = -73.9463889;
        description = "This worn down court has seen better days with its rusty metal backboards, faded lines and crooked rims. " +
                "There is one full-court and one mini-full court. Go across the street to the South park for better courts ";
        imageurl = "http://www.dermandar.com/p/cnVCRl";
        rating = 3.5;
        fullcourt = true;
        dlink = "https://citymapper.com/directions?endcoord=40.8122222%2C-73.9463889&endname=St%20Nicholas%20Playground%20North";
        courtsList.add(createCourt("St. Nicholas Playground North",lat,lng,description,imageurl,rating, fullcourt,dlink));

        lat = 40.8111111;
        lng = -73.9472222;
        description = "An example of a rugged typical New York City basketball court. Beyond the roadside location and apartment backdrop, the two full-courts and two half courts" +
                "are clean, clearly marked and perfectly adequate";
        imageurl = "http://www.dermandar.com/p/avPmaY";
        rating = 5.5;
        fullcourt = true;
        dlink = "https://citymapper.com/directions?endcoord=40.8111111%2C-73.9472222&endname=St%20Nicholas%20Playground%20South";
        courtsList.add(createCourt("St. Nicholas Playground South",lat,lng,description,imageurl,rating, fullcourt,dlink));

        lat = 40.712774;
        lng = -73.991075;
        description = "This very blue-colored court located in Chinatown looks great upon first glance with a nice playing surface and two full courts. " +
                "The only things that are missing is a 3-point line and some nets for the metal rims";
        imageurl = "http://www.dermandar.com/p/aSmTAt";
        rating = 7;
        fullcourt = true;
        dlink = "https://citymapper.com/directions?endcoord=40.712774%2C-73.991075&endname=Playground%20One";
        courtsList.add(createCourt("Playground One",lat,lng,description,imageurl,rating, fullcourt,dlink));

        lat = 40.711835;
        lng = -73.984256;
        description = "One of the city's best-kept secrets. Two full-sized courts with a very clean playing surface. These rims are double rimmed and the trees nearby provide plenty of shade";
        imageurl = "http://www.dermandar.com/p/bmfiQp";
        rating = 8.5;
        fullcourt = true;
        dlink = "https://citymapper.com/directions?endcoord=40.711835%2C-73.984256&endname=Lillian%20D%20Wald%20Playground";
        courtsList.add(createCourt("Lillian D Wald Playground",lat,lng,description,imageurl,rating, fullcourt,dlink));

        lat = 40.730348;
        lng = -73.973605;
        description = "Located by the FDR Drive, this quiet court has a mini-sized full-court with double rims. This court is missing a 3-point line but has some park benches to rest in between games";
        imageurl = "http://www.dermandar.com/p/dVKsDz";
        rating = 4.5;
        fullcourt = false;
        dlink = "https://citymapper.com/directions?endcoord=40.730348%2C-73.973605&endname=Murphy%20Brother's%20Playground";
        courtsList.add(createCourt("Murphy Brother's Playground",lat,lng,description,imageurl,rating, fullcourt,dlink));

        lat = 40.7368811;
        lng = -73.9756617;
        description = "Simple Court with just one full-sized full court. Good playing surface and sturdy hoops. The only problem is there are some metal covers on the playing surface inside the three point line that must be hiding some sort of utilities";
        imageurl = "http://www.dermandar.com/p/bSFNBo";
        rating = 5;
        fullcourt = true;
        dlink = "https://citymapper.com/directions?endcoord=40.7368811%2C-73.9756617&endname=Asser%20Levy%20Playground";
        courtsList.add(createCourt("Asser Levy Playground",lat,lng,description,imageurl,rating, fullcourt,dlink));

        lat = 40.7397222;
        lng = -73.9783333;
        description = "This court has four hoops, the problem is two of the hoops are at the half-court of this full-court. The good news is there are plenty of trees for shade and benches to relax after an afternoon of ballin out";
        imageurl = "http://www.dermandar.com/p/bWybrF";
        rating = 6.5;
        fullcourt = true;
        dlink = "https://citymapper.com/directions?endcoord=40.7397222%2C-73.9756617&endname=Bellevue%20South%20Park";
        courtsList.add(createCourt("Bellevue South Park",lat,lng,description,imageurl,rating, fullcourt,dlink));

        lat = 40.7453796;
        lng =  -73.9740275;
        description = "A nice park for pick up games by the Midtown Tunnel. There is a nice well-paved court hourt and a half court for working on your game.";
        imageurl = "http://www.dermandar.com/p/dOHlsy";
        rating = 6.5;
        fullcourt = true;
        dlink = "https://citymapper.com/directions?endcoord=40.7453796%2C-73.9740275&endname=St.%20Vartan%20Park";
        courtsList.add(createCourt("St. Vartan Park",lat,lng,description,imageurl,rating, fullcourt,dlink));

        lat = 40.7483333;
        lng =  -73.9697222;
        description = "This park by the East River and the FDR Drive has one mini-sized full court and two half courts that are beautifully paved. Beware of the half courts if you value your basketball, the fence protecting your ball from bouncing into the FDR Drive or East River isn't very high. ";
        imageurl = "http://www.dermandar.com/p/apxWEi";
        rating = 6;
        fullcourt = false;
        dlink = "https://citymapper.com/directions?endcoord=40.7483333%2C-73.9697222&endname=Robert%20Moses%20Playground";
        courtsList.add(createCourt("Robert Moses Playground",lat,lng,description,imageurl,rating, fullcourt,dlink));

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
