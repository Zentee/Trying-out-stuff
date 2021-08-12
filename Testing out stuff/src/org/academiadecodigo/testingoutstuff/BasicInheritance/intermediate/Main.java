package org.academiadecodigo.testingoutstuff.BasicInheritance.intermediate;

public class Main {

    public static void main(String[] args) {

        Shoe s = new Shoe("nike", 10);

        System.out.println(s.brand);

        Walking w = new Walking("nike", 10, true);

        System.out.println(w.goreText);

        Running r = new Running("nike", 10, 50);



    }

}
