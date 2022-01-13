package com.techreturners.cats;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void checkLionDetails() {
        LionCat lion = new LionCat();
        lion.setDetails("Lion", "Africa");
        assertEquals("I am a Lion from Africa.", lion.getDetails());
    }

    @Test
    public void checkLionSpeed() {
        LionCat lion = new LionCat();
        assertEquals("I can run at 80 km/h", lion.run());
    }

    @Test
    public void checkCheetahDetails() {
        CheetahCat cheetah = new CheetahCat();
        cheetah.setDetails("Cheetah", "India");
        assertEquals("I am a Cheetah from India.", cheetah.getDetails());
    }

    @Test
    public void checkCheetahSpeed() {
        CheetahCat cheetah = new CheetahCat();
        assertEquals("I can run at 130 km/h.", cheetah.run());
    }

    @Test
    public void checkDomesticCatDetails() {
        DomesticCat tomCat = new DomesticCat();
        tomCat.setDetails("Cat", "Russia");
        assertEquals("I am a Cat from Russia.", tomCat.getDetails());
    }

    @Test
    public void checkDomesticCatSpeed() {
        DomesticCat tomCat = new DomesticCat();
        assertEquals("I am too lazy to run.", tomCat.run());
    }

    @Test
    public void checkCatIsAwake() {
        Cat domesticCat = new DomesticCat();
        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        assertTrue("Cat should be snoozing", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        Cat domesticCat = new DomesticCat();
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        Cat domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        Cat lionCat = new LionCat();
        assertEquals(1100, lionCat.getAverageHeight());
    }


    @Test
    public void feedTheLion() {
        Cat lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        Cat cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        Cat domesticCat = new DomesticCat();
        assertEquals("Purrrrrrr", domesticCat.eat());
    }
}
