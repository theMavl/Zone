package com.company;

import java.util.ArrayList;

/**
 * Created by mavl on 16.01.2017.
 */
public class Zone {
    final static int DEFAULT_SIZE = 100;
    /*final static int TYPE_GREEN = 1;
    final static int TYPE_DESERT = 2;
    final static int TYPE_WINTER = 3;*/

    private int prestige;
    private boolean open;
    private int pollution;
    private int condition;
    private int type;
    private boolean onFire;
    Area[][] areas;
    ArrayList<Visitor> visitors;
    static int size;

    Zone () {
        prestige = 1;
        open = true;
        pollution = 0;
        condition = 100;
        onFire = false;
        visitors = new ArrayList<>();
        initAreas(DEFAULT_SIZE);
    }

    Zone(int areaSize) {
        this();
        initAreas(areaSize);
    }

    public int getPrestige() {
        return prestige;
    }

    public void setPrestige(int prestige) {
        this.prestige = prestige;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getPollution() {
        return pollution;
    }

    public int getCondition() {
        return condition;
    }

    public int getType() {
        return type;
    }

    public boolean isOnFire() {
        return onFire;
    }

    void setType(int type) {
        this.type = type;
    }

    void setPollution(int pollution) {
        this.pollution = pollution;
    }
    void setCondition(int condition) { this.condition = condition; }

    int calcPollution() {
        int pollution = 0;
        int counter = 0;
        for (Area[] area : areas)
            for (Area area2: area) {
                pollution += area2.getPollution();
                counter += 1;
            }
        return (int)(pollution/counter);
    }

    void changePollution(int delta) {
        pollution += delta;
    }
    void changeCondition(int delta) {
        condition += delta;
    }

    void initAreas(int areaSize) {
        areas = new Area[areaSize][areaSize];
        size = areaSize;
    }

    void setOnFire(boolean fire) {
        onFire = fire;
    }
}
