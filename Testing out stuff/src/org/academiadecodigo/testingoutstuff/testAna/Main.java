package org.academiadecodigo.testingoutstuff.testAna;

public class Main {

    public static void main(String[] args) {

        Water waterForHuman = new Water();
        Food foodForHuman = new Food();


        Human Ana = new Human(waterForHuman,foodForHuman);


        waterForHuman.hasMinerals();
        foodForHuman.bestTypeOfStyle();



    }


}
