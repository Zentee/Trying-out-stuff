package org.academiadecodigo.testingoutstuff.DesignPatterns.Decorator;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Wings(new LaserEyes(new BasicRobot()));

        System.out.println("Upgrades: " + robot.getUpgrades());


        System.out.println("Cost: " + robot.getCost());


    }

}
