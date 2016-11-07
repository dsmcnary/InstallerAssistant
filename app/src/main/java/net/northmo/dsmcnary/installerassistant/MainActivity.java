package net.northmo.dsmcnary.installerassistant;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View towerButton = findViewById(R.id.tower_button);
        towerButton.setOnClickListener(this);
        View configButton = findViewById(R.id.config_button);
        configButton.setOnClickListener(this);
        View configfileButton = findViewById(R.id.configfile_button);
        configfileButton.setOnClickListener(this);
        View alignButton = findViewById(R.id.align_button);
        alignButton.setOnClickListener(this);
        View billingButton = findViewById(R.id.billing_button);
        billingButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tower_button:
                Intent intentTower = new Intent(this, TowerActivity.class);
                startActivity(intentTower);
                break;
            case R.id.config_button:
                Intent intentConfig = new Intent(this, ConfigActivity.class);
                startActivity(intentConfig);
                break;
            case R.id.configfile_button:
                Intent intentConfigFile = new Intent(this, ConfigFileActivity.class);
                startActivity(intentConfigFile);
                break;
            case R.id.align_button:
                Intent intentAlign = new Intent(this, AlignActivity.class);
                startActivity(intentAlign);
                break;
            case R.id.billing_button:
                //Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
                //Intent intentBilling = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                Intent intentBilling = new Intent(this, MapsActivity.class);
                startActivity(intentBilling);
                break;
            default:
                Log.i(TAG, "TowerActivity.java: Security Exception from trying to getLastLocation()");
                throw new RuntimeException();

        }
    }
}