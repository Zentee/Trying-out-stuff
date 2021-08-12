package org.academiadecodigo.testingoutstuff.Basic;

public class Recursions {

    public static void main(String[] args) {



        sayHi(5);
        countBackwards(10);

    }


    // começar sempre com o base case de uma recursion senão arrebenta.

    public static void countBackwards(int n){
        if(n == 0){
            System.out.println("done");
        }else {
            System.out.println(n);
            n--;
            countBackwards(n);

        }
    }



    public static void sayHi(int n){
        if(n == 0){
            System.out.println("Done!");
        } else {
            System.out.println("hi");
            n--;
            sayHi(n);

        }
    }

    //need a base case so recursion doesn't happen forever.
    // simple recursion example with the base case being the if statement.
}
