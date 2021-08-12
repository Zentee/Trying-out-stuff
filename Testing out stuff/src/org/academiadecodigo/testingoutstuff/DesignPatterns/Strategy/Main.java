package org.academiadecodigo.testingoutstuff.DesignPatterns.Strategy;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        Transport taxi = new Taxi();
        Transport bus = new Bus();

        person.setTransport(taxi);
        person.goToWork(); // "Going to work by taxi!"
        person.setTransport(bus);
        person.goToWork(); // "Going to work by bus!"

    }
}
