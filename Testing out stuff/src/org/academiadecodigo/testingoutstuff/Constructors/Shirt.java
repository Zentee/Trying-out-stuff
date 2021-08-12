package org.academiadecodigo.testingoutstuff.Constructors;

public class Shirt {

    private String color;
    private char size;


    public Shirt(String color,char size){
        this.color = color;
        this.size = size;

    }

    public void putOn(){
        System.out.println("Shirt is on");
    }

    public void takeOff(){
        System.out.println("Shirt is off");
    }

}
