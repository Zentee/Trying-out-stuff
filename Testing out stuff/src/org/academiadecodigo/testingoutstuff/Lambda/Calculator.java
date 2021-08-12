package org.academiadecodigo.testingoutstuff.Lambda;

public class Calculator {


    // fazer primeiro a função e depois os argumentos.

    public int doOperation(BiOperation operation, int num1, int num2){
        return operation.add(num1,num2);
    }




    BiOperation test = Integer::sum;

    int result = test.add(5,7);




}

