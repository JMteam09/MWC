package com.mwc.opendag;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mwc.opendag.WindowInitializer;
import com.mwc.opendag.WindowInitializers;
import com.estimote.sdk.SystemRequirementsChecker;

public class MainActivity extends AppCompatActivity {

    public static Activity ME;
    public static WindowInitializer current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ME = this;
        current = WindowInitializers.MainActivity();
        current.Open();
    }

    @Override
    public void onBackPressed() {
        current.Back();
    }

    @Override
    protected void onResume() {
        super.onResume();
        current.Open();
        MyApplication app = (MyApplication) getApplication();
            if (!SystemRequirementsChecker.checkWithDefaultDialogs(this)) {
            } else if (!app.isBeaconNotificationsEnabled()) {
                app.enableBeaconNotifications();
            }

    }
}
