package com.company;

/**
 * Created by mavl on 17.01.2017.
 */
public class Area extends Zone {
    private boolean important;
    private boolean nearSea;
    private int occupied;

    Area () {}

    Area (boolean important, boolean nearSea) {
        super();
        this.important = important;
        this.nearSea = nearSea;
        this.occupied = Component.NONE;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public boolean isNearSea() {
        return nearSea;
    }

    public void setNearSea(boolean nearSea) {
        this.nearSea = nearSea;
    }

    public int getOccupied() {
        return occupied;
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }
}
