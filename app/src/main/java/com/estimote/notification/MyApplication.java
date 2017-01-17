package com.estimote.notification;

import android.app.Activity;
import android.app.Application;

import com.estimote.notification.estimote.BeaconID;
import com.estimote.notification.estimote.BeaconNotificationsManager;
import com.estimote.sdk.EstimoteSDK;

public class MyApplication extends Application {
    public static Activity ME;
    private boolean beaconNotificationsEnabled = false;

    @Override
    public void onCreate() {
        super.onCreate();
        ME = (Activity) this.getApplicationContext();
        EstimoteSDK.initialize(getApplicationContext(), "maaswaal-college-veenseweg-15t", "4302f89a2ec3d5c5ec15596a0e1079d0");
//        EstimoteSDK.enableDebugLogging(true);
    }

    public void enableBeaconNotifications() {
        if (beaconNotificationsEnabled) { return; }

        BeaconNotificationsManager beaconNotificationsManager = new BeaconNotificationsManager(this);

        //first iBeacon (Red)
        beaconNotificationsManager.addNotification(
                new BeaconID("B9407F30-F5F8-466E-AFF9-25556B57FE6D", 24934, 58703),
                "Hello, first iBeacon.",
                "Goodbye, first iBeacon.");
        //Second iBeacon (Yellow)
        beaconNotificationsManager.addNotification(
                new BeaconID("B9407F30-F5F8-466E-AFF9-25556B57FE6D", 45237, 31953),
                "Hello, Second iBeacon.",
                "Goodbye, Second iBeacon.");
        //Third iBeacon (Roze)
        beaconNotificationsManager.addNotification(
                new BeaconID("B9407F30-F5F8-466E-AFF9-25556B57FE6D", 8740, 36037),
                "Hello, Third iBeacon.",
                "Goodbye, Third iBeacon.");

        beaconNotificationsManager.startMonitoring();
        beaconNotificationsEnabled = true;
    }

    public boolean isBeaconNotificationsEnabled() {
        return beaconNotificationsEnabled;
    }
}
