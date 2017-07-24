package com.jlastudioiv.interfaces;

public interface ISword {
    void maimOrSeriouslyInjure();
    default void cutVegetables() {
        System.out.println("Fruit Salad");
    }
}
