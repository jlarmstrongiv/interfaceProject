package com.jlastudioiv.interfaces;

public interface ISword {
    String maimOrSeriouslyInjure();
    default String cutVegetables() {
        return "Fruit Salad";
    }
}
