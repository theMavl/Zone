package com.company;

/**
 * Created by mavl on 28.01.2017.
 */
public class GameEvent {

    public static void newVisitors() {
        new Visitor((byte)2,Visitor.MOOD_SUPER_CALM).act();

    }
}
