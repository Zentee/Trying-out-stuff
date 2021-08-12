package org.academiadecodigo.testingoutstuff.DesignPatterns.Strategy;

public class Person {

    private Transport transport;

    public void goToWork() {
        transport.goTo("work");
    }

    public void goHome() {
        transport.goTo("home");
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }


}
