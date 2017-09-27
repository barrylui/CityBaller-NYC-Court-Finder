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
        String rating;
        boolean fullcourt;
        String dlink;
        int distance;

        courtsList = new ArrayList<Map<String, ?>>();

/*lut
        lat = 40.6875;
        lng = -73.9258333;
        description = "My court";
        imageurl = "http://graphics.wsj.com/brooklyn-best-and-worst-basketball-courts/img/reinaldo.jpg";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord=40.6875%2C-73.9258333&endname=Reinaldo%20Salgado%20Playground";
        distance = 0;
        courtsList.add(createCourt("Reinaldo Salgado Playground",lat,lng,description,imageurl,rating,dlink,distance));
*/
        lat = 40.8122222;
        lng = -73.9463889;
        description = "Two full courts with old backboards, faded lines and crooked rims, Go across the street to the South park for better courts ";
        imageurl = "http://www.dermandar.com/p/cnVCRl";
        rating = "3";
        dlink = "https://citymapper.com/directions?endcoord=40.8122222%2C-73.9463889&endname=St%20Nicholas%20Playground%20North";
        distance = 0;
        courtsList.add(createCourt("St Nicholas Playground North",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.8111111;
        lng = -73.9472222;
        description = "Roadside location and apartment backdrop. Theres two full-courts & two half courts that are clearly marked and perfectly adequate";
        imageurl = "http://www.dermandar.com/p/avPmaY";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord=40.8111111%2C-73.9472222&endname=St%20Nicholas%20Playground%20South";
        distance = 0;
        courtsList.add(createCourt("St Nicholas Playground South",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.712323;
        lng = -73.997316;
        description = "Two full courts with a smooth playing surface right behind an elementary school.";
        imageurl = "http://www.dermandar.com/p/cqkfld";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord=40.712774%2C-73.991075&endname=Playground%20One";
        distance = 0;
        courtsList.add(createCourt("Playground One",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.711835;
        lng = -73.984256;
        description = "Two full-sized courts with a nice clean surface that makes your sneakers squeak with every cut you make. The rims are double-rimmed, make sure you have enough arc on your shot";
        imageurl = "http://www.dermandar.com/p/bmfiQp";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord=40.711835%2C-73.984256&endname=Lillian%20D%20Wald%20Playground";
        distance = 0;
        courtsList.add(createCourt("Lillian D Wald Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.730348;
        lng = -73.973605;
        description = "Located by the FDR Drive, this quiet court has a mini-sized full-court with double rims and a missing 3-pt line.";
        imageurl = "http://www.dermandar.com/p/dVKsDz";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord=40.730348%2C-73.973605&endname=Murphy%20Brother's%20Playground";
        distance = 0;
        courtsList.add(createCourt("Murphy's Brother Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.7368811;
        lng = -73.9756617;
        description = "A full-sized full court. There are some metal covers on the court for some reason";
        imageurl = "http://www.dermandar.com/p/bSFNBo";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord=40.7368811%2C-73.9756617&endname=Asser%20Levy%20Playground";
        distance = 0;
        courtsList.add(createCourt("Asser Levy Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.7397222;
        lng = -73.9783333;
        description = "Four hoops but the problem is two of the hoops are at the half-court of this full-court. The good news is there are plenty of trees for shade.";
        imageurl = "http://www.dermandar.com/p/bWybrF";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord=40.7397222%2C-73.9756617&endname=Bellevue%20South%20Park";
        distance = 0;
        courtsList.add(createCourt("Bellevue South Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.7453796;
        lng = -73.9740275;
        description = "A nice park for pick up games by the Midtown Tunnel. There is a nice well-paved court hourt and a half court for working on your game.";
        imageurl = "http://www.dermandar.com/p/dOHlsy";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord=40.7453796%2C-73.9740275&endname=St.%20Vartan%20Park";
        distance = 0;
        courtsList.add(createCourt("St. Vartan Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.7483333;
        lng = -73.9697222;
        description = "East River vibes. Beware of the half courts, the fence protecting your ball from bouncing into the FDR Drive or East River isn't very tall. ";
        imageurl = "http://www.dermandar.com/p/apxWEi";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord=40.7483333%2C-73.9697222&endname=Robert%20Moses%20Playground";
        distance = 0;
        courtsList.add(createCourt("Robert Moses Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.8136111;
        lng = -73.93861112;
        description = "Its not quite a regulation full-court, but you'll enjoy running on the perfectly paved and painted courts and shooting on the plexiglass backboards and rims with nets.";
        imageurl = "http://www.dermandar.com/p/aMskth";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord=40.8136111%2C-73.9386111&endname=Howard%20Bennet%20Playground";
        distance = 0;
        courtsList.add(createCourt("Howard Bennet Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.8122222;
        lng = -73.9375;
        description = "It'll be hard to get on the court with so many league games. Bring your A-game to this court, this is where Streetball legends are made.";
        imageurl = "http://www.dermandar.com/p/djFjrn";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord=40.8122222%2C-73.9375&endname=Abraham%20Lincoln%20Court";
        distance = 0;
        courtsList.add(createCourt("Abraham Lincoln Court",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.8094444;
        lng = -73.9386111;
        description = "Theres a mini-full court and two halfcourt hoops, all without a 3 point line or out of bounds line.";
        imageurl = "http://www.dermandar.com/p/diextv";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord=40.8094444%2C-73.9386111&endname=Moore%20Playground";
        distance = 0;
        courtsList.add(createCourt("Moore Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.803232;
        lng = -73.943117;
        description = "The court quality is barely above average but this spot gets extra points for its plentiful shade and constant pick up games.";
        imageurl = "http://www.dermandar.com/p/ekWErp";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord=40.803232%2C-73.943117&endname=Marcus%20Garvey%20Playground";
        distance = 0;
        courtsList.add(createCourt("Marcus Garvey Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.804333;
        lng = -73.931956;
        description = "8 hoops, 3 full-sized full courts, 1 mini fullcourt. Loses points for the lack of shade, no nets and the abundance of noise and car fumes in the area.";
        imageurl = "http://www.dermandar.com/p/aZSoIw";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord=40.804333%2C-73.931956&endname=Crack%20is%20Wack%20Playground";
        distance = 0;
        courtsList.add(createCourt("Crack Is Wack Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.799803;
        lng = -73.934236;
        description = "Hidden between a soccer field and a building, this court is hard to find and not worth your time.";
        imageurl = "http://www.dermandar.com/p/enQixg";
        rating = "3";
        dlink = "https://citymapper.com/directions?endcoord=40.799803%2C-73.934236&endname=Robert%20Wagner%20Playground";
        distance = 0;
        courtsList.add(createCourt("Robert Wagner Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.797324;
        lng = -73.931159;
        description = "Four half-courts that are too jammed too close together. The plexiglass backboards are a nice touch but the shadeless schoolyard atmosphere... not so much";
        imageurl = "http://www.dermandar.com/p/dZdGJF";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord=40.797324%2C-73.931159&endname=120th%20&%20FDR";
        distance = 0;
        courtsList.add(createCourt("120TH & FDR",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.797282;
        lng = -73.935741;
        description = "Simple school yard playground, a mini-full court and three half courts";
        imageurl = "http://www.dermandar.com/p/ejrqpE";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord=40.797282%2C-73.935741&endname=PS155%20Playground";
        distance = 0;
        courtsList.add(createCourt("PS155 Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.797261;
        lng = -73.942097;
        description = "A nice, simple, uneven, undersized but shaded full court.";
        imageurl = "http://www.dermandar.com/p/cQHmdM";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord=40.797261%2C-73.942097&endname=James%20Weldon%20Johnson%20Playground";
        distance = 0;
        courtsList.add(createCourt("James Weldon Johnson",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.736049;
        lng = -73.981893;
        description = "five hoops to get buckets on in large yard";
        imageurl = "http://www.dermandar.com/p/dIpvFM";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord=40.736049%2C-73.981893&endname=Peter's%20Field";
        distance = 0;
        courtsList.add(createCourt("PETER'S FIELD",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.726709;
        lng = -73.980807;
        description = "Cracked floors, faded paint job. Theres one full court and half courts in the northeast and norwest corner of the park.";
        imageurl = "http://www.dermandar.com/p/aSRYGl";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Tompkins%20Square%20Park";
        distance = 0;
        courtsList.add(createCourt("Tompkins Square Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.725312;
        lng = -73.975149;
        description = "The courts and rims are old and beat up. During a hot summer day you can cool off by jumping into the public pool next door!";
        imageurl = "http://www.dermandar.com/p/cTGiZb";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Dry%20Dock%20Playground";
        distance = 0;
        courtsList.add(createCourt("Dry Dock Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.724852;
        lng = -73.972331;
        description = "East River vibes with stunning views of Brooklyn & Queens. The regulation sized full court and a half court are nice too.";
        imageurl = "http://www.dermandar.com/p/bFncjh";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=East%20River%20Park";
        distance = 0;
        courtsList.add(createCourt("East River Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.717079;
        lng = -73.977259;
        description = "This charmless mini full court tucked in the middle of public housing has hoops that are double-rimmed.";
        imageurl = "http://www.dermandar.com/p/bNekXM";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Baruch%20Playground";
        distance = 0;
        courtsList.add(createCourt("Baruch Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.719330;
        lng = -73.980775;
        description = "One of the best places to play basketball on the LES. This quiet, walled-in park with a pool, has two nicely paved full courts with plexi glass rims.";
        imageurl = "http://www.dermandar.com/p/bRaDof";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Hamilton%20Fish%20Park";
        distance = 0;
        courtsList.add(createCourt("Hamiltion Fish Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.721653;
        lng = -73.986029;
        description = "Two half courts jammed onto a kid's playground. One court is placed too close to a fence making the right corner 3 impossible. Unpaved floors and old metal rims.";
        imageurl = "http://www.dermandar.com/p/aBgKdm";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=ABC%20Playground";
        distance = 0;
        courtsList.add(createCourt("ABC Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.724087;
        lng = -73.985760;
        description = "An ordinary school yard with two full courts. The ground has a thick layer of dust that sticks to the ball and your hands.";
        imageurl = "http://www.dermandar.com/p/buyUKk";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=McKinley%20Playground";
        distance = 0;
        courtsList.add(createCourt("McKinley Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.723416;
        lng = -73.989270;
        description = "A basketball hoop in a handball court? Good luck trying to shoot around or running a game while there are handballs flying around";
        imageurl = "http://www.dermandar.com/p/dlYvcK";
        rating = "3";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=First%20Park";
        distance = 0;
        courtsList.add(createCourt("First Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.722127;
        lng = -73.991368;
        description = "Two full courts nicely paved with plexi glass backboards & nice rims. There's more of the same type of courts on the park's south end.";
        imageurl = "http://www.dermandar.com/p/etOzOL";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sara%20D%20Roosevelt%20North";
        distance = 0;
        courtsList.add(createCourt("Sara D Roosevelt Park N",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.722104;
        lng = -73.991391;
        description = "full courts with plexi glass. Worse of the 3 courts nearby. Why play here when there are better options down the block?";
        imageurl = "http://www.dermandar.com/p/dIgudx";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sara%20D%20Roosevelt%20Middle";
        distance = 0;
        courtsList.add(createCourt("Sara D Roosevelt M",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.717539;
        lng = -73.993698;
        description = "THE Chinatown spot for basketball. Theres shade and pick up games for every skill level imaginable, not to mention cheap Chinese food a half-court shot away.";
        imageurl = "http://www.dermandar.com/p/cKQDMA";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Hester%20Street%20Playground";
        distance = 0;
        courtsList.add(createCourt("Hester Street Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.722326;
        lng =  -74.005015;
        description = "Mini full court thats well paved and has plexi glass backboards. Too bad its right next to the busy Sixth Avenue traffic.";
        imageurl = "http://www.dermandar.com/p/dEoKzU";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Grand%20Canal%20Court";
        distance = 0;
        courtsList.add(createCourt("Grand Canal Court",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.725204;
        lng = -74.002668;
        description = "Theres only one court and its on a handball court. Meh.";
        imageurl = "http://www.dermandar.com/p/buhncO";
        rating = "3";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Vesuvio%20Playground";
        distance = 0;
        courtsList.add(createCourt("Vesuvio Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.721675;
        lng = -73.996134;
        description = "Quiet spot to play work on your game or play with your buddies, not so much for random good pick up games.";
        imageurl = "http://www.dermandar.com/p/dJvUOJ";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=DeSalvio%20Playground";
        distance = 0;
        courtsList.add(createCourt("Desalvio Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.714357;
        lng = -73.999786;
        description = "One full court and a half court on one-side of the park. The half court by the full court isn't on a flat level ground. There's 3 half courts closeby too.";
        imageurl = "http://www.dermandar.com/p/dLYKfe";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Columbus%20Park";
        distance = 0;
        courtsList.add(createCourt("Columbus Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.715067;
        lng = -74.000053;
        description = "One full court and a half court on one-side of the park. The half court isn't on a flat level ground and is slanted. Theres three half courts down the block past the jungle gym..";
        imageurl = "http://www.dermandar.com/p/dQuqjt";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Columbus%20Park";
        distance = 0;
        courtsList.add(createCourt("Columbus Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.717048;
        lng = -74.012039;
        description = "Simple park with one full court and one half court. Well-paved, plexi glass rims, a good spot to run a couple of pick up games. If only there were a little shade.";
        imageurl = "http://www.dermandar.com/p/eiCowx";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Washington%20Square%20Park";
        distance = 0;
        courtsList.add(createCourt("Washing Square Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.791042;
        lng = -73.959792;
        description = "Ballin in Central Park! These crowded courts close around 5-6pm so get there early if you want to run a couple.";
        imageurl = "http://www.dermandar.com/p/dqhbqE";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=North%20Meadow";
        distance = 0;
        courtsList.add(createCourt("North Meadow",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.787329;
        lng = -73.947064;
        description = "Three beautifully paved full-courts with solid backboards and rims. The trees surrounding the park provides lots of shades too!";
        imageurl = "http://www.dermandar.com/p/abgMlp";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Cherry%20Tree";
        distance = 0;
        courtsList.add(createCourt("Cherry Tree",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.788594;
        lng = -73.944313;
        description = "Located at the edge of East Harlem. Theres two decent full-courts with fading floor paint";
        imageurl = "http://www.dermandar.com/p/dJAtSA";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Blake%20Hobbs%20Playground";
        distance = 0;
        courtsList.add(createCourt("Blake Hobbs Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.791707;
        lng = -73.945810;
        description = "Two well-paved and regulation sized full-courts. The windowless building next to the court can be a little depressing but it provides a nice wall to practice your passing.";
        imageurl = "http://www.dermandar.com/p/csCbXQ";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=White%20Playground";
        distance = 0;
        courtsList.add(createCourt("White Playground",lat,lng,description,imageurl,rating,dlink,distance));



        lat = 40.792744;
        lng = -73.943283;
        description = "Two full-courts with decent rims. The floors are not level and sloped. If you can look past the sloped floors and busy Third Avenue traffic, this court will suit you just fine.";
        imageurl = "http://www.dermandar.com/p/anIKBa";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Poor%20Richards";
        distance = 0;
        courtsList.add(createCourt("Poor Richards",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.793336;
        lng = -73.933957;
        description = "Two well-paved, regulation sized courts with endless amounts of shade. This park has a nice ambiance to it with the FDR Drive, nearby pool, little league games and barbecues.";
        imageurl = "http://www.dermandar.com/p/aoNtyj";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Thomas%20Jefferson%20Park";
        distance = 0;
        courtsList.add(createCourt("Thomas Jefferson Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.789285;
        lng = -73.938003;
        description = "The bare essentials are found here : 2 small unpaved and unpainted courts.";
        imageurl = "http://www.dermandar.com/p/emdoyD";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=East%20River%20Playground";
        distance = 0;
        courtsList.add(createCourt("East River Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.786973;
        lng = -73.939105;
        description = "A full court with three half courts. Playing on the cracked pavement sucks and so do these old crickety metal backboards and rims.";
        imageurl = "http://www.dermandar.com/p/cAXapq";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Playground%20103%20CIII";
        distance = 0;
        courtsList.add(createCourt("Playground 103 CIII",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.783305;
        lng = -73.944172;
        description = "Recently repaved and remodeled! Theres bright lights that turn on for night time hoops. Theres a 9 ft hoop here and some of the backboards are crooked.";
        imageurl = "http://www.dermandar.com/p/araTdd";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Stanley%20Isaacs%20Court";
        distance = 0;
        courtsList.add(createCourt("Stanley Isaacs Court",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.785359;
        lng = -73.950983;
        description = "There's a mini full court and three half courts, all beautifully paved with nice hoops and nets. ";
        imageurl = "http://www.dermandar.com/p/ayiHGi";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Samuel%20Seabury%20Playground";
        distance = 0;
        courtsList.add(createCourt("Samuel Seabury Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.773998;
        lng = -73.944113;
        description = "A mini-sized full court and a half court. Equipped with plenty of shade, this court is located in one of the city's prettiest parks with the breeze and views of the East River.";
        imageurl = "http://www.dermandar.com/p/eCArIW";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Carl%20Shurz%20Park";
        distance = 0;
        courtsList.add(createCourt("Carl Shurz Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.768964;
        lng = -73.949768;
        description = "A friendly neighborhood park on the Upper East Side. These courts don't have a three point line but at least theres a pool next door to cool down after some games.";
        imageurl = "http://www.dermandar.com/p/cLnSnV";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=John%20Jay%20Park";
        distance = 0;
        courtsList.add(createCourt("John Jay Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.765319;
        lng = -73.958963;
        description = "This yard almost has it all, hand ball courts, track lanes, trees for shade, benches to rest on... only thing missing are full courts. There are six well-paved half courts here.";
        imageurl = "http://www.dermandar.com/p/eMRQSq";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=St%20Catherines%20Park";
        distance = 0;
        courtsList.add(createCourt("St Catherine's Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.759565;
        lng = -73.958566;
        description = "Theres a mini full court here except theres also a half court hoop right at half court.";
        imageurl = "http://www.dermandar.com/p/dyQdzg";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Twenty-Four%20Sycamores%20Park";
        distance = 0;
        courtsList.add(createCourt("Twenty Four Sycamores Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.710378;
        lng = -73.997870;
        description = "One full court with nice rims and a well-paved playing surface. Theres a nice ambiance here with the school yard mural and trees.";
        imageurl = "http://www.dermandar.com/p/cluONm";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Alfred%20E%20Smith%20Playground";
        distance = 0;
        courtsList.add(createCourt("Alfred E Smith Playground",lat,lng,description,imageurl,rating,dlink,distance));


        lat = 40.710174;
        lng = -73.994851;
        description = "Three full courts, an old paint job and cracked floors. The middle full court are equipped with plexi glass backboards.";
        imageurl = "http://www.dermandar.com/p/cupJjP";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Martin%20F%20Tanahey%20Playground";
        distance = 0;
        courtsList.add(createCourt("Martin F Tanahey Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.715768;
        lng = -73.989136;
        description = "An all purpose yard with seven half courts. You'll need a higher arc on your shot because of the double rimmed hoops.";
        imageurl = "http://www.dermandar.com/p/dTetFo";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Seward%20Park";
        distance = 0;
        courtsList.add(createCourt("Seward Park",lat,lng,description,imageurl,rating,dlink,distance));



        lat = 40.714823;
        lng = -73.989013;
        description = "A sufficient full court. All the action is around the block at the other Seward Park courts.";
        imageurl = "http://www.dermandar.com/p/bqantM";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Seward%20Park";
        distance = 0;
        courtsList.add(createCourt("Seward Park East",lat,lng,description,imageurl,rating,dlink,distance));




        lat = 40.711383;
        lng = -73.986416;
        description = "A full court with two half courts. Dimensions of the court are wrong, the free-throw line here isnt placed right and neither is the three point line.";
        imageurl = "http://www.dermandar.com/p/cSkthk";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Cherry%20Clinton%20Playground";
        distance = 0;
        courtsList.add(createCourt("Cherry Clinton Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.712355;
        lng = -73.988366;
        description = "A nice place to play ball. There's two full courts that have plenty of shade. The only bad thing about this court are the cracked and uneven floors.";
        imageurl = "http://www.dermandar.com/p/aSYflE";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Little%20Flower%20Playground";
        distance = 0;
        courtsList.add(createCourt("Little Flower Playground",lat,lng,description,imageurl,rating,dlink,distance));


        lat = 40.714475;
        lng = -73.983783;
        description = "Two hoops on a well-paved surface with painted lanes and three point lines.";
        imageurl = "http://www.dermandar.com/p/bEejBc";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sol%20Lain%20Playground";
        distance = 0;
        courtsList.add(createCourt("Sol Lain Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.714075;
        lng = -73.981421;
        description = "Awesome spot for pick up games. One regulation sized full court and two smaller full courts. Theres some long straight cracks but the floors are decently paved for the most part.";
        imageurl = "http://www.dermandar.com/p/crruCW";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Henry%20%M%20Jackson%20Playground";
        distance = 0;
        courtsList.add(createCourt("Henry M Jackson Playground",lat,lng,description,imageurl,rating,dlink,distance));


        lat = 40.715164;
        lng = -73.979702;
        description = "A school-yard park with four hoops. You can unlesh your inner Blake Griffin here with one of the hoops being only 9 feet tall.";
        imageurl = "http://www.dermandar.com/p/chgNRD";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sidney%20Hillman%20Playground";
        distance = 0;
        courtsList.add(createCourt("Sidney Hillman Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.715911;
        lng = -73.982036;
        description = "Bad spot for pick up games. The rims are old and crooked. The paint job is almost entirely faded. Nearby train noises from the Williamsburg bridge can also be distracting..";
        imageurl = "http://www.dermandar.com/p/cBtpUe";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Luther%20Gulick%20Playground";
        distance = 0;
        courtsList.add(createCourt("Luther Gulick Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.846762;
        lng = -73.940569;
        description = "Two half courts with only the lane and free throw painted. There's no three point line here but there is shade here";
        imageurl = "http://www.dermandar.com/p/aulrrp";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Jay%20Hood%20Wright%20Park";
        distance = 0;
        courtsList.add(createCourt("Jay Hood Wright Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.859626;
        lng = -73.934762;
        description = "This park on the northern tip of Manhattan has three hoops. One mini full court thats nicely paved and a half court right behind it.";
        imageurl = "http://www.dermandar.com/p/agDpVT";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Fort%20Tryon%20Park";
        distance = 0;
        courtsList.add(createCourt("Fort Tyron Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.731235;
        lng = -74.000976;
        description = "New York's famous West 4th Courts, also known as the Cage is usually swarming with spectators. There's a ton of organized league games here, making it hard to get on the court.";
        imageurl = "http://www.dermandar.com/p/cWHUWp";
        rating = "9";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=W%204th%20Courts";
        distance = 0;
        courtsList.add(createCourt("West 4th Courts",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.739087;
        lng = -74.004879;
        description = "This enormous yard has four half courts here. This is more of a place for kids to run around and not a place for good pick up games.";
        imageurl = "http://www.dermandar.com/p/dmaPTV";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Corp%20Seravalli%20Playground";
        distance = 0;
        courtsList.add(createCourt("Corp Servalli Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.741816;
        lng = -74.002027;
        description = "One of the best places to go and hop on for pick up games in the West Village. The courts here are well-paved and are in good condition. ";
        imageurl = "http://www.dermandar.com/p/bQydMe";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Kelly%20Playground";
        distance = 0;
        courtsList.add(createCourt("Kelly Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.749864;
        lng = -74.000304;
        description = "A quiet full-court on the West Side thats paved and is in reasonable condition.";
        imageurl = "http://www.dermandar.com/p/arjCkt";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Chelsea%20Park";
        distance = 0;
        courtsList.add(createCourt("Chelsea Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.747687;
        lng = -73.998878;
        description = "Two full courts with three point lines and a nice paved surface. Solid place to ball with a group of friends.";
        imageurl = "http://www.dermandar.com/p/etmwur";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Penn%20South%20Playground";
        distance = 0;
        courtsList.add(createCourt("Penn South Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.800009;
        lng = -73.950402;
        description = "Two full courts that are paved! Too bad the floor is cracked everywhere but at least theres a good crowd here. Solid spot to ball right above Central Park ";
        imageurl = "http://www.dermandar.com/p/cyjOZW";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Martin%20Luther%20Playground";
        distance = 0;
        courtsList.add(createCourt("Martin Luther Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.809932;
        lng = -73.940162;
        description = "This spot is one of the best places to ball in the neighborhood if you can get on the court in between the organized league games.";
        imageurl = "http://www.dermandar.com/p/bNVBJl";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Martin%20Luther%20Playground";
        distance = 0;
        courtsList.add(createCourt("Courtney Callender Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.815629;
        lng = -73.937968;
        description = "A forgotten park. The rims are ancient and theres trash laying around everywhere. Theres a large layer of dirt and dust on the ground. Avoid this park at all costs.";
        imageurl = "http://www.dermandar.com/p/agEfSX";
        rating = "2";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=William%20McCray%20Playground";
        distance = 0;
        courtsList.add(createCourt("William Mccray Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.817024;
        lng = -73.939378;
        description = "A simple adequete court. Not the best place to get a pick up game going since it is usually pretty quiet here.";
        imageurl = "http://www.dermandar.com/p/dGCfuP";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Fred%20Samuel%20Playground";
        distance = 0;
        courtsList.add(createCourt("Fred Samuel Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.818737;
        lng = -73.934751;
        description = "Four well paved full courts! Two full-sized full courts and two mini full courts, making it very easy to get next on any court.";
        imageurl = "http://www.dermandar.com/p/aAPrZK";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Col%20Young%20Playground";
        distance = 0;
        courtsList.add(createCourt("Col Young Playground",lat,lng,description,imageurl,rating,dlink,distance));


        lat = 40.821194;
        lng = -73.941556;
        description = "Two full-sized courts nicely colored in red and blue. The pick up games here are intense and you better come ready to play here or you might get crossed up.";
        imageurl = "http://www.dermandar.com/p/dxxrgE";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Renaissance%20Playground";
        distance = 0;
        courtsList.add(createCourt("Renaissance Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.825297;
        lng = -73.937259;
        description = "A mini full court enclosed by fences on 150th street. The floor here is paved and the rims here are okay.";
        imageurl = "http://www.dermandar.com/p/cOgKVr";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Bill%20Bojangles%20Playground";
        distance = 0;
        courtsList.add(createCourt("Bill Bojangles Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.826003;
        lng = -73.934788;
        description = "Three mini full courts located right by the FDR Drive on 153rd. The paint job here is old and fading fast. Unimpressive but adequate";
        imageurl = "http://www.dermandar.com/p/dGfAiT";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Harlem%20Lane%20Playground";
        distance = 0;
        courtsList.add(createCourt("Harlem Lane Platground",lat,lng,description,imageurl,rating,dlink,distance));


        lat = 40.829457;
        lng = -73.936449;
        description = "The world's most famous court, the Rucker. Legends like Dr. J, Kobe & Wilt have played here. Everything about this court is top notch but the court is rarely available.";
        imageurl = "http://www.dermandar.com/p/dyjPhv";
        rating = "10";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Rucker%20Park";
        distance = 0;
        courtsList.add(createCourt("Rucker Park",lat,lng,description,imageurl,rating,dlink,distance));


        lat = 40.826726;
        lng = -73.940712;
        description = "This full court looks pretty good, its floors are well paved and not cracked. Unfortunately its pretty quiet here and not a court where you walk up and get next.";
        imageurl = "http://www.dermandar.com/p/bVxWCr";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Jackie%20Robinson%20Playground";
        distance = 0;
        courtsList.add(createCourt("Jackie Robinson Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.829465;
        lng = -73.944183;
        description = "8 hoops here! 1 mini-full court with a 3 pt line but unpainted. The other 6 baskets surround the court, making it easy to chase a rebound and shoot at a nearby hoop.";
        imageurl = "http://www.dermandar.com/p/bzpjrn";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Carmansville%20Playground";
        distance = 0;
        courtsList.add(createCourt("Carmansville Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.758946;
        lng = -73.991057;
        description = "An underated park to play ball at. Theres only 1 mini full court but the court is in pretty good shape and is the host of many pickup games.";
        imageurl = "http://www.dermandar.com/p/eWeHaz";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=McCaffrey%20Playground";
        distance = 0;
        courtsList.add(createCourt("McCaffrey Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.761517;
        lng = -73.989299;
        description = "This court has it all, plexi glass rims, painted floors and a busy pick up scene. If you're in the neighborhood this court is definately worth checking out.";
        imageurl = "http://www.dermandar.com/p/balWhW";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Ramon%20Aponte%20Park";
        distance = 0;
        courtsList.add(createCourt("Ramon Aponte Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.761479;
        lng = -73.992550;
        description = "This court has a strange full court that is weirdly narrow and the half courts are unmarked. Its pretty shady here and theres a wall to practice your passing.";
        imageurl = "http://www.dermandar.com/p/ejvHWo";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Matthew%20Palmer%20Playground";
        distance = 0;
        courtsList.add(createCourt("Matthew Palmer Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.763026;
        lng = -73.992644;
        description = "What you see is what you get : Two hoops and two free throw lines.";
        imageurl = "http://www.dermandar.com/p/brvBsK";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Hell's%20Kitchen%20Park";
        distance = 0;
        courtsList.add(createCourt("Hell's Kitchen Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.763499;
        lng = -73.990213;
        description = "Right in the heart of city in midtown Manhattan. Three full courts that need a new paint job.";
        imageurl = "http://www.dermandar.com/p/acwITT";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Guttenburg%20Playground";
        distance = 0;
        courtsList.add(createCourt("Guttenburg Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.768494;
        lng = -73.994867;
        description = "Jackpot!!! Get here now! Two full sized courts that are freshly painted, plexi glass rims and a lively pick-up scene.";
        imageurl = "http://www.dermandar.com/p/aNZrHP";
        rating = "9";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=De%20Witt%20Clinton%20Park";
        distance = 0;
        courtsList.add(createCourt("De Witt Clinton Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.773889;
        lng = -73.986811;
        description = "There's a full court here but only one hoop. At least the floor is nicely painted and the backboards are nice. Nothing much here though.";
        imageurl = "http://www.dermandar.com/p/cAGuyd";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Samuel%20Bennerson%20Playground";
        distance = 0;
        courtsList.add(createCourt("Samuel Bennerson Playground",lat,lng,description,imageurl,rating,dlink,distance));


        lat = 40.777221;
        lng = -73.983656;
        description = "There's one full court with a smooth surface. Great pick up scene here and a half-court that you can warm up at while you're waiting to get on next.";
        imageurl = "http://www.dermandar.com/p/cBUOIq";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sapolin%20Playground";
        distance = 0;
        courtsList.add(createCourt("Sapolin Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.783115;
        lng = -73.985023;
        description = "Two full courts and two half courts. The riverside vibes and shade give this busy park a nice touch";
        imageurl = "http://www.dermandar.com/p/cHkvpk";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Riverside%20Park";
        distance = 0;
        courtsList.add(createCourt("76th Street Riverside Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.781656;
        lng = -73.978272;
        description = "A quiet spot on the UWS equipped with three plexi glass backboards! Too bad they're too close to each other and there's no three-point line or people who play here. ";
        imageurl = "http://www.dermandar.com/p/ejDIVq";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Tecumseh%20Playground";
        distance = 0;
        courtsList.add(createCourt("Tecumseh Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.7895908;
        lng = -73.9689129;
        description = "The three point lines here are way too close. There's only two half hourts here in this unimpressive school yard.";
        imageurl = "http://www.dermandar.com/p/dhZNzJ";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sol%20Boom%20Playground";
        distance = 0;
        courtsList.add(createCourt("Sol Boom Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.795445;
        lng = -73.9689622;
        description = "Theres four high quality mini-sized full courts here. The skill level here in this busy park is pretty good here so bring your A game.";
        imageurl = "http://www.dermandar.com/p/ackLiq";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Happy%20Warrior%20Playground";
        distance = 0;
        courtsList.add(createCourt("Happy Warrior Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.796904;
        lng = -73.9683522;
        description = "This court can be an overlooked option with its unpainted and undersized full court, but the smooth surface and shady setting are it's redeeming qualities.";
        imageurl = "http://www.dermandar.com/p/bIOpWJ";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=X%20X%20Playground";
        distance = 0;
        courtsList.add(createCourt("Fredrick Douglas Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.799081;
        lng = -73.965878;
        description = "All six of these half courts are unpainted and unimpressive. The floor is also cracked in a bunch of different spots too.";
        imageurl = "http://www.dermandar.com/p/cQrjiB";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Bloomingdale%20Playground";
        distance = 0;
        courtsList.add(createCourt("Bloomingdale Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.801185;
        lng = -73.964057;
        description = "The paint is old and the floor is cracked but this mini sized full court is a solid option with its nice rims.";
        imageurl = "http://www.dermandar.com/p/asltur";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Booker%20T%20Washington%20Playground";
        distance = 0;
        courtsList.add(createCourt("Booker T. Washington Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.7823379;
        lng = -73.9651196;
        description = "Pick-up ball in the heart of the city! There's two mini size full courts here and plenty of shade.";
        imageurl = "http://www.dermandar.com/p/bRFDzN";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Great%20Lawn%20Courts";
        distance = 0;
        courtsList.add(createCourt("Great Lawn Courts",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.803084;
        lng =  -73.958850;
        description = "Theres so many things that suck about this court. Old rim, fading lines, unpainted and unfenced meaning you're going to chase a lot of long rebounds.";
        imageurl = "http://www.dermandar.com/p/brSrkK";
        rating = "3";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Morningside%20Park%20South";
        distance = 0;
        courtsList.add(createCourt("Morning Side Park South",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.803084;
        lng = -73.958850;
        description = "A quiet park with two full courts and one half court. There's an extra backboard here but it is missing a rim.";
        imageurl = "http://www.dermandar.com/p/cnIWbi";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Morningside%20Park%20Central";
        distance = 0;
        courtsList.add(createCourt("Morning Side Park M",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.811088;
        lng = -73.956017;
        description = "Three unremarkable mini full courts. The floors are cracked and faded. Meh.";
        imageurl = "http://www.dermandar.com/p/dMXYCV";
        rating = "3";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=PS125%20Playground";
        distance = 0;
        courtsList.add(createCourt("PS125 Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.814175;
        lng =  -73.950477;
        description = "These courts are sweet. There's one full court and a mini sized full court. Both courts are well paved, nicely painted and are equipped with plexi glass backboards. Nice.";
        imageurl = "http://www.dermandar.com/p/deYzBJ";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=St%20Nicholas%20Terrace";
        distance = 0;
        courtsList.add(createCourt("St Nicholas Terrace",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.816181;
        lng =  -73.948779;
        description = "A shady full court. The rims and floors have seen better days but this place is enough to scratch your basketball itch.";
        imageurl = "http://www.dermandar.com/p/bjntNj";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=St%20Nicholas%20Park";
        distance = 0;
        courtsList.add(createCourt("St Nicholas Park 133rd",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.820356;
        lng = -73.946850;
        description = "This mini full court is well paved, smooth and has plexi glass rims. One of the city's best kept secrets, so secret that theres hardly anyone here!";
        imageurl = "http://www.dermandar.com/p/efkxnk";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=St%20Nicholas%20Park%";
        distance = 0;
        courtsList.add(createCourt("St Nicholas Park 140th",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.820357;
        lng = -73.952575;
        description = "Three full courts that are nicely paved and painted. Some backboards have plexi glass and theres plenty of shade and even a working water fountain.";
        imageurl = "http://www.dermandar.com/p/awaqol";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=PS192%20Playground";
        distance = 0;
        courtsList.add(createCourt("PS192 Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.822937;
        lng = -73.951560;
        description = "This mini full court features cracked floors and a fading paint job. The only redeeming quality about this court is that there is a wall you can practice your passes on.";
        imageurl = "http://www.dermandar.com/p/azXvZe";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Hamilton%20Playground";
        distance = 0;
        courtsList.add(createCourt("Hamilton Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.823649;
        lng = -73.957471;
        description = "Two full courts with plexi glass backboards and views of the Hudson make this park one of the city's best spots for ball. Theres a pool nearby to make up for the lack of shade.";
        imageurl = "http://www.dermandar.com/p/ayxijq";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Riverbank%20Park";
        distance = 0;
        courtsList.add(createCourt("Riverbank Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.837714;
        lng = -73.936184;
        description = "This is THE neighborhood spot. Playing on the full court feels really nice since its well paved full court with plexi glass backboards. Theres also a half court nearby. ";
        imageurl = "http://www.dermandar.com/p/cZdlUX";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Sunken Playground%20Playground";
        distance = 0;
        courtsList.add(createCourt("Sunken Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.841512;
        lng =  -73.938382;
        description = "Possibly the worst public outdoor court in Manhattan. This dusty court doesn't even have backboards or rims, just a milk crate hanging up. ";
        imageurl = "http://www.dermandar.com/p/dPRdiU";
        rating = "1";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Audubon%20Playground";
        distance = 0;
        courtsList.add(createCourt("Audubon Playground",lat,lng,description,imageurl,rating,dlink,distance));


        lat = 40.844503;
        lng = -73.933089;
        description = "There's two full courts with really nice rims and backboards. The floor is a little beat up but the busy pick up scene is more than enough to make up for it.";
        imageurl = "http://www.dermandar.com/p/ctOmMa";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=High%20Bridge%20Park";
        distance = 0;
        courtsList.add(createCourt("High Bridge Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.853111;
        lng = -73.926753;
        description = "3 freshly painted full courts equipped with plexi glass backboards and nice rims. Bring your A game, there are some serious hoopers at this court.";
        imageurl = "http://www.dermandar.com/p/aeWwSG";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Wallenburg%20Playground";
        distance = 0;
        courtsList.add(createCourt("Wallenburg Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.857947;
        lng = -73.924761;
        description = "There's not much here with the undersized court, cracked floors and crooked rims. ";
        imageurl = "http://www.dermandar.com/p/dREHNx";
        rating = "4";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Fort%20George%20Playground";
        distance = 0;
        courtsList.add(createCourt("Fort George Playground",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.8622862;
        lng = -73.9214397;
        description = "These full courts are well above average quality for Manhattan. If you can get on the court in between the scheduled league games, this is the place to be.";
        imageurl = "http://www.dermandar.com/p/crFwyu";
        rating = "7";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Monsignor%20Kett%20Playground";
        distance = 0;
        courtsList.add(createCourt("Monsignor Kett Playground",lat,lng,description,imageurl,rating,dlink,distance));


        lat = 40.870262;
        lng =  -73.921844;
        description = "Two full-sized courts that are beautifully paved and have plexi glass backboards and rims with nets. There's also a lively pickup scene here so lace em up and get over here. ";
        imageurl = "http://www.dermandar.com/p/ahhcnf";
        rating = "8";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Inwood%20Hill%20Park";
        distance = 0;
        courtsList.add(createCourt("Inwood Hill Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.718771;
        lng =  -74.012951;
        description = "A hotspot for Tribeca basketball, with its beautifully paved surface, plexi glass backboard, high quality rims and nets along with the scenic hudson river vibes. ";
        imageurl = "http://www.dermandar.com/p/dSosWs";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Pier%2025%20Courts";
        distance = 0;
        courtsList.add(createCourt("Pier 25 Courts",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.717205;
        lng =  -74.016488;
        description = "4 half courts with good backboards and rims with nets.";
        imageurl = "http://www.dermandar.com/p/aDixZV";
        rating = "5";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=Rockerfeller%20Park";
        distance = 0;
        courtsList.add(createCourt("Rockerfeller Park",lat,lng,description,imageurl,rating,dlink,distance));

        lat = 40.709282;
        lng =  -74.015524;
        description = "";
        imageurl = "http://www.dermandar.com/p/dkiNTE";
        rating = "6";
        dlink = "https://citymapper.com/directions?endcoord="+lat+"%2C"+lng+"&endname=West%20Thames%20Park";
        distance = 0;
        courtsList.add(createCourt("West Thames Park",lat,lng,description,imageurl,rating,dlink,distance));








    }

    private HashMap createCourt (String name, double lat, double lng, String description,String imageurl, String rating, String dlink, double distance) {
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

    public void setMoviesList(List<Map<String,?>> moviesList) {
        this.courtsList = courtsList;
    }


    public void addToList(int num , Map<String,?> court) {
        courtsList.add(num,court);
    }

}
