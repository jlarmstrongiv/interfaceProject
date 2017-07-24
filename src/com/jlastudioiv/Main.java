package com.jlastudioiv;

import com.jlastudioiv.classes.BombSoldier;
import com.jlastudioiv.classes.LaserSoldier;
import com.jlastudioiv.classes.SwordSoldier;

public class Main {

    public static void main(String[] args) {
        BombSoldier bombSoldier = new BombSoldier();
        System.out.println(bombSoldier.speak());
        System.out.println(bombSoldier.stormTrooperAim());
        System.out.println(bombSoldier.iHitSomething());
        System.out.println(bombSoldier.toSring());
        System.out.println(bombSoldier.eat());
        System.out.println(bombSoldier.sleep());
        System.out.println(bombSoldier.trudge());
        System.out.println("");

        LaserSoldier laserSoldier = new LaserSoldier();
        System.out.println(laserSoldier.speak());
        System.out.println(laserSoldier.makeLaserSound());
        System.out.println(laserSoldier.maimOrSeriouslyInjure());
        System.out.println(laserSoldier.cutVegetables());
        System.out.println(laserSoldier.eat());
        System.out.println(laserSoldier.sleep());
        System.out.println(laserSoldier.trudge());
        System.out.println("");

        SwordSoldier swordSoldier = new SwordSoldier();
        System.out.println(swordSoldier.speak());
        System.out.println(swordSoldier.cutVegetables());
        System.out.println(swordSoldier.maimOrSeriouslyInjure());
        System.out.println(swordSoldier.eat());
        System.out.println(swordSoldier.sleep());
        System.out.println(swordSoldier.trudge());
    }
}
