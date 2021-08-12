package org.academiadecodigo.testingoutstuff.BasicInheritance.mouse;

public class Main {
    public static void main(String[] args) {


        Mouse m = new Mouse();
        Mouse1 m1 = new Mouse1();
        Mouse2 m2 = new Mouse2();


        m.rightClick("try this");
        m1.rightClick("Doesn't matter");

        m.leftClick();
        m.scrollUp();
        m.scrollDown();

        m1.leftClick();
        m1.scrollDown();
        m1.scrollUp();


        //relembrar que quando pomos super. antes de um metodo criado numa subclasse ele vai invocar o metodo
        //da super class. Mas no construtor ele invoca os dois o seu e da super class.

        //ver o mouse1 por exemplo para ver o OVERRIDE

        //Se quiser os metodos da superclass posso simplesmente invocar o super thats it.

        // Relembrar que o super invoca sempre o metodo da superclass ou os parametros como são da superclass.
        // se no mouse eu tiver Haddoken na string do sout, mesmo que eu mude no mouse1 para seja o que for
        // ou mesmo na classe main, quando eu invocar o super vai ser sempre haddoken.


    }
}
