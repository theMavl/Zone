package com.company;

/**
 * Created by mavl on 16.01.2017.
 */
public class Supervisor {

    void cleanZone(Zone zone) {
        zone.setPollution(0);
    }

    void sendFiremen(Zone zone) {
        zone.setOnFire(false);
    }
}
