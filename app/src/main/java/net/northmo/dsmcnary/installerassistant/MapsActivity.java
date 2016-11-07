package net.northmo.dsmcnary.installerassistant;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static net.northmo.dsmcnary.installerassistant.R.id.map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        //mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //LatLng CAM = new LatLng(39.748877, -94.247276);
        //mMap.addMarker(new MarkerOptions().position(CAM).title("CAM"));
        //LatLng ROG = new LatLng(39.742392, -94.235421);
        //mMap.addMarker(new MarkerOptions().position(ROG).title("ROG"));
        //LatLng DTN = new LatLng(39.740976, -94.236165);
        //mMap.addMarker(new MarkerOptions().position(DTN).title("DTN"));
        //LatLng MCN = new LatLng(39.697228, -94.271677);
        //mMap.addMarker(new MarkerOptions().position(MCN).title("MCN"));

        //mMap.moveCamera(CameraUpdateFactory.newLatLng(CAM));
    }
}