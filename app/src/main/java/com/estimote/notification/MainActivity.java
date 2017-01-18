package com.estimote.notification;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
;

import com.estimote.sdk.SystemRequirementsChecker;
import com.jordi.corepacket.logging;

import static com.jordi.corepacket.logging.LogType.*;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    public static Activity ME;
    public static boolean active = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_main);
            ME = this;
            Log.d("MWC", A2);
        } catch (Exception e){
            Log.d("MWC", A3 + logging.stack_to_string(e.getStackTrace()));
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        active = true;

        MyApplication app = (MyApplication) getApplication();
            if (!SystemRequirementsChecker.checkWithDefaultDialogs(this)) {
            } else if (!app.isBeaconNotificationsEnabled()) {
                app.enableBeaconNotifications();
            }
    }

    @Override
    protected void onPause() {
        super.onPause();
        active = false;
    }
}
