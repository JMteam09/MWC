package com.estimote.notification;

import android.view.View;
import android.widget.Button;

public class WindowInitializers {
    public static WindowInitializer MainActivity(){
        WindowInitializer window = new WindowInitializer(new Runnable() {
            @Override
            public void run() {
                MainActivity.ME.setContentView(R.layout.activity_main);
                Button buttonView_vakken = (Button) MainActivity.ME.findViewById(R.id.buttonView_vakken);
                buttonView_vakken.setOnClickListener(new View.OnClickListener() {
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
                Button  buttonView_nederlands = (Button) MainActivity.ME.findViewById(R.id.buttonView_nederlands);
                buttonView_nederlands.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Tijdelijk opent die MainActivity om vanmiddag ff te testen of ik t door heb.
                        WindowInitializer in = WindowInitializers.MainActivity().Open();
                    }
                });
            }
        });
        return window;
    }
}
