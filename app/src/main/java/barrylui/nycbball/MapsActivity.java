package barrylui.nycbball;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import barrylui.nycbball.CourtData.CourtData;
import barrylui.nycbball.CourtDetails.CourtDetailViewActivity;
import barrylui.nycbball.CourtsNearMe.CourtsNearMeActivity;
import barrylui.nycbball.WhatsNext.WhatsNextViewPager;


/* -------------------------------------------------------------------------------------------------
 * This is the Map Page
 * Users can see their location in real time and select basketball courts to find more details about
 * -------------------------------------------------------------------------------------------------
 */

public class MapsActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, GoogleMap.OnInfoWindowClickListener, OnMapReadyCallback, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    private GoogleMap mMap;
    private CameraPosition mCameraPosition;
    private Location mLastKnownLocation;

    private Location savedLocation;
    private CameraPosition savedCamereaPosition;
    private GoogleApiClient mGoogleApiClient;
    private static final String TAG = MapsActivity.class.getSimpleName();

    private final LatLng mDefaultLocation = new LatLng(40.758765, -73.978758);
    private static final int DEFAULT_ZOOM = 13;
    private static final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;
    private boolean mLocationPermissionGranted;



    //Keys for storing activity state.
    private static final String KEY_CAMERA_POSITION = "camera_position";
    private static final String KEY_LOCATION = "location";

    DrawerLayout drawerLayout;
    CourtData courtData = new CourtData();
    RelativeLayout keydetailed;
    RelativeLayout keyhidden;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState !=null){ //Retreive user location and camera position if restoring activity
            savedCamereaPosition = (CameraPosition)savedInstanceState.get("cam_position");
            savedLocation = (Location)savedInstanceState.get("lastlocation");
        }

        setContentView(R.layout.activity_maps);

        //Setup toolbar with title
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle(R.string.title_activity_maps);

        //Setup Map Key. Toggles Hidden or Detailed Mode on click
        keydetailed = (RelativeLayout) findViewById(R.id.keydetaillayout);
        keydetailed.setVisibility(View.VISIBLE);

        keyhidden = (RelativeLayout) findViewById(R.id.keyhiddenlayout);
        keyhidden.setVisibility(View.GONE);

        keydetailed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                keydetailed.setVisibility(View.GONE);
                keyhidden.setVisibility(View.VISIBLE);
            }
        });
        keyhidden.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                keyhidden.setVisibility(View.GONE);
                keydetailed.setVisibility(View.VISIBLE);
            }
        });

        //Setup navigation drawer
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view1);
        navigationView.setNavigationItemSelectedListener(this);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer1);
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

        // Build the Play services client for use by the Fused Location Provider and the Places API.
        // Use the addApi() method to request the Google Places API and the Fused Location Provider.
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this /* FragmentActivity */,
                        this /* OnConnectionFailedListener */)
                .addConnectionCallbacks(this)
                .addApi(LocationServices.API)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .build();
        mGoogleApiClient.connect();
    }

    /**
     * Saves the state of the map when the activity is paused.
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putParcelable("cam_position", mMap.getCameraPosition());
        outState.putParcelable("lastlocation", mLastKnownLocation);
    }

    @Override
    public void onPause(){
        super.onPause();
        savedCamereaPosition = mMap.getCameraPosition();
        savedLocation = mLastKnownLocation;
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
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.item1:
                drawerLayout.closeDrawer(GravityCompat.START);
                break;
            case R.id.item2:
                Intent courtRecycleView = new Intent(this, CourtsNearMeActivity.class);
                this.startActivity(courtRecycleView);
                finish();
                break;
            case R.id.item3:
                Intent whatsNext = new Intent(this, WhatsNextViewPager.class);
                this.startActivity(whatsNext);
                finish();
                break;
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
        }
        return true;
    }

    /**
     * Builds the map when the Google Play services client is successfully connected.
     */
    @Override
    public void onConnected(Bundle connectionHint) {
        // Build the map.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Handles failure to connect to the Google Play services client.
     */
    @Override
    public void onConnectionFailed(@NonNull ConnectionResult result) {
        Log.d(TAG, "Play services connection failed: ConnectionResult.getErrorCode() = "
                + result.getErrorCode());
    }


     //Handles suspension of the connection to the Google Play services client.

    @Override
    public void onConnectionSuspended(int cause) {
        Log.d(TAG, "Play services connection suspended");
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * Markers are placed for basketball courts
     */

    @Override
    public void onMapReady(GoogleMap googleMap) {
        //Set up map and toggle hybrid map
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);

        updateLiveLocationUI();//Set up live marker for phone position on map
        getDeviceLocation();//Retrieves location

        if (savedCamereaPosition == null){
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mDefaultLocation, DEFAULT_ZOOM));
        }
        else {
            mMap.moveCamera(CameraUpdateFactory.newCameraPosition(savedCamereaPosition));
        }

        //Add Courts to the map by iterating through data
        for (int i = 0; i < courtData.getSize(); i++){
            String name = (String) courtData.getItem(i).get("name");
            Marker mark = mMap.addMarker(new MarkerOptions()
                    .position(new LatLng((double) courtData.getItem(i).get("lat"), (double) courtData.getItem(i).get("lng")))
                    .title(name)
                    .snippet("Tap here for more info"));
            mark.setTag(i);//Set tag as index
            String val = (String)courtData.getItem(i).get("rating");
            int rate = Integer.parseInt(val);

            //Different markers on the map according to their rating
            if (rate < 4){
                mark.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.blackball));
            } else if (rate < 7){
                mark.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.blueball));
            } else
                mark.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.bball));
        }
        mMap.setOnInfoWindowClickListener(this);
    }

    //Displays name of the park and brings in a detailed view of the court.
    @Override
    public void onInfoWindowClick(Marker marker) {
        int in = (Integer)marker.getTag();
        Intent info = new Intent(getBaseContext(), CourtDetailViewActivity.class);
        info.putExtra("position", in);
        startActivity(info);
    }

    private void getDeviceLocation() {
        if (ContextCompat.checkSelfPermission(this.getApplicationContext(),
                android.Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mLocationPermissionGranted = true;
        } else {
            ActivityCompat.requestPermissions(this,
                    new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                    PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
        }
        if (mLocationPermissionGranted) {
            mLastKnownLocation = LocationServices.FusedLocationApi
                    .getLastLocation(mGoogleApiClient);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String permissions[],
                                           @NonNull int[] grantResults) {
        mLocationPermissionGranted = false;
        switch (requestCode) {
            case PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    mLocationPermissionGranted = true;
                }
            }
        }
        updateLiveLocationUI();
    }

    private void updateLiveLocationUI() {
        if (mMap == null) {
            return;
        }
        //Check permission
        if (ContextCompat.checkSelfPermission(this.getApplicationContext(),
                android.Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mLocationPermissionGranted = true;
        } else {
            ActivityCompat.requestPermissions(this,
                    new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                    PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
        }
        //Permission granted
        if (mLocationPermissionGranted) {
            mMap.setMyLocationEnabled(true); //Live indicator for phones position on map
            mMap.getUiSettings().setMyLocationButtonEnabled(true); //Button to center camera to position
            //Permission denied
        } else {
            mMap.setMyLocationEnabled(false);
            mMap.getUiSettings().setMyLocationButtonEnabled(false);
            mLastKnownLocation = null;
        }
    }
}