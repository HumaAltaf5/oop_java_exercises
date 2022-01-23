package com.techreturners.cats;

public class DomesticCat extends Animal implements Cat {
    private boolean isAsleep = false;

    public DomesticCat() {
        super (23, "domestic", "Purrrrrrr", "Cat", "Russia");
    }

    @Override
    public String run() {
        return "I am too lazy to run.";
    }
}
