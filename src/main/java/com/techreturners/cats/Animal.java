package com.techreturners.cats;

public abstract class Animal {
    private String name;
    private String place;

    public void setDetails(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public String getDetails() {
        return "I am a " + name + " from " + place + ".";
    }

    public abstract String run();
}
