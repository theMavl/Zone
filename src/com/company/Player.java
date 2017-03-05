package com.company;

/**
 * Created by mavl on 16.01.2017.
 */
public class Player {

    final static double START_BALANCE = 1000.0;
    private double money = START_BALANCE;
    private int fines;
    Supervisor order;

    Player () {
        fines = 0;
    }

    Player (int money) {
        super();
        this.money = money;
    }

    double getMoney() {
        return money;
    }

    void changeMoney(double delta) {
        money += delta;
    }

    void cleanZone(Zone zone) {
        zone.setPollution((int)20);
        changeMoney(-100);
    }

    void sendFiremen(Zone zone) {
        zone.setOnFire(false);
        changeMoney(-500);
    }

}
