package com.jlastudioiv.classes;

import com.jlastudioiv.interfaces.ILaser;

public class LaserSoldier extends Soldier implements ILaser {
    public String makeLaserSound() {
        return "Thunderclap Hiss";
    }

    public String maimOrSeriouslyInjure() {
        return "You cut off Luke Skywalker’s hand!";
    }
    @Override
    public String speak() {
        return "Glowy!";
    }
}
