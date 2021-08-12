package org.academiadecodigo.testingoutstuff.Basic;

public class Main3 {


    public static void main(String[] args) {


    Student s = new Student();


        s.setGrade(99).setName("Bob");


        System.out.println(s.name + " " + s.grade);

    }
}

class Student{

    String name;
    int grade;

    public Student setName(String name){
        this.name = name;
        return this;
    }

    public Student setGrade(int grade){
        this.grade = grade;
        return this;
    }
    // na assinatura do metodo declarar o retorno como o tipo da classe.
    // no retorno do metdodo retornar this para devolver a propria classe
    // e assim conseguimos fazer method chaining. Isto é possivel por causa do retorno final do this(a classe).

}
