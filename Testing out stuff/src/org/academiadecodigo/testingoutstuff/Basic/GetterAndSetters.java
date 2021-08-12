package org.academiadecodigo.testingoutstuff.Basic;

public class GetterAndSetters {

    String name;
    int age;

    public static void main(String[] args) {


        GetterAndSetters a = new GetterAndSetters();

        a.setName("Ricky");
        a.setAge(15);
        System.out.println(a.getAge());
        System.out.println(a.getName());
        a.printDetails();



    }
    // aqui metemos o valor do argumento que queremos dar set
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    // um getter vai devolver uma variavel
    public String getName(){
        return this.name; // aqui devolvemos a variavel que queremos
    }

    // o mesmo para esta propriedade.
    public int getAge(){
        return this.age;
    }

    public void printDetails(){
        System.out.println(getName() + "," + getAge());
    }


}
