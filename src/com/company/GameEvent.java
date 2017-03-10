package com.company;

/**
 * Created by mavl on 28.01.2017.
 */
public class GameEvent implements Runnable {

    Zone zone;
    Player player;

    static final int EVENT_VISITOR = 0;
    static final int EVENT_FIRE = 1;
    static final int EVENT_BOSS = 2;
    static final int EVENT_WEATHER = 3;

    GameEvent() {}

    GameEvent(Zone zone, Player player) {
        this.zone = zone;
        this.player = player;
    }

    @Override
    public void run() {
        randEvent();
    }

    private void randEvent() {
        int rnd = (int)(Math.random()*5);
        rnd = EVENT_VISITOR; // DEBUG
        switch (rnd){
            case EVENT_VISITOR:
                EventHandler.newTask(GameTime.getJustTime()+10, "VISIT", "1;2");
                zone.areas[1][2].close();
                break;
            case EVENT_FIRE:
                EventHandler.newTask(GameTime.getJustTime()+10, "FIRE", "2;2");
                zone.areas[1][2].setOnFire(true);
                break;
            case EVENT_WEATHER:
                break;
            case EVENT_BOSS:
                break;
        }
    }
}
