package barrylui.nycbball;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class CourtsRecycleView extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    Fragment mContent;
    DrawerLayout drawerLayout;
    CourtData cData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courts_recycle_view);

        if (savedInstanceState != null) {
            mContent = getSupportFragmentManager().getFragment(savedInstanceState, "mContent");
        }
        else {
            cData = new CourtData();
            mContent = RecycleView.newInstance(-1);
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.container2, mContent).addToBackStack(null).commit();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view2);
        navigationView.setNavigationItemSelectedListener(this);

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

        //if (savedInstanceState == null) {
        //    getSupportFragmentManager().beginTransaction()
        //            .add(R.id.container, Fragment_RecyclerView.newInstance(0))
        //            .commit()
        //}
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1:
                Intent mapview = new Intent(this, MapsActivity.class);
                this.startActivity(mapview);
                break;
            case R.id.item2:
                break;
            default:
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(mContent.isAdded()) {
            getSupportFragmentManager().putFragment(outState, "mContent", mContent);
            //outState.putInt("currentFrag", );
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle outState) {
        mContent = getSupportFragmentManager().getFragment(outState, "mContent");
        //outState.getInt()
    }
}
