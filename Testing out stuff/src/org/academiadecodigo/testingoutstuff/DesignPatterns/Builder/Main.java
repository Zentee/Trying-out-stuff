package org.academiadecodigo.testingoutstuff.DesignPatterns.Builder;


import org.academiadecodigo.testingoutstuff.DesignPatterns.Builder.Builder;
import org.academiadecodigo.testingoutstuff.DesignPatterns.Builder.Cake;

public class Main {

    public static void main(String[] args) {

        Builder madeleineBuilder = new Builder();

        madeleineBuilder
                .addFlour(200)
                .addSugar(150)
                .addEggs(2);





        Cake madeleine = madeleineBuilder.build();

    }



}
