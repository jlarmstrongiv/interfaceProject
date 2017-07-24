package com.jlastudioiv.classes;

public abstract class Soldier {
    private String name;
    private String rank;
    private Integer serialNumber;

    Soldier(String name, String rank, Integer serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    public Soldier() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String sleep() {
        return "snore";
    }

    public String eat() {
        return "chew";
    }

    public String trudge() {
        return "trudge";
    }
    // Speak will be extended
    public String speak() {
        return "hi";
    }
}
