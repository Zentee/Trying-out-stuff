package org.academiadecodigo.testingoutstuff.EnumsAreFun;

public class EnumsAreFun {

    public static void main(String[] args) {

        //Relembrar enums para coisas que nao mudam, mas queremos aceder.
        //E o casamento entre enums e switch cases;


        LetsDoEnums flavour = LetsDoEnums.CHOCOLATE;

        switch(flavour){
            case VANILLA:
                System.out.println("This is strawberry");
                break;

            case CHOCOLATE:
                System.out.println("This is chocolate");
                break;

            case STRAWBERRY:
                System.out.println("This is strawberry");
                break;
        }



    }

}
