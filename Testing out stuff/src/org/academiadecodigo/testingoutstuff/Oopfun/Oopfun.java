package org.academiadecodigo.testingoutstuff.Oopfun;

public class Oopfun {

    public static void main(String[] args) {


        Pen p = new Pen();


        System.out.println(p.getColor());
        System.out.println(p.getPoint());
        System.out.println(p.getType());


        System.out.println(p.isClicked());

        p.click();

        System.out.println(p.isClicked());



    }


}
