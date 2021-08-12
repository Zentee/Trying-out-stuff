package org.academiadecodigo.testingoutstuff.Encapsulation;

public class TryEncapsulation {

    Student student;
    String name;

    public TryEncapsulation(Student student){
        this.student = student;
        student.setAge(16);
    }


    public String getName(){
        return student.getName();
    }

    public int getStudentAge(){
       return student.getAge();
    }

    public void setStudentAge(){
        student.setAge(25);
    }





}
