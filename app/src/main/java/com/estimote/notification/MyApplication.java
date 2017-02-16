package com.estimote.notification;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.estimote.notification.estimote.BeaconID;
import com.estimote.notification.estimote.BeaconNotificationsManager;
import com.estimote.sdk.EstimoteSDK;

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

        //first iBeacon (Red) (Ingang)
        beaconNotificationsManager.addNotification(
                new BeaconID("B9407F30-F5F8-466E-AFF9-25556B57FE6D", 24934, 58703),
                "Je bent nu bij de ingang!",
                "x");
        //Second iBeacon (Yellow) (WON)
        beaconNotificationsManager.addNotification(
                new BeaconID("B9407F30-F5F8-466E-AFF9-25556B57FE6D", 45237, 31953),
                "Je bent nu bij WON!",
                "x");
        //Third iBeacon (Roze) (Absentiecoördinator)
        beaconNotificationsManager.addNotification(
                new BeaconID("B9407F30-F5F8-466E-AFF9-25556B57FE6D", 8740, 36037),
                "Je bent nu bij de Absentiecoördinator!",
                "x");
        //4 iBeacon (Red) (LO)
        beaconNotificationsManager.addNotification(
                new BeaconID("B9407F30-F5F8-466E-AFF9-25556B57FE6D", 23639, 12181),
                "Je bent nu bij LO!",
                "x");
        //5 iBeacon (Yellow) (BIO)
        beaconNotificationsManager.addNotification(
                new BeaconID("B9407F30-F5F8-466E-AFF9-25556B57FE6D", 43920, 42906),
                "Je bent nu bij BIO!",
                "x");
        //6 iBeacon (Roze) (NONE)
        beaconNotificationsManager.addNotification(
                new BeaconID("B9407F30-F5F8-466E-AFF9-25556B57FE6D", 25436, 2306),
                "NONE",
                "x");


        beaconNotificationsManager.startMonitoring();
        beaconNotificationsEnabled = true;
    }

    public boolean isBeaconNotificationsEnabled() {
        return beaconNotificationsEnabled;
    }
}
