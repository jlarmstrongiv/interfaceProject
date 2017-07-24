package com.jlastudioiv.classes;

import com.jlastudioiv.interfaces.IBomb;

public class BombSoldier extends Soldier implements IBomb {
    public String stormTrooperAim() {
        return "Pew Pew Pew";
    }
    public String iHitSomething() {
        return "I did it boss";
    }
    public String toSring() {
        return "boom";
    }
    @Override
    public String speak() {
        return "YOLO BOOYA!";
    }
}
