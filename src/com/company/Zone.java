package com.company;

import java.util.ArrayList;

/**
 * Created by mavl on 16.01.2017.
 */
public class Zone {
    final byte DEFAULT_SIZE = 100;
    final static byte TYPE_GREEN = 1;
    final static byte TYPE_DESERT = 2;
    final static byte TYPE_WINTER = 3;

    byte prestige;
    boolean open;
    byte pollution;
    byte condition;
    byte type;
    boolean onFire;
    Area[][] areas;
    ArrayList<Visitor> visitors;

    Zone () {
        prestige = 1;
        open = true;
        pollution = 0;
        condition = 100;
        onFire = false;
        visitors = new ArrayList<>();
        initAreas(DEFAULT_SIZE, DEFAULT_SIZE);
    }

    Zone(int height, int width) {
        this();
        initAreas(height, width);
    }

    void setType(byte type) {
        this.type = type;
    }

    void setPollution(byte pollution) {
        this.pollution = pollution;
    }
    void setCondition(byte condition) { this.condition = condition; }

    void changePollution(byte delta) {
        pollution += delta;
    }
    void changeCondition(byte delta) {
        condition += delta;
    }

    void initAreas(int height, int width) {
        areas = new Area[height][width];
    }

    void setOnFire(boolean fire) {
        onFire = fire;
    }
}
