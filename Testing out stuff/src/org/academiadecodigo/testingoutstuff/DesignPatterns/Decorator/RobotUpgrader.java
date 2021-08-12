package org.academiadecodigo.testingoutstuff.DesignPatterns.Decorator;

public abstract class RobotUpgrader implements Robot{

    public Robot robotUpgrader;

    public RobotUpgrader(Robot robotUpgrader){
        this.robotUpgrader = robotUpgrader;
    }


    @Override
    public String getUpgrades() {
        return robotUpgrader.getUpgrades();
    }

    @Override
    public int getCost() {
        return robotUpgrader.getCost();
    }

}
