package com.jlastudioiv.classes;

import com.jlastudioiv.interfaces.ISword;

public class SwordSoldier implements ISword{
    public void maimOrSeriouslyInjure() {
        System.out.println("Luke, I am your Father");
    }
    @Override
    public void cutVegetables() {
        System.out.println("Yummy Yummy");
    }
}
