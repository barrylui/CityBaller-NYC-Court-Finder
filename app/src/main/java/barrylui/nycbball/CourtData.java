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
        dlink = "https://citymapper.com/directions?endcoord=40.6875%2C-73.9258333&endname=Reinaldo%20Salgado%20Playground";
        courtsList.add(createCourt("Reinaldo Salgado Playground",lat,lng,description,imageurl,rating,dlink));

        /*
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
        dlink = "https://citymapper.com/directions?endcoord=40.8122222%2C-73.9463889&endname=St%20Nicholas%20Playground%20North";
        courtsList.add(createCourt("ST. NICHOLAS PLAYGROUND NORTH",lat,lng,description,imageurl,rating,dlink));

        lat = 40.8111111;
        lng = -73.9472222;
        description = "An example of a rugged typical New York City basketball court. Beyond the roadside location and apartment backdrop, the two full-courts and two half courts" +
                "are clean, clearly marked and perfectly adequate";
        imageurl = "http://www.dermandar.com/p/avPmaY";
        rating = 5.5;
        dlink = "https://citymapper.com/directions?endcoord=40.8111111%2C-73.9472222&endname=St%20Nicholas%20Playground%20South";
        courtsList.add(createCourt("ST. NICHOLAS PLAYGROUND SOUTH",lat,lng,description,imageurl,rating,dlink));

        lat = 40.712774;
        lng = -73.991075;
        description = "This very blue-colored court located in Chinatown looks great upon first glance with a nice playing surface and two full courts. " +
                "Its missing a 3-point line and some nets on the hoops";
        imageurl = "http://www.dermandar.com/p/aSmTAt";
        rating = 7;
        dlink = "https://citymapper.com/directions?endcoord=40.712774%2C-73.991075&endname=Playground%20One";
        courtsList.add(createCourt("PLAYGROUND ONE",lat,lng,description,imageurl,rating,dlink));

        lat = 40.711835;
        lng = -73.984256;
        description = "One of the city's best-kept secrets. Two full-sized courts with a very clean playing surface, the kind of surface that make your sneakers have that crispy squeak with every cut and plant you make. These rims are double rimmed and the trees nearby provide plenty of shade.";
        imageurl = "http://www.dermandar.com/p/bmfiQp";
        rating = 8.5;
        dlink = "https://citymapper.com/directions?endcoord=40.711835%2C-73.984256&endname=Lillian%20D%20Wald%20Playground";
        courtsList.add(createCourt("LILLIAN D WALD PLAYGROUND",lat,lng,description,imageurl,rating,dlink));

        lat = 40.730348;
        lng = -73.973605;
        description = "Located by the FDR Drive, this quiet court has a mini-sized full-court with double rims. This court is missing a 3-point line but has some park benches to rest in between games";
        imageurl = "http://www.dermandar.com/p/dVKsDz";
        rating = 4.5;
        dlink = "https://citymapper.com/directions?endcoord=40.730348%2C-73.973605&endname=Murphy%20Brother's%20Playground";
        courtsList.add(createCourt("MURPHY'S BROTHER'S PLAYGROUND",lat,lng,description,imageurl,rating,dlink));

        lat = 40.7368811;
        lng = -73.9756617;
        description = "Simple Court with just one full-sized full court. Good playing surface and sturdy hoops. The only problem is there are some metal covers on the playing surface inside the three point line that must be hiding some sort of utilities";
        imageurl = "http://www.dermandar.com/p/bSFNBo";
        rating = 5;
        dlink = "https://citymapper.com/directions?endcoord=40.7368811%2C-73.9756617&endname=Asser%20Levy%20Playground";
        courtsList.add(createCourt("ASSER LEVY PLAYGROUND",lat,lng,description,imageurl,rating,dlink));

        lat = 40.7397222;
        lng = -73.9783333;
        description = "This court has four hoops, the problem is two of the hoops are at the half-court of this full-court. The good news is there are plenty of trees for shade and benches to relax after an afternoon of ballin out";
        imageurl = "http://www.dermandar.com/p/bWybrF";
        rating = 6.5;
        dlink = "https://citymapper.com/directions?endcoord=40.7397222%2C-73.9756617&endname=Bellevue%20South%20Park";
        courtsList.add(createCourt("BELLEVUE SOUTH PARK",lat,lng,description,imageurl,rating,dlink));

        lat = 40.7453796;
        lng = -73.9740275;
        description = "A nice park for pick up games by the Midtown Tunnel. There is a nice well-paved court hourt and a half court for working on your game.";
        imageurl = "http://www.dermandar.com/p/dOHlsy";
        rating = 6.5;
        dlink = "https://citymapper.com/directions?endcoord=40.7453796%2C-73.9740275&endname=St.%20Vartan%20Park";
        courtsList.add(createCourt("ST. VARTAN PARK",lat,lng,description,imageurl,rating,dlink));

        lat = 40.7483333;
        lng = -73.9697222;
        description = "This park by the East River and the FDR Drive has one mini-sized full court and two half courts that are beautifully paved. Beware of the half courts if you value your basketball, the fence protecting your ball from bouncing into the FDR Drive or East River isn't very high. ";
        imageurl = "http://www.dermandar.com/p/apxWEi";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord=40.7483333%2C-73.9697222&endname=Robert%20Moses%20Playground";
        courtsList.add(createCourt("ROBERT MOSES PLAYGROUND",lat,lng,description,imageurl,rating,dlink));

        lat = 40.8136111;
        lng = -73.93861112;
        description = "Its not quite a regulation full-court, but you'll enjoy running on the perfectly paved and painted courts and shooting on the plexiglass backboards and rims with nets.";
        imageurl = "http://www.dermandar.com/p/aMskth";
        rating = 7;
        dlink = "https://citymapper.com/directions?endcoord=40.8136111%2C-73.9386111&endname=Howard%20Bennet%20Playground";
        courtsList.add(createCourt("HOWARD BENNETT PLAYGROUND",lat,lng,description,imageurl,rating,dlink));

        lat = 40.8122222;
        lng = -73.9375;
        description = "Bring your A-game to this court, which has hundreds of spectator seats all around. Its going to be hard to squeeze in a pick-up game with so many league games, but if you can get on it is one of the best courts in the city to play on.";
        imageurl = "http://www.dermandar.com/p/djFjrn";
        rating = 8;
        dlink = "https://citymapper.com/directions?endcoord=40.8122222%2C-73.9375&endname=Abraham%20Lincoln%20Court";
        courtsList.add(createCourt("ABRAHAM LINCOLN COURT",lat,lng,description,imageurl,rating,dlink));

        lat = 40.8094444;
        lng = -73.9386111;
        description = "Theres one mini-full court and two halfcourt hoops all without a 3 point line or out of bounds line. A nice quiet court to work on your game by yourself.";
        imageurl = "http://www.dermandar.com/p/diextv";
        rating = 5;
        dlink = "https://citymapper.com/directions?endcoord=40.8094444%2C-73.9386111&endname=Moore%20Playground";
        courtsList.add(createCourt("MOORE PLAYGROUND",lat,lng,description,imageurl,rating,dlink));

        lat = 40.803232;
        lng = -73.943117;
        description = "The court quality is barely above average but this spot gets extra points for its plentiful shade and quick pick up games.";
        imageurl = "http://www.dermandar.com/p/ekWErp";
        rating = 7;
        dlink = "https://citymapper.com/directions?endcoord=40.803232%2C-73.943117&endname=Marcus%20Garvey%20Playground";
        courtsList.add(createCourt("MARCUS GARVEY PLAYGROUND",lat,lng,description,imageurl,rating,dlink));

        lat = 40.804333;
        lng = -73.931956;
        description = "Crack may be wack, but these courts are dope! Three perfectly paved mini-full courts and a regulation sized full court. Would be a perfect court if not for the lack of shade, lack of nets on the hoops and its fume-sucking location between a Triboro Bridge onramp and offramp.";
        imageurl = "http://www.dermandar.com/p/aZSoIw";
        rating = 7;
        dlink = "https://citymapper.com/directions?endcoord=40.804333%2C-73.931956&endname=Crack%20is%20Wack%20Playground";
        courtsList.add(createCourt("CRACK IS WACK PLAYGROUND",lat,lng,description,imageurl,rating,dlink));

        lat = 40.799803;
        lng = -73.934236;
        description = "Hidden between a soccer field and a building, this court is hard to find and not worth your time. There is one rickety hoop on an uneven and unpaved surface.";
        imageurl = "http://www.dermandar.com/p/enQixg";
        rating = 3;
        dlink = "https://citymapper.com/directions?endcoord=40.799803%2C-73.934236&endname=Robert%20Wagner%20Playground";
        courtsList.add(createCourt("ROBERT WAGNER PLAYGROUND",lat,lng,description,imageurl,rating,dlink));

        lat = 40.797324;
        lng = -73.931159;
        description = "Theres four half-courts here but they are too jammed close together for them all to be used at once. The plexiglass backboards are a nice touch but the shadeless schoolyard atmosphere... not so much";
        imageurl = "http://www.dermandar.com/p/dZdGJF";
        rating = 5;
        dlink = "https://citymapper.com/directions?endcoord=40.797324%2C-73.931159&endname=120th%20&%20FDR";
        courtsList.add(createCourt("120th & FDR",lat,lng,description,imageurl,rating,dlink));

        lat = 40.797282;
        lng = -73.935741;
        description = "This schoolyard playground has plenty of courts to choose from with one mini-full court and three half courts";
        imageurl = "http://www.dermandar.com/p/ejrqpE";
        rating = 5;
        dlink = "https://citymapper.com/directions?endcoord=40.797282%2C-73.935741&endname=PS155%20Playground";
        courtsList.add(createCourt("PS155 PLAYGROUND",lat,lng,description,imageurl,rating,dlink));

        lat = 40.797261;
        lng = -73.942097;
        description = "A nice, simple, uneven, undersized but shaded full court.";
        imageurl = "http://www.dermandar.com/p/cQHmdM";
        rating = 4.5;
        dlink = "https://citymapper.com/directions?endcoord=40.797261%2C-73.942097&endname=James%20Weldon%20Johnson%20Playground";
        courtsList.add(createCourt("JAMES WELDON JOHNSON",lat,lng,description,imageurl,rating,dlink));

        lat = 40.736049;
        lng = -73.981893;
        description = "An hard, rugged concrete yard with a kickball diamond and FIVE hoops to get buckets on!";
        imageurl = "http://www.dermandar.com/p/dIpvFM";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord=40.736049%2C-73.981893&endname=Peter's%20Field";
        courtsList.add(createCourt("PETER'S FIELD",lat,lng,description,imageurl,rating,dlink));

        lat = 40.735585;
        lng = -73.982263;
        description = "The panorama found in the court viewer was taken when it was under construction and was blocked off. Theres a full court with two hoops place right on the court's side lines. Step into the cage and show off your game. ";
        imageurl = "http://www.dermandar.com/p/dyhnrO";
        rating = 6.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=AUGUSTUS%20ST%20GAUDENS";
        courtsList.add(createCourt("AUGUSTUS ST GAUDENS",lat,lng,description,imageurl,rating,dlink));


        lat = 40.726709;
        lng = -73.980807;
        description = "Welcome to the LES, these courts embody the spirit of the neighborhood well with its cracked floors, and old and faded paint job. Theres one full court and half courts in the northeast and norwest corner of the park.";
        imageurl = "http://www.dermandar.com/p/aSRYGl";
        rating = 6.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Tompkins%20Square%20Park";
        courtsList.add(createCourt("Tompkins Square Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.725312;
        lng = -73.975149;
        description = "Welcome to the dark side of New York. We ballin' up in the hood now so dont leave your belongings unattended if you come here. These courts and rims are old and beat up, but theres a bunch of young neighborhood teens who ball out here which make for some interesting games. During a hot summer day you can cool off by jumping into the public pool next doors!";
        imageurl = "http://www.dermandar.com/p/cTGiZb";
        rating = 4.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Dry%20Dock%20Playground";
        courtsList.add(createCourt("Dry Dock Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.724852;
        lng = -73.972331;
        description = "A regulation sized full court and a half court right behind it. The metal rims give it that old school city feel to the court and being next to the FDR gives you great views of Brooklyn and Queens along with that fishy breeze from the East River.";
        imageurl = "http://www.dermandar.com/p/bFncjh";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=East%20River%20Park";
        courtsList.add(createCourt("East River Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.717079;
        lng = -73.977259;
        description = "This charmless mini full court tucked in the middle of public housing has hoops that are double-rimmed. Theres a large field for baseball and soccer right next door too.";
        imageurl = "http://www.dermandar.com/p/bNekXM";
        rating = 4;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Baruch%20Playground";
        courtsList.add(createCourt("Baruch Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.719330;
        lng = -73.980775;
        description = "One of the best places to play basketball on the LES. This quiet, walled-in park with a pool, has two nicely paved full courts with plexi glass rims.";
        imageurl = "http://www.dermandar.com/p/bRaDof";
        rating = 7.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Hamilton%20Fish%20Park";
        courtsList.add(createCourt("Hamilton Fish Park",lat,lng,description,imageurl,rating,dlink));



    }

    private HashMap createCourt (String name, double lat, double lng, String description,String imageurl, double rating, String dlink) {
        HashMap court = new HashMap();
        court.put("name", name);
        court.put("lat",lat);
        court.put("lng",lng);
        court.put("description", description);
        court.put("imageurl",imageurl);
        court.put("rating", rating);
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
