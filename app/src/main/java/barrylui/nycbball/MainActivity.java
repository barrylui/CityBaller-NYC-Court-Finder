package barrylui.nycbball;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, WelcomeFrag.OnBallClickListener {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set up toolbar & title
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Welcome!");

        // Start the welcome fragment in container
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, WelcomeFrag.newInstance(R.id.welcome)).commit();

        //Set up Navigation bar
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
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

    //Method that starts the map activity when ball is tapped by user
    public void onBallClick(){
        Intent map = new Intent(this, MapsActivity.class);
        this.startActivity(map);
    }
    //Check if activity is found
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
                Intent mapView = new Intent(this, MapsActivity.class);
                this.startActivity(mapView);
                break;
            //Starts Recyclerview activity with listing of courts nearby
            case R.id.item2:
                Intent courtRecycleView = new Intent(this, CourtsRecycleView.class);
                this.startActivity(courtRecycleView);
                break;
            //Starts ViewPager activity showing the roadmap for the app
            case R.id.item3:
                Intent whatsNext = new Intent(this, WhatsNext.class);
                this.startActivity(whatsNext);
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
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, WelcomeFrag.newInstance(R.id.welcome))
                        .commit();
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
