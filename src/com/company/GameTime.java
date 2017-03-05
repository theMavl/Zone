package com.company;

import java.sql.Time;

/**
 * Created by mavl on 23.02.2017.
 */
public class GameTime implements Runnable {
    private int hours = 0;
    private int mins = 0;
    private int len = 1000;


    GameTime() {}

    GameTime(int h, int m) {
        hours = h;
        mins = m;
    }

    @Override
    public void run() {

        while (true){
            try {
                Thread.sleep(len);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tick();
        }

    }

    public void setLen(int l) {
        len = l;
    }

    public int getHours () {
        return this.hours;
    }

    public int getMins() {
        return this.mins;
    }

    public int getLen() {
        return this.len;
    }

    private void tick() {
        mins += 1;
        if (mins == 60) {
            mins = 0;
            hours += 1;
            if (hours == 24)
                hours = 0;
        }
    }
}
