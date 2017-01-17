package com.estimote.notification;

import android.app.Application;

import com.estimote.notification.estimote.BeaconID;
import com.estimote.notification.estimote.BeaconNotificationsManager;
import com.estimote.sdk.EstimoteSDK;

//
// Running into any issues? Drop us an email to: contact@estimote.com
//

public class MyApplication extends Application {

    private boolean beaconNotificationsEnabled = false;

    @Override
    public void onCreate() {
        super.onCreate();

        EstimoteSDK.initialize(getApplicationContext(), "maaswaal-college-veenseweg-15t", "4302f89a2ec3d5c5ec15596a0e1079d0");

//        EstimoteSDK.enableDebugLogging(true);
    }

    public void enableBeaconNotifications() {
        if (beaconNotificationsEnabled) { return; }

        BeaconNotificationsManager beaconNotificationsManager = new BeaconNotificationsManager(this);
        beaconNotificationsManager.addNotification(
                // TODO: replace with UUID, major and minor of your own beacon
                new BeaconID("a3f113372c4d4014817c5b72a2bc2315", 24934, 58703),
                "Hello, world.",
                "Goodbye, world.");
        beaconNotificationsManager.startMonitoring();

        beaconNotificationsEnabled = true;
    }

    public boolean isBeaconNotificationsEnabled() {
        return beaconNotificationsEnabled;
    }
}
