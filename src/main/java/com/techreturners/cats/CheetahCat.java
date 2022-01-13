package com.techreturners.cats;

public class CheetahCat extends Animal implements Cat {

    @Override
    public String eat() {
        return "Zzzzzzz";
    }

    @Override
    public String run() {
        return "I can run at 130 km/h.";
    }

    @Override
    public int getAverageHeight() {
        return 0;
    }

    @Override
    public boolean isAsleep() {
        return false;
    }

    @Override
    public void goToSleep() {
        System.out.println("Good night");
    }

    @Override
    public void wakeUp() {
        System.out.println("Good morning");
    }

    @Override
    public String getSetting() {
        return "wild";
    }
}
