package com.techreturners.cats;

public class LionCat extends Animal implements Cat {

    @Override
    public String eat() {
        return "Roar!!!!";
    }

    @Override
    public String run() {
        return "I can run at 80 km/h";
    }

    public int getAverageHeight() {
        return 1100;
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
