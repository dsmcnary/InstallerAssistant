package net.northmo.dsmcnary.installerassistant;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

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

        // Add a marker in Sydney and move the camera
        LatLng CAM = new LatLng(39.748877, -94.247276);
        mMap.addMarker(new MarkerOptions().position(CAM).title("CAM"));
        LatLng ROG = new LatLng(39.742392, -94.235421);
        mMap.addMarker(new MarkerOptions().position(ROG).title("ROG"));
        LatLng DTN = new LatLng(39.740976, -94.236165);
        mMap.addMarker(new MarkerOptions().position(DTN).title("DTN"));
        LatLng MCN = new LatLng(39.697228, -94.271677);
        mMap.addMarker(new MarkerOptions().position(MCN).title("MCN"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(CAM));
    }
}