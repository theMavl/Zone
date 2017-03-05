package com.company;

import static com.company.Main.ThePark;

/**
 * Created by mavl on 16.01.2017.
 */
public class Visitor {

    final static int MOOD_SUPER_CALM = 0;
    final static int MOOD_NORMAL = 1;
    final static int MOOD_NERVOUS = 2;
    final static int MOOD_ANGRY = 3;
    final static int MOOD_BADASS = 4;

    int mood;
    int[] area = new int[2];

    Visitor () {
        this.mood = (int)(Math.random()*5);
        this.area = new int[] {(int)(Math.random()*Zone.size), (int)(Math.random()*Zone.size)};
    }

    Visitor (int mood) {
        this.mood = mood;
    }

    public void act() {
        Area currentArea = ThePark.areas[area[0]][area[1]];
        switch (this.mood) {
            case MOOD_SUPER_CALM:
                break;

            case MOOD_NORMAL:
                currentArea.changePollution(10);
                break;

            case MOOD_NERVOUS:
                currentArea.changePollution(20);
                currentArea.changeCondition(10);
                break;

            case MOOD_ANGRY:
                currentArea.changePollution(30);
                currentArea.changeCondition(20);
                break;

            case MOOD_BADASS:
                currentArea.changePollution(40);
                currentArea.changeCondition(40);
                break;
        }
    }
}
