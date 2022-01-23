package com.techreturners.cats;

public class CheetahCat extends Animal implements Cat {

    public CheetahCat() {
        super (90, "wild", "Zzzzzzz", "Cheetah", "India");
    }

    @Override
    public String run() {
        return "I can run at 130 km/h.";
    }
}
