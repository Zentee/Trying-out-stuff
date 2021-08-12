package org.academiadecodigo.testingoutstuff.FinalKeyword;

public class Final {

    //global variables are called final
    public final int min = 0;
    public final int MAX = 5;
    static final double PI = 3.14159;

   final public void sayHi(){
        System.out.println("hi!");
    }

    public static void main(String[] args) {


        Final f = new Final();
        f.sayHi();

        System.out.println(f.MAX);




    }


}
