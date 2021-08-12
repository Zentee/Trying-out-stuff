package org.academiadecodigo.testingoutstuff.Encapsulation;

public class Main {

    public static void main(String[] args) {

        Student s = new Student();
        TryEncapsulation b = new TryEncapsulation(s);

        s.setName("suzie");


        s.setAge(15);
        b.student.setAge(20);
        b.setStudentAge();

        System.out.println(b.getName());

        System.out.println(b.getStudentAge());



    }
}
