package org.academiadecodigo.testingoutstuff.DesignPatterns.Decorator;

public class LaserEyes extends RobotUpgrader{

    public LaserEyes(Robot robotUpgrader) {
        super(robotUpgrader);
    }

    @Override
    public String getUpgrades() {
        return robotUpgrader.getUpgrades() + " Now has Laser Eyes!";
    }

    @Override
    public int getCost() {
        return robotUpgrader.getCost() + 2000 ;
    }


}
