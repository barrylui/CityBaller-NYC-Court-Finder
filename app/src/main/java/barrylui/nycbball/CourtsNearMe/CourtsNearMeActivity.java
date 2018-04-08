package barrylui.nycbball.CourtsNearMe;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import barrylui.nycbball.CourtData.CourtData;
import barrylui.nycbball.MapsActivity;
import barrylui.nycbball.R;
import barrylui.nycbball.WhatsNext.WhatsNextViewPager;

/* --------------------------------------------------------------------------------------
 * Activity with toolbar, gps coordinates and a container to load recyclerview fragment
 * Used to calculate distance from courts
 * --------------------------------------------------------------------------------------
 */
public class CourtsNearMeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    Fragment mContent;
    DrawerLayout drawerLayout;
    CourtData cData;
    Context mContext;
    GPSTracker gps;
    double lat;
    double lng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;

        //Check location permissions
        if (ContextCompat.checkSelfPermission((Activity)mContext, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission((Activity)mContext, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(CourtsNearMeActivity.this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, 1);

        } else {
            gps = new GPSTracker(mContext, CourtsNearMeActivity.this);

            // Check if GPS enabled
            if (gps.canGetLocation()) {
                double latitude = gps.getLatitude();
                double longitude = gps.getLongitude();
                lat = latitude;
                lng = longitude;

                //Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
            } else {
                // Can't get location.
                // GPS or network is not enabled.
                // Ask user to enable GPS/network in settings.
                gps.showSettingsAlert();
            }
        }

        setContentView(R.layout.activity_courtsnearme);
        cData = new CourtData();
        mContent = CourtsNearMeRecyclerView.newInstance(lat,lng);
        getSupportFragmentManager().beginTransaction().replace(R.id.container2, mContent).commit();

        //Initialize toolbar and setup the title
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle(R.string.title_activity_Courts_Near_Me);


        //Initialize navigation drawer
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view2);
        navigationView.setNavigationItemSelectedListener(this);


        //Setup navigation drawer states
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer2);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,  R.string.open_drawer, R.string.close_drawer)
        {
            @Override
            public void onDrawerClosed(View drawerView){
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }


    private boolean MyStartActivity(Intent aIntent) {
        try
        {
            startActivity(aIntent);
            return true;
        }
        catch (ActivityNotFoundException e)
        {
            return false;
        }
    }

    //Setting up listener for when items on navigation bar are chosen
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            //Starts map activity with court listings
            case R.id.item1:
                Intent mapview = new Intent(this, MapsActivity.class);
                this.startActivity(mapview);
                finish();
                break;
            //Starts Recyclerview activity with listing of courts nearby
            case R.id.item2:
                break;
            //Starts ViewPager activity showing the roadmap for the app
            case R.id.item3:
                Intent whatsNext = new Intent(this, WhatsNextViewPager.class);
                this.startActivity(whatsNext);
                finish();
                break;
            //Opens CityBaller NYC Court Finder listing on the Google Play Store
            case R.id.rate:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                //Try Google play
                intent.setData(Uri.parse("market://details?id=barrylui.nycbball"));
                if (!MyStartActivity(intent)) {
                    //Market (Google play) app seems not installed, let's try to open a webbrowser
                    intent.setData(Uri.parse("https://play.google.com/store/apps/details?barrylui.nycbball"));
                    if (!MyStartActivity(intent)) {
                        //Well if this also fails, we have run out of options, inform the user.
                        Toast.makeText(this, "Could not open Android market, please install the market app.", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            default:
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }



    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case 1: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the

                    // contacts-related task you need to do.

                    gps = new GPSTracker(mContext, CourtsNearMeActivity.this);

                    // Check if GPS enabled
                    if (gps.canGetLocation()) {

                        double latitude = gps.getLatitude();
                        double longitude = gps.getLongitude();
                        lat = latitude;
                        lng = longitude;

                    } else {
                        // Can't get location.
                        // GPS or network is not enabled.
                        // Ask user to enable GPS/network in settings.
                        gps.showSettingsAlert();
                    }

                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.

                    Toast.makeText(mContext, "You need to grant permission", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }
    //Getter methods for recyclerview to access lat and lng
    public double getcurLat(){
        return lat;
    }
    public double getcurLng(){
        return lng;
    }
}
