package org.academiadecodigo.testingoutstuff.DesignPatterns.Decorator;

public class BasicRobot implements Robot {


    @Override
    public String getUpgrades() {
        return "Basic Robot";
    }

    @Override
    public int getCost() {
        return 10000;
    }
}
