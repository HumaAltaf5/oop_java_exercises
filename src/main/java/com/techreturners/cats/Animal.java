package com.techreturners.cats;

public abstract class Animal {
    private String name;
    private String place;
    private int averageHeight;
    private String type;
    private String catReaction;
    private boolean isAsleep;

    public Animal(int averageHeight, String type, String catReaction, String name, String place) {
        this.averageHeight = averageHeight;
        this.type = type;
        this.catReaction = catReaction;
        this.name = name;
        this.place = place;
    }

    public String getDetails() {
        return "I am a " + name + " from " + place + ".";
    }

    public abstract String run();

    public int getAverageHeight() {
        return averageHeight;
    }

    public String getSetting() {
        return type;
    }

    public String eat() {
        return catReaction;
    }
    public void wakeUp() {
        isAsleep = false;
    }

    public void goToSleep() {
        isAsleep = true;
    }

    public boolean isAsleep() { return isAsleep; }
}
