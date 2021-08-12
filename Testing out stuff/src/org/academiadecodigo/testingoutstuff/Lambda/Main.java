package org.academiadecodigo.testingoutstuff.Lambda;

public class Main {


    public static void main(String[] args) {

        // em runtime decidimos como usar o doOperation.

        //Fizemos uma função e dizemos o que queremos que ela faça Override.


        Calculator calculator = new Calculator();

        calculator.doOperation((n1,n2) -> n1+ n2, 8,7);

        calculator.doOperation((n1,n2) -> n1 * n2, 5,8);

        calculator.doOperation((n1,n2) -> n1 /n2, 10, 5);


        BiOperation biOperation = new BiOperation() {
            @Override
            public int add(int i1, int i2) {
                return i1 + i2;
            }
        };

        biOperation.add(9,8);

        //isto e raro fazer, normalmente queremos guardar a funcionalidade de uma funçao e deopis ismplesmente
        // invocar essa operação e mudar-lhe a funcionalidade.

        // Dentro desta variavel mesmo sendo uma função esta dentro de um objecto
        // BiOperation que tem la um metodo que é o add.
        BiOperation lambdaBi = (x, y) -> x + y;
        // em java high order functions temos á mesma que chamar o metodo.
        lambdaBi.add(5,8);


    }
}
