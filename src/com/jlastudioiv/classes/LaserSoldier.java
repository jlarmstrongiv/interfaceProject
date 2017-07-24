package com.jlastudioiv.classes;

import com.jlastudioiv.interfaces.ILaser;

public class LaserSoldier implements ILaser {
    public void makeLaserSound() {
        System.out.println("Thunderclap Hiss");
    }

    public void maimOrSeriouslyInjure() {
        System.out.println("You cut off Luke Skywalker’s hand!");
    }
}
