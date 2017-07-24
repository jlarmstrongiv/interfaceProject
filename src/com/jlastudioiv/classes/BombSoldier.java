package com.jlastudioiv.classes;

import com.jlastudioiv.interfaces.IBomb;

public class BombSoldier extends Soldier implements IBomb {
    public void stormTrooperAim() {
        System.out.println("Pew Pew Pew");
    }
    public void iHitSomething() {
        System.out.println("I did it boss");
    }
    public String toSring() {
        return "boom";
    }
}
