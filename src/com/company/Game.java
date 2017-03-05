package com.company;

/**
 * Created by mavl on 23.02.2017.
 */
public class Game {
    int hours;
    int mins;
    GameTime gameTime;
    GameEvent gameEventsCreator;
    Player thePlayer;
    Zone thePark;

    Game () {
        thePlayer = new Player();
        thePark = new Zone();

        gameTime = new GameTime();
        gameEventsCreator = new GameEvent(thePark, thePlayer, gameTime);

        new Thread(gameTime).start();
        new Thread(gameEventsCreator).start();
    }

    void updateTime() {
        this.hours = gameTime.hours;
        this.mins = gameTime.mins;
        System.out.println();
    }
}
