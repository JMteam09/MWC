package com.jordi.corepacket;

import com.estimote.sdk.*;
import com.estimote.sdk.Beacon;

import java.util.List;

/**
 * Created by reloa on 18-1-2017.
 */

public class Action implements Runnable {
    private Region Region;
    private List<Beacon> Beacons;
    public Action(Region reg, List<Beacon> beacons){
        this.Region = reg;
        this.Beacons = beacons;
    }

    public void Run(Region r, List<Beacon> l) {
        this.Region = r;
        this.Beacons = l;
        this.run();
    }
    @Override
    public void run(){
    }
}
