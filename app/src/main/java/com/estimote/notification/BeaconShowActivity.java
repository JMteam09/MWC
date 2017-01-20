package com.estimote.notification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class BeaconShowActivity extends Activity {

    public static Activity ME;

    @Override
    protected void onCreate(Bundle savedInstancdeState) {
        super.onCreate(savedInstancdeState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        onShow(getIntent());
    }

    public void onShow(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.containsKey("minorValue")) {
                int beaconMinor = extras.getInt("minorValue");
                if (beaconMinor == 58703) {
                    util.showdialog(util.background, "Heey de beacon is gedetecteerd en de dialog is goed gepopupt!","Oke!");
                } else if (beaconMinor == 31953){setContentView(R.layout.second);
                } else if (beaconMinor == 36037){

                }
            }
        }
    }
}
