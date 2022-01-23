package com.techreturners.cats;

public class LionCat extends Animal implements Cat {

    public LionCat() {
        super (110, "wild", "Roar!!!!", "Lion", "Africa");
    }

    @Override
    public String run() {
        return "I can run at 80 km/h";
    }
}
