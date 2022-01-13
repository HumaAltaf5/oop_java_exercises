package com.techreturners.cats;

public class DomesticCat extends Animal implements Cat {
    private boolean isAsleep = false;

    @Override
    public String eat() {
        return "Purrrrrrr";
    }

    @Override
    public String run() {
        return "I am too lazy to run.";
    }

    public int getAverageHeight() {
        return 23;
    }

    public void wakeUp() {
        isAsleep = false;
    }

    public void goToSleep() {
        isAsleep = true;
    }

    @Override
    public String getSetting() {
        return "domestic";
    }

    public boolean isAsleep() {
        return isAsleep;
    }
}
