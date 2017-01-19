package com.estimote.notification;

import android.app.Activity;
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

import com.estimote.sdk.SystemRequirementsChecker;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    public static Activity ME;
    public static boolean active = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ME = this;
        ((Button) findViewById(R.id.test)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    util.showdialog(ME, "test", "close", R.drawable.xx);
                }catch(Exception e){
                    AlertDialog.Builder b = new AlertDialog.Builder(ME);
                    b.setMessage(e.toString());
                    b.show();
                }
            }
        });
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
