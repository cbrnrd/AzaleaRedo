package net.landon.azfoforeal;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        makePins(googleMap);
    }

    public void makePins(GoogleMap googleMap) {
        try {
            googleMap.setMyLocationEnabled(true);// Add markers and pins to map
            LatLng PACLoc = new LatLng(38.993492, -77.127302);
            googleMap.addMarker(new MarkerOptions().position(PACLoc).title("PAC Auditorium").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));


            LatLng bearStore = new LatLng(38.993150, -77.126514);
            googleMap.addMarker(new MarkerOptions().position(bearStore).title("Bear Store"));

            LatLng foodArea = new LatLng(38.993262, -77.125916);
            googleMap.addMarker(new MarkerOptions().position(foodArea).title("Food/Dining area"));

            LatLng shoppingArea = new LatLng(38.991232, -77.126806);
            googleMap.addMarker(new MarkerOptions().position(shoppingArea).title("Shopping/Art Sale"));

            LatLng ridesArea = new LatLng(38.992470, -77.126827);
            googleMap.addMarker(new MarkerOptions().position(ridesArea).title("Rides and Food"));

            LatLng cameraStartLocation = new LatLng(38.991946, -77.125693); //location but no pin, used for camera starting position
            //CameraPosition cameraPosition = new CameraPosition.Builder().target(cameraStartLocation).zoom(12).build();
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cameraStartLocation));
        } catch (SecurityException se) {
            // Add markers and pins to map
            LatLng PACLoc = new LatLng(38.993492, -77.127302);
            googleMap.addMarker(new MarkerOptions().position(PACLoc).title("PAC Auditorium"));


            LatLng bearStore = new LatLng(38.993150, -77.126514);
            googleMap.addMarker(new MarkerOptions().position(bearStore).title("Bear Store"));

            LatLng foodArea = new LatLng(38.993262, -77.125916);
            googleMap.addMarker(new MarkerOptions().position(foodArea).title("Food/Dining area"));

            LatLng shoppingArea = new LatLng(38.991232, -77.126806);
            googleMap.addMarker(new MarkerOptions().position(shoppingArea).title("Shopping/Art Sale"));

            LatLng ridesArea = new LatLng(38.992470, -77.126827);
            googleMap.addMarker(new MarkerOptions().position(ridesArea).title("Rides and Food"));

            LatLng cameraStartLocation = new LatLng(38.991946, -77.125693); //location but no pin, used for camera starting position
            //CameraPosition cameraPosition = new CameraPosition.Builder().target(cameraStartLocation).zoom(12).build();
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cameraStartLocation));
        }
    }
}


