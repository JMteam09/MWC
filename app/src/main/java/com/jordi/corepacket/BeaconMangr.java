package com.jordi.corepacket;

import android.content.Context;
import android.util.Log;

import com.estimote.sdk.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.estimote.sdk.Beacon;
import com.jordi.corepacket.logging.*;

import static com.jordi.corepacket.logging.LogType.*;

/**
 * Created by reloa on 18-1-2017.
 */

public class BeaconMangr {
    private Context con;
    private BeaconManager manager;
    private HashMap<String, Action> onEnter;
    private HashMap<String, Action> onLeave;
    public BeaconMangr(Context app){
        this.con = app;
        this.manager = new BeaconManager(con);
        manager.setMonitoringListener(new BeaconManager.MonitoringListener() {
            @Override
            public void onEnteredRegion(Region region, List<Beacon> list) {
                Collection<Action> vals = onEnter.values();
                Action[] values = new Action[vals.size()];
                values = vals.toArray(values);
                for (int x = 0; x < values.length; x++){
                    values[x].run();
                }
            }

            @Override
            public void onExitedRegion(Region region) {

            }
        });
    }
    public BeaconMangr AddOnEnter(String id, Action onenter){
        if (!this.onEnter.containsKey(id)){
            this.onEnter.put(id, onenter);
        } else {
            Log.d("MWC",G3 + "Region already defined! ("+id+")");
        }
        return this;
    }
}
