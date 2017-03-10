package com.company;

import java.sql.Time;

/**
 * Created by mavl on 23.02.2017.
 */
public class GameTime implements Runnable {
    private static int hours = 0;
    private static int mins = 0;
    private static int len = 1000;
    private static int justTime = 0;


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

    public static int getJustTime() {return justTime;}

    private void tick() {
        /*mins += 1;
        if (mins == 60) {
            mins = 0;
            hours += 1;
            if (hours == 24)
                hours = 0;
        }*/
        justTime++;
        EventHandler.checkTasks();
    }
}
