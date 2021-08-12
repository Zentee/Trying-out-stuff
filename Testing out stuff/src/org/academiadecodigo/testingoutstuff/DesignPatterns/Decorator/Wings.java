package org.academiadecodigo.testingoutstuff.DesignPatterns.Decorator;

public class Wings extends RobotUpgrader{

    public Wings(Robot robotUpgrader) {
        super(robotUpgrader);
    }

    @Override
    public String getUpgrades() {
        return robotUpgrader.getUpgrades() + " FLY AWAAAAAAAAAAAY";
    }

    @Override
    public int getCost() {
        return robotUpgrader.getCost() + 5000 ;
    }


}
