package org.academiadecodigo.testingoutstuff.superAndThis;

public class Car extends Vehicle {

    public int maxSpeed;


    public Car(int maxSpeed){
        super();
        this.maxSpeed = maxSpeed;
        System.out.println("Car Constructor");
    }



    public void vroom(){
        super.vroom(); // super refece sempre o metodo ou a propriedade da superclass quando usado na subclasse.
    }

}
