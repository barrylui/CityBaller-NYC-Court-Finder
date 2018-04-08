package barrylui.nycbball.CourtData;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* ----------------------------------------------------------
 * Featured courts for users outside of NYC
 * ----------------------------------------------------------
 */

public class FeaturedCourts {
    public static List<Map<String, ?>> courtsList;

    public List<Map<String, ?>> getCourtsList() {return courtsList;}

    public int getSize() { return courtsList.size();}

    public HashMap getItem(int i) {
        if (i >= 0 && i < courtsList.size()){
            return (HashMap) courtsList.get(i);
        } else return null;
    }

    public FeaturedCourts(){
        double lat;
        double lng;
        String description;
        String imageurl;
        String rating;
        String directionsLink;
        int distance;

        courtsList = new ArrayList<Map<String, ?>>();


        lat = 40.829457;
        lng = -73.936449;
        description = "The world's most famous court, the Rucker. Legends like Dr. J, Kobe & Wilt have played here. Everything about this court is top notch but the court is rarely available.";
        imageurl = "http://www.dermandar.com/p/dyjPhv";
        rating = "10";
        directionsLink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Rucker%20Park";
        distance = 0;
        courtsList.add(createCourt("Rucker Park",lat,lng,description,imageurl,rating,directionsLink,distance));


        lat = 40.711835;
        lng = -73.984256;
        description = "Two full-sized courts with a nice clean surface that makes your sneakers squeak with every cut you make. The rims are double-rimmed, make sure you have enough arc on your shot";
        imageurl = "http://www.dermandar.com/p/bmfiQp";
        rating = "8";
        directionsLink = "https://citymapper.com/directions?endcoord=40.711835%2C-73.984256&endname=Lillian%20D%20Wald%20Playground";
        distance = 0;
        courtsList.add(createCourt("Lillian D Wald Playground",lat,lng,description,imageurl,rating,directionsLink,distance));

        lat = 40.717048;
        lng = -74.012039;
        description = "Simple park with one full court and one half court. Well-paved, plexi glass rims, a good spot to run a couple of pick up games. If only there were a little shade.";
        imageurl = "http://www.dermandar.com/p/eiCowx";
        rating = "8";
        directionsLink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Washington%20Square%20Park";
        distance = 0;
        courtsList.add(createCourt("Washington Square Park",lat,lng,description,imageurl,rating,directionsLink,distance));

        lat = 40.719330;
        lng = -73.980775;
        description = "One of the best places to play basketball on the LES. This quiet, walled-in park with a pool, has two nicely paved full courts with plexi glass rims.";
        imageurl = "http://www.dermandar.com/p/bRaDof";
        rating = "7";
        directionsLink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Hamilton%20Fish%20Park";
        distance = 0;
        courtsList.add(createCourt("Hamiltion Fish Park",lat,lng,description,imageurl,rating,directionsLink,distance));

        lat = 40.726709;
        lng = -73.980807;
        description = "Cracked floors, faded paint job. Theres one full court and half courts in the northeast and norwest corner of the park.";
        imageurl = "http://www.dermandar.com/p/aSRYGl";
        rating = "6";
        directionsLink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Tompkins%20Square%20Park";
        distance = 0;
        courtsList.add(createCourt("Tompkins Square Park",lat,lng,description,imageurl,rating,directionsLink,distance));

        lat = 40.768494;
        lng = -73.994867;
        description = "Jackpot!!! Get here now! Two full sized courts that are freshly painted, plexi glass rims and a lively pick-up scene.";
        imageurl = "http://www.dermandar.com/p/aNZrHP";
        rating = "9";
        directionsLink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=De%20Witt%20Clinton%20Park";
        distance = 0;
        courtsList.add(createCourt("De Witt Clinton Park",lat,lng,description,imageurl,rating,directionsLink,distance));

        lat = 40.765319;
        lng = -73.958963;
        description = "This yard almost has it all, hand ball courts, track lanes, trees for shade, benches to rest on... only thing missing are full courts. There are six well-paved half courts here.";
        imageurl = "http://www.dermandar.com/p/eMRQSq";
        rating = "7";
        directionsLink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=St%20Catherines%20Park";
        distance = 0;
        courtsList.add(createCourt("St Catherine's Park",lat,lng,description,imageurl,rating,directionsLink,distance));

        lat = 40.7823379;
        lng = -73.9651196;
        description = "Pick-up ball in the heart of the city! There's two mini size full courts here and plenty of shade.";
        imageurl = "http://www.dermandar.com/p/bRFDzN";
        rating = "8";
        directionsLink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Great%20Lawn%20Courts";
        distance = 0;
        courtsList.add(createCourt("Great Lawn Courts",lat,lng,description,imageurl,rating,directionsLink,distance));


        lat = 40.795445;
        lng = -73.9689622;
        description = "Theres four high quality mini-sized full courts here. The skill level here in this busy park is pretty good here so bring your A game.";
        imageurl = "http://www.dermandar.com/p/ackLiq";
        rating = "8";
        directionsLink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Happy%20Warrior%20Playground";
        distance = 0;
        courtsList.add(createCourt("Happy Warrior Playground",lat,lng,description,imageurl,rating,directionsLink,distance));

        lat = 40.791042;
        lng = -73.959792;
        description = "Ballin in Central Park! These crowded courts close around 5-6pm so get there early if you want to run a couple.";
        imageurl = "http://www.dermandar.com/p/dqhbqE";
        rating = "8";
        directionsLink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=North%20Meadow";
        distance = 0;
        courtsList.add(createCourt("North Meadow",lat,lng,description,imageurl,rating,directionsLink,distance));

        lat = 40.785359;
        lng = -73.950983;
        description = "There's a mini full court and three half courts, all beautifully paved with nice hoops and nets. ";
        imageurl = "http://www.dermandar.com/p/ayiHGi";
        rating = "8";
        directionsLink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Samuel%20Seabury%20Playground";
        distance = 0;
        courtsList.add(createCourt("Samuel Seabury Playground",lat,lng,description,imageurl,rating,directionsLink,distance));

    }

    private HashMap createCourt (String name, double lat, double lng, String description,String imageurl, String rating, String directionsLink, double distance) {
        HashMap court = new HashMap();
        court.put("name", name);
        court.put("lat",lat);
        court.put("lng",lng);
        court.put("description", description);
        court.put("imageurl",imageurl);
        court.put("rating", rating);
        court.put("directionsLink", directionsLink);
        court.put("distance", distance);
        return court;
    }

    public int getIndex(String itemName)
    {
        for (int i = 0; i < courtsList.size(); i++)
        {
            if (itemName.equals(courtsList.get(i).get("name")))
            {
                return i;
            }
        }

        return -1;
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

}
