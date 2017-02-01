package com.company;

/**
 * Created by mavl on 17.01.2017.
 */
public class Area extends Zone {
    boolean important;
    boolean nearSea;
    byte occupied;

    Area () {}

    Area (boolean important, boolean nearSea) {
        super();
        this.important = important;
        this.nearSea = nearSea;
        this.occupied = Component.NONE;
    }
}
