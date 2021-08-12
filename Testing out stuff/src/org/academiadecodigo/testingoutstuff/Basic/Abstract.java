package org.academiadecodigo.testingoutstuff.Basic;

abstract class dog{

    //abstract classes are good for those superclasses that share all these methods.
    // all dogs bark, all dogs poop etc etc. Inheritance.
    public void bark(){
        System.out.println("bark!");
    }


    public abstract void poop(); /*
     somos obrigados a instacear estes metodos nas classes que herdam porque não foram definidos.
    */
}


class Chihuahua extends dog{


    @Override
    public void poop() {
        System.out.println("Dog Pooped");
    }
}



public class Abstract {

    public static void main(String[] args) {

        Chihuahua c = new Chihuahua();

        c.bark();
        c.poop();


    }

}
