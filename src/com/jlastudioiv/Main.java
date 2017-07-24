package com.jlastudioiv;

import com.jlastudioiv.classes.BombSoldier;
import com.jlastudioiv.classes.LaserSoldier;
import com.jlastudioiv.classes.SwordSoldier;

public class Main {

    public static void main(String[] args) {
        BombSoldier bombSoldier = new BombSoldier();
        bombSoldier.stormTrooperAim();
        bombSoldier.iHitSomething();
        System.out.println(bombSoldier.toSring());
        System.out.println("");

        LaserSoldier laserSoldier = new LaserSoldier();
        laserSoldier.makeLaserSound();
        laserSoldier.maimOrSeriouslyInjure();
        laserSoldier.cutVegetables();
        System.out.println("");

        SwordSoldier swordSoldier = new SwordSoldier();
        swordSoldier.cutVegetables();
        swordSoldier.maimOrSeriouslyInjure();
    }
}
