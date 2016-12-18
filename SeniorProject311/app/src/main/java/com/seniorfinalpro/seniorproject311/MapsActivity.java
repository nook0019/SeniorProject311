package com.seniorfinalpro.seniorproject311;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final LatLng LUMPINI_ORIGIN = new LatLng(13.733681, 100.538870);

    private static final LatLng LUMPINI_POINT2 = new LatLng(13.733909, 100.539044);

    private static final LatLng LUMPINI_POINT3 = new LatLng(13.734098, 100.539861);

    private static final LatLng LUMPINI_POINT4 = new LatLng(13.734008, 100.540563);

    private static final LatLng LUMPINI_POINT5 = new LatLng(13.733485, 100.541277);

    private static final LatLng LUMPINI_DEST = new LatLng(13.732837, 100.541613);

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

        mMap.addPolyline((new PolylineOptions())
                .add(LUMPINI_ORIGIN,LUMPINI_POINT2,LUMPINI_POINT3,LUMPINI_POINT4,LUMPINI_POINT5,LUMPINI_DEST));

        // Add a marker in Sydney and move the camera
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LUMPINI_ORIGIN));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(20));
//        // Add Marker
        mMap.addMarker(new MarkerOptions().position(LUMPINI_ORIGIN).title("Start"));
        mMap.addMarker(new MarkerOptions().position(LUMPINI_DEST).title("End"));

    }
}
