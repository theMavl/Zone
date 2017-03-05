package com.company;

/**
 * Created by mavl on 28.01.2017.
 */
public class GameEvent implements Runnable {

    Zone zone;
    Player player;
    GameTime gameTime;

    static final int EVENT_VISITOR = 0;
    static final int EVENT_FIRE = 1;
    static final int EVENT_BOSS = 2;
    static final int EVENT_WEATHER = 3;

    public static void newVisitor() {
        new Visitor(Visitor.MOOD_SUPER_CALM).act();
    }

    GameEvent() {}

    GameEvent(Zone zone, Player player, GameTime gameTime) {
        this.zone = zone;
        this.player = player;
        this.gameTime = gameTime;
    }

    @Override
    public void run() {

    }

    void randEvent() {
        int rnd = (int)(Math.random()*5);
        switch (rnd){
            case EVENT_VISITOR:
                new Visitor().act();
                break;
            case EVENT_FIRE:
                break;
            case EVENT_WEATHER:
                break;
            case EVENT_BOSS:
                break;
        }
    }
}
