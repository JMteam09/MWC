package com.estimote.notification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import android.widget.TabHost;
import android.widget.Toast;

import static android.app.Service.START_STICKY;

/**
 * Created by reloa on 19-1-2017.
 */

public class background extends Service {
    @Override
    public IBinder onBind(Intent arg0) {
        Log.e("started","startedBIBD");
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // TODO Auto-generated method stub
        Log.e("started","startedCMD");
        return START_STICKY;
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
    }
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        util.background = this.getApplicationContext();
    }
}