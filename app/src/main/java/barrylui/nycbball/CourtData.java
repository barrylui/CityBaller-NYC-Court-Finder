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

        lat = 40.721653;
        lng = -73.986029;
        description = "Two half courts jammed into a kid's playground. One court is placed too close to a fence making the right corner 3 impossible. A typical court on a playground, Unpaved floors and old metal rims.";
        imageurl = "http://www.dermandar.com/p/aBgKdm";
        rating = 4;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=ABC%20Playground";
        courtsList.add(createCourt("ABC Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.724087;
        lng = -73.985760;
        description = "An ordinary school yard with two full courts. The paved floors are fading and the ground has this layer of dust that accumulates on your ball as you bounce it more and more here.";
        imageurl = "http://www.dermandar.com/p/buyUKk";
        rating = 5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=McKinley%20Playground";
        courtsList.add(createCourt("McKinley Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.723416;
        lng = -73.989270;
        description = "A basketball hoop in a handball court? Good luck trying to shoot around or running a game while there are handballs flying around";
        imageurl = "http://www.dermandar.com/p/dlYvcK";
        rating = 3.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=First%20Park";
        courtsList.add(createCourt("First Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.722127;
        lng = -73.991368;
        description = "Two full courts with plexi glass backboards and nice rims. The court is beautifully paved too. One of the nicest courts on the LES. Did I mention there are more of the same type of courts on the park's south end?";
        imageurl = "http://www.dermandar.com/p/etOzOL";
        rating = 7.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sara%20D%20Roosevelt%20North";
        courtsList.add(createCourt("Sara D Roosevelt North",lat,lng,description,imageurl,rating,dlink));

        lat = 40.722104;
        lng = -73.991391;
        description = "Adequete full courts with plexi glass. The courts of fine but out of the three courts in Sara D Roosevelt, this is the least charming. Why play here when there are better options down the block?";
        imageurl = "http://www.dermandar.com/p/dIgudx";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sara%20D%20Roosevelt%20Middle";
        courtsList.add(createCourt("Sara D Roosevelt Middle",lat,lng,description,imageurl,rating,dlink));

        lat = 40.717539;
        lng = -73.993698;
        description = "One of the most enjoyable places to play ball in Chinatown. Theres shade and pick up games for every skill level imaginable, not to mention cheap Chinese food a half-court shot away.";
        imageurl = "http://www.dermandar.com/p/cKQDMA";
        rating = 8.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sara%20D%20Roosevelt%20South";
        courtsList.add(createCourt("Sara D Roosevelt South",lat,lng,description,imageurl,rating,dlink));

        lat = 40.725204;
        lng = -74.002668;
        description = "Theres only one court and its on a handball court. Meh.";
        imageurl = "http://www.dermandar.com/p/buhncO";
        rating = 3.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Vesuvio%20Playground";
        courtsList.add(createCourt("Vesuvio Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.721675;
        lng = -73.996134;
        description = "I can't help but to get prison court vibes with the concrete walls surrounding this half court. Cool spot to play around with your buddies, but not so much for good pick up games.";
        imageurl = "http://www.dermandar.com/p/dJvUOJ";
        rating = 4.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=DeSalvio%20Playground";
        courtsList.add(createCourt("DeSalvio Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.714357;
        lng = -73.999786;
        description = "Another hotspot for Chinatown basketball. There's one full court and a half court on one-side of the park. The half court by the full court isn't on a flat level ground. Theres three half courts on the other side too.";
        imageurl = "http://www.dermandar.com/p/dLYKfe";
        rating = 8.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=DeSalvio%20Playground";
        courtsList.add(createCourt("DeSalvio Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.717048;
        lng = -74.012039;
        description = "Simple park with one full court and one half court. Well-paved, plexi glass rims, a good spot to run a couple of pick up games. If only there were a little shade";
        imageurl = "http://www.dermandar.com/p/eiCowx";
        rating = 8;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Washington%20Square%20Park";
        courtsList.add(createCourt("Washington Square Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.791042;
        lng = -73.959792;
        description = "Ballin in Central Park! These crowded courts close around 5-6pm so get there early if you want to run a couple of games. 3 Full courts with small backboards and adequete rims.";
        imageurl = "http://www.dermandar.com/p/dqhbqE";
        rating = 8;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=North%20Meadow";
        courtsList.add(createCourt("North Meadow",lat,lng,description,imageurl,rating,dlink));

        lat = 40.787329;
        lng = -73.947064;
        description = "Three beautifully paved full-courts with solid backboards and rims. The trees surrounding the park provides lots of shades too! One of the best places to ball in the neighborhood.";
        imageurl = "http://www.dermandar.com/p/abgMlp";
        rating = 8;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Cherry%20Tree";
        courtsList.add(createCourt("Cherry Tree",lat,lng,description,imageurl,rating,dlink));

        lat = 40.788594;
        lng = -73.944313;
        description = "Located at the edge of East Harlem. Theres two decent full-courts with fading floor paint";
        imageurl = "http://www.dermandar.com/p/dJAtSA";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Blake%20Hobbs%20Playground";
        courtsList.add(createCourt("Blake Hobbs Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.791707;
        lng = -73.945810;
        description = "Two well-paved and regulation sized full-courts. The windowless building next to the court can be a little depressing but it provides a nice wall to practice your passing.";
        imageurl = "http://www.dermandar.com/p/csCbXQ";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=White%20Playground";
        courtsList.add(createCourt("White Playground",lat,lng,description,imageurl,rating,dlink));



        lat = 40.792744;
        lng = -73.943283;
        description = "Two ordinary full-courts with decent rims. Seems adequete at first glance but upon closer inspection, the floors are not level and sloped. If you can ignore the sloped floors and busy Third Avenue Traffic this court will suit you just fine.";
        imageurl = "http://www.dermandar.com/p/anIKBa";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Poor%20Richards";
        courtsList.add(createCourt("Poor Richards",lat,lng,description,imageurl,rating,dlink));

        lat = 40.793336;
        lng = -73.933957;
        description = "Two well-paved, regulation sized courts with endless amounts of shade. This park has a nice ambiance to it with the FDR Drive, nearby pool, little league games and barbecues.";
        imageurl = "http://www.dermandar.com/p/aoNtyj";
        rating = 8;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Thomas%20Jefferson%20Park";
        courtsList.add(createCourt("Thomas Jefferson Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.789285;
        lng = -73.938003;
        description = "You got the bare minimum here with two small un-paved courts, both without three-point lines.  Its nice and quiet here by the FDR but you can't help but to get some prison yard vibes with all the fences depressing backdrop.";
        imageurl = "http://www.dermandar.com/p/emdoyD";
        rating = 5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=East%20River%20Playground";
        courtsList.add(createCourt("East River Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.786973;
        lng = -73.939105;
        description = "A full court with three half courts. Playing on the cracked pavement sucks and so do these old crickety metal backboards and rims.";
        imageurl = "http://www.dermandar.com/p/cAXapq";
        rating = 4;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Playground%20103%20CIII";
        courtsList.add(createCourt("Playground 103 CIII",lat,lng,description,imageurl,rating,dlink));

        lat = 40.783305;
        lng = -73.944172;
        description = "A rugged city court located right at the edge of the UES. The backboards and rims are old. Theres a lot of noise and fumes coming from the idling cars waiting to enter and exit the FDR Drive.";
        imageurl = "http://www.dermandar.com/p/araTdd";
        rating = 5.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Stanley%20Isaacs%20Court";
        courtsList.add(createCourt("Stanley Isaacs Court",lat,lng,description,imageurl,rating,dlink));

        lat = 40.785359;
        lng = -73.950983;
        description = "Right next to the 6 train, this court is one of the best places to ball on the Upper East Side. There's a mini full court and three half courts, all beautifully paved with nice hoops and nets. ";
        imageurl = "http://www.dermandar.com/p/ayiHGi";
        rating = 8.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Samuel%20Seabury%20Playground";
        courtsList.add(createCourt("Samuel Seabury Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.773998;
        lng = -73.944113;
        description = "A mini-sized full court and a half court to get some pick up games in. The trees surrounding the park give plenty of shade! This court is located in one of the city's prettiest parks with the breeze and views of the East River.";
        imageurl = "http://www.dermandar.com/p/ayiHGi";
        rating = 8.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Carl%20Shurz%20Park";
        courtsList.add(createCourt("Carl Shurz Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.768964;
        lng = -73.949768;
        description = "A friendly neighborhood park on the Upper East Side. These courts don't have a three point line but at least theres a pool next door to cool down after some games.";
        imageurl = "http://www.dermandar.com/p/cLnSnV";
        rating = 5.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=John%20Jay%20Park";
        courtsList.add(createCourt("John Jay Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.765319;
        lng = -73.958963;
        description = "This yard almost has it all with walls to play hand ball, lanes for track, trees for shade, benches to rest on..... theres no full courts here though. There are six well-paved half courts here to run some 3 on 3s or 4 on 4s.";
        imageurl = "http://www.dermandar.com/p/eMRQSq";
        rating = 7;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=St%20Catherines%20Park";
        courtsList.add(createCourt("St Catherine's Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.759565;
        lng = -73.958566;
        description = "Theres a mini full court here except theres also a half court hoop right at half court. Good luck running some full court games if someone decides to play on the court convienently placed right at the full court's half court line.";
        imageurl = "http://www.dermandar.com/p/dyQdzg";
        rating = 5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Twenty-Four%20Sycamores%20Park";
        courtsList.add(createCourt("Twenty-Four Sycamores Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.759488;
        lng = -73.997136;
        description = "One full court with nice rims and a well-paved playing surface. Theres a nice ambiance here with the school yard mural and trees. If you sign up to be a NYC Parks & Rec member, there are some beautiful indoor courts inside the Rec building right next door.";
        imageurl = "http://www.dermandar.com/p/dyQdzg";
        rating = 6.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Alfred%20E%20Smith%20Playground";
        courtsList.add(createCourt("Alfred E Smith Playground",lat,lng,description,imageurl,rating,dlink));


        lat = 40.710174;
        lng = -73.994851;
        description = "An old neighborhood playground. Theres three old full courts here with cracked pavement and an ancient paint job that is almost completely faded away.";
        imageurl = "http://www.dermandar.com/p/cSTuOk";
        rating = 4.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Martin%20F%20Tanahey%20Playground";
        courtsList.add(createCourt("Martin F Tanahey Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.715722;
        lng = -73.989122;
        description = "An all purpose yard with seven half courts, walls for handball in one corner, tennis courts in the center and track lanes all around. You'll need a higher arc on your shot because of the hoops are double rimmed.";
        imageurl = "http://www.dermandar.com/p/bqantM";
        rating = 7;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Seward%20Park";
        courtsList.add(createCourt("Seward Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.711383;
        lng = -73.986416;
        description = "A full court with two half courts. Theres something off about the full court. Whoever did the paint job here did not get the dimensions right. The free-throw line here isnt placed right and neither is the three point line.";
        imageurl = "http://www.dermandar.com/p/cSkthk";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Cherry%20Clinton%20Playground";
        courtsList.add(createCourt("Cherry Clinton Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.712355;
        lng = -73.988366;
        description = "A nice place to play ball. There's two full courts that have plenty of shade. The only bad thing about this court are the cracked and uneven floors.";
        imageurl = "http://www.dermandar.com/p/aSYflE";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Little%20Flower%20Playground";
        courtsList.add(createCourt("Little Flower Playground",lat,lng,description,imageurl,rating,dlink));


        lat = 40.714475;
        lng = -73.983783;
        description = "Two hoops on a well-paved surface with painted lanes and three point lines.";
        imageurl = "http://www.dermandar.com/p/bEejBc";
        rating =6.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sol%20Lain%20Playground";
        courtsList.add(createCourt("Sol Lain Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.714075;
        lng = -73.981421;
        description = "An awesome spot for pick up games. Theres one regulation sized full court and two smaller full courts. Theres somme long straight cracks but the floors are decently paved for the most part.";
        imageurl = "http://www.dermandar.com/p/crruCW";
        rating = 7;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Henry%20%M%20Jackson%20Playground";
        courtsList.add(createCourt("Henry M Jackson Playground",lat,lng,description,imageurl,rating,dlink));


        lat = 40.715164;
        lng = -73.979702;
        description = "A school-yard park with four hoops. You can unlesh your inner Blake Griffin here with one of the hoops being only 9 feet tall.";
        imageurl = "http://www.dermandar.com/p/chgNRD";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sidney%20Hillman%20Playground";
        courtsList.add(createCourt("Sidney Hamilton Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.715911;
        lng = -73.982036;
        description = "Not the best place to run some pick up games. The rims here are old and crooked. The paint job is almost entirely faded, making the free throw line almost invisible. The trains passing on the Willamsburg Bridge are really loud too.";
        imageurl = "http://www.dermandar.com/p/cBtpUe";
        rating = 4;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Luther%20Gulick%20Playground";
        courtsList.add(createCourt("Luther Gulick Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.846762;
        lng = -73.940569;
        description = "Two half courts with only the lane and free throw painted. There's no three point line here but there is shade here";
        imageurl = "http://www.dermandar.com/p/aulrrp";
        rating = 3.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Jay%20Hood%20Wright%20Park";
        courtsList.add(createCourt("Jay Hood Wright Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.859626;
        lng = -73.934762;
        description = "This park on the northern tip of Manhattan has three hoops. One mini full court thats nicely paved and a half court right behind it.";
        imageurl = "http://www.dermandar.com/p/agDpVT";
        rating = 6.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Fort%20Tryon%20Park";
        courtsList.add(createCourt("Fort Tryon Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.731235;
        lng = -74.000976;
        description = "New York's famous West 4th Courts, also known as the Cage. The tightly enclosed full-court is usually swarming with spectators from all sides. There's a ton of league games being played here so it may be hard to get on the court, but if you do you better make sure you can hold your own against the skill level or risk getting embarrassed.";
        imageurl = "http://www.dermandar.com/p/cWHUWp";
        rating = 9;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=W%204th%20Courts";
        courtsList.add(createCourt("West 4th Courts",lat,lng,description,imageurl,rating,dlink));

        lat = 40.739087;
        lng = -74.004879;
        description = "This enormous yard has four half courts here. This is more of a place for kids to run around and not a place for good pick up games.";
        imageurl = "http://www.dermandar.com/p/dmaPTV";
        rating = 4;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Corp%20Seravalli%20Playground";
        courtsList.add(createCourt("Corp Seravalli Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.741816;
        lng = -74.002027;
        description = "One of the best places to go and hop on for pick up games in the West Village. The courts here are well-paved and are in good condition. ";
        imageurl = "http://www.dermandar.com/p/bQydMe";
        rating = 7;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Kelly%20Playground";
        courtsList.add(createCourt("Kelly Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.749864;
        lng = -74.000304;
        description = "A quiet full-court on the West Side thats paved and is in reasonable condition.";
        imageurl = "http://www.dermandar.com/p/arjCkt";
        rating = 5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Chelsea%20Park";
        courtsList.add(createCourt("Chelsea Park",lat,lng,description,imageurl,rating,dlink));

        lat = 40.747687;
        lng = -73.998878;
        description = "Two full courts with three point lines and a nice paved surface. Solid place to ball with a group of friends.";
        imageurl = "http://www.dermandar.com/p/etmwur";
        rating = 5.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Penn%20South%20Playground";
        courtsList.add(createCourt("Penn South Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.800009;
        lng = -73.950402;
        description = "Two full courts that are paved! Too bad the floor is cracked everywhere but at least theres a good crowd here. Solid spot to ball right above Central Park ";
        imageurl = "http://www.dermandar.com/p/cyjOZW";
        rating = 5.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Martin%20Luther%20Playground";
        courtsList.add(createCourt("Martin Luther Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.809932;
        lng = -73.940162;
        description = "This full court looks like its been recently paved. Theres a bunch of benches and a tree-line that provides plenty of shade. This spot is one of the best places to ball in the neighborhood if you can get on the court inbetween the organized league games.";
        imageurl = "http://www.dermandar.com/p/bNVBJl";
        rating = 7;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Martin%20Luther%20Playground";
        courtsList.add(createCourt("Courtney Callender Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.815629;
        lng = -73.937968;
        description = "A forgotten park. The rims are old and crickety, the painted lines are fading fast, theres trash laying around and theres a layer of dust and dirt on the ground that will make your ball dirtier every time it bounces. Very unimpressive";
        imageurl = "http://www.dermandar.com/p/agEfSX";
        rating = 3.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=William%20McCray%20Playground";
        courtsList.add(createCourt("William McCray Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.817024;
        lng = -73.939378;
        description = "A nice park with benches surrounding the court. The court is nicely paved and the rims and backboards are fine. Not a lot of people come here so it is a bit quiet. Not the best place to get a pick up game going.";
        imageurl = "http://www.dermandar.com/p/dGCfuP";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Fred%20Samuel%20Playground";
        courtsList.add(createCourt("Fred Samuel Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.818737;
        lng = -73.934751;
        description = "Four well paved full courts! Two full-sized full courts and two mini full courts, making it very easy to hop on and play or get next on any court. A nice spot to ball in if you're in the neighborhood";
        imageurl = "http://www.dermandar.com/p/aAPrZK";
        rating = 7;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Col%20Young%20Playground";
        courtsList.add(createCourt("Col Young Playground",lat,lng,description,imageurl,rating,dlink));


        lat = 40.821194;
        lng = -73.941556;
        description = "Two full-sized courts nicely colored in red and blue. The pick up games here are intense and you better come ready to play here or you might get crossed up.";
        imageurl = "http://www.dermandar.com/p/dxxrgE";
        rating = 6;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Renaissance%20Playground";
        courtsList.add(createCourt("Renaissance Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.825297;
        lng = -73.937259;
        description = "A mini full court enclosed by fences on 150th street. The floor here is paved and the rims here are okay.";
        imageurl = "http://www.dermandar.com/p/cOgKVr";
        rating = 4.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Bill%20Bojangles%20Playground";
        courtsList.add(createCourt("Bill Bojangles Playground",lat,lng,description,imageurl,rating,dlink));

        lat = 40.826003;
        lng = -73.934788;
        description = "Three mini full courts located right by the FDR Drive on 153rd. The paint job here is old and fading fast. Unimpressive but adequate";
        imageurl = "http://www.dermandar.com/p/dGfAiT";
        rating = 3.5;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Harlem%20Lane%20Playground";
        courtsList.add(createCourt("Harlem Lane Playground",lat,lng,description,imageurl,rating,dlink));


        lat = 40.829457;
        lng = -73.936449;
        description = "The world's most famous outdoor court in the world, the Rucker. It may be hard to get on the court in between league play but the regulation sized full court has a nice hardwood surface and the rims and backboard are as nice as it gets. There's seating and a huge scoreboard surrounding the court.";
        imageurl = "http://www.dermandar.com/p/dyjPhv";
        rating = 10;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Rucker%20Park";
        courtsList.add(createCourt("Rucker Park",lat,lng,description,imageurl,rating,dlink));


        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));


        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

        lat = ;
        lng = ;
        description = "";
        imageurl = "";
        rating = ;
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        courtsList.add(createCourt("Park Playground",lat,lng,description,imageurl,rating,dlink));

*/










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
