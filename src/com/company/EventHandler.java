package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mavl on 10.03.2017.
 */
public class EventHandler {
    private static ArrayList<String> tasks = new ArrayList<>();

    EventHandler() {
    }

    static void checkTasks() {
        String[] tmp;
        for (String x: tasks) {
            tmp = tasks.get(0).split("_");
            int time = Integer.parseInt(tmp[0]);
            if (time >= GameTime.getJustTime())
                act(tmp[1], tmp[2]);
        }
    }

    static void newTask(int time, String type, String args) {
        tasks.add(String.format("%d_%s_%s", time, type, args));
    }

    private static void act(String type, String args) {
        switch(type) {
            case "VISIT":
                new Visitor().act();
                break;
        }
    }
}
