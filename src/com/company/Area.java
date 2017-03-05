package com.company;

/**
 * Created by mavl on 17.01.2017.
 */
public class Area extends Zone {
    private boolean important;
    private boolean dangerous;
    private int component;
    private boolean occupied = false;

    Area () {}

    Area (boolean important, boolean dangerous) {
        super();
        this.important = important;
        this.dangerous = dangerous;
        this.component = Component.randComponent();
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public int getComponent() {
        return component;
    }

    public void setComponent(int component) {
        this.component = component;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
