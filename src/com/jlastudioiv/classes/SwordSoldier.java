package com.jlastudioiv.classes;

import com.jlastudioiv.interfaces.ISword;

public class SwordSoldier extends Soldier implements ISword{
    public String maimOrSeriouslyInjure() {
        return "Luke, I am your Father";
    }
    @Override
    public String cutVegetables() {
        return "Yummy Yummy";
    }
    @Override
    public String speak() {
        return "excalibur!";
    }
}
