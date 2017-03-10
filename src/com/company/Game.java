package com.company;

/**
 * Created by mavl on 23.02.2017.
 */
public class Game {
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

}
