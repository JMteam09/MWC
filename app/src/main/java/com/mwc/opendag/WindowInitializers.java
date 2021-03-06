package com.mwc.opendag;

import android.view.View;
import android.widget.Button;

import com.estimote.notification.R;

public class WindowInitializers {
    public static WindowInitializer MainActivity(){
        WindowInitializer window = new WindowInitializer(new Runnable() {
            @Override
            public void run() {
                MainActivity.ME.setContentView(R.layout.activity_main);
                Button buttonView_route = (Button) MainActivity.ME.findViewById(R.id.buttonView_route);
                Button buttonView_proef = (Button) MainActivity.ME.findViewById(R.id.buttonView_programma) ;
                buttonView_route.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        WindowInitializer in = WindowInitializers.RouteActivity(MainActivity.current).Open();
                    }
                });
                buttonView_proef.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void  onClick(View v) {
                        WindowInitializer in = WindowInitializers.ProefActivity(MainActivity.current).Open();
                    }
                });
            }
        });
        return window;
    }

    public static WindowInitializer RouteActivity(WindowInitializer prev){
        WindowInitializer window = new WindowInitializer(new Runnable() {
            @Override
            public void run() {
                MainActivity.ME.setContentView(R.layout.activity_route);
            }
        });
        return window;
    }

    public static WindowInitializer ProefActivity(WindowInitializer prev) {
        WindowInitializer window = new WindowInitializer(new Runnable() {
            @Override
            public void run() {
                MainActivity.ME.setContentView(R.layout.activity_proeflessen);
            }
        });
        return window;
    }
}
