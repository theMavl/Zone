package com.company;

import static com.company.Main.ThePark;

/**
 * Created by mavl on 16.01.2017.
 */
public class Visitor {

    final static byte MOOD_SUPER_CALM = 0;
    final static byte MOOD_NORMAL = 1;
    final static byte MOOD_NERVOUS = 2;
    final static byte MOOD_ANGRY = 3;
    final static byte MOOD_BADASS = 4;

    byte people;
    byte mood;
    int[] area = new int[2];
    byte intent;

    Visitor () {}

    Visitor (byte people, byte mood) {
        this.people = people;
        this.mood = mood;
        this.intent = (byte)(Math.random()*Component.MAX_COMPONENTS);
    }

    Visitor (byte people, byte mood, byte intent) {
        this(people, mood);
        this.intent = intent;
    }

    public void act() {
        Area currentArea = ThePark.areas[area[0]][area[1]];
        switch (this.mood) {
            case MOOD_SUPER_CALM:
                break;

            case MOOD_NORMAL:
                currentArea.changePollution((byte)10);
                break;

            case MOOD_NERVOUS:
                currentArea.changePollution((byte)20);
                currentArea.changeCondition((byte)10);
                break;

            case MOOD_ANGRY:
                currentArea.changePollution((byte)30);
                currentArea.changeCondition((byte)20);
                break;

            case MOOD_BADASS:
                currentArea.changePollution((byte)40);
                currentArea.changeCondition((byte)40);
                break;
        }
    }
}
