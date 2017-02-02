package com.estimote.notification;

import android.view.View;
import android.widget.Button;

/**
 * Created by reloa on 2-2-2017.
 */

public class WindowInitializers {
    public static WindowInitializer MainActivity(){
        WindowInitializer window = new WindowInitializer(new Runnable() {
            @Override
            public void run() {
                MainActivity.ME.setContentView(R.layout.activity_main);
                Button buttonVakken = (Button) MainActivity.ME.findViewById(R.id.buttonVakken);
                buttonVakken.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        WindowInitializer in = WindowInitializers.VakkenActivity(MainActivity.current).Open();
                    }
                });
            }
        });
        return window;
    }
    public static WindowInitializer VakkenActivity(WindowInitializer prev){
        WindowInitializer window = new WindowInitializer(new Runnable() {
            @Override
            public void run() {
                MainActivity.ME.setContentView(R.layout.activity_vakken);
            }
        });
        return window;
    }
}
