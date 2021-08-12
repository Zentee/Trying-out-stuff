package org.academiadecodigo.testingoutstuff.DesignPatterns.Strategy;

public class Taxi implements Transport {


    @Override
    public void goTo(String place) {
        System.out.println("Going to " + place + " by taxi!");
    }



}
