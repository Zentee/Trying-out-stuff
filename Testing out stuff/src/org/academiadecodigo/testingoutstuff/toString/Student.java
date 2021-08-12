package org.academiadecodigo.testingoutstuff.toString;

public class Student {

    public int studentId;
    public String name;


    public Student(int studentId, String name){
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString(){
        return studentId + " " + name;
    }


    /*@Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }*/
}
