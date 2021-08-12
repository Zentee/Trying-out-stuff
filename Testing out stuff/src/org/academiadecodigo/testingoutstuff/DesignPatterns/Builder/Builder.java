package org.academiadecodigo.testingoutstuff.DesignPatterns.Builder;

public class Builder {

    private double flour = 0d;
    private double sugar = 0d;

    public double getFlour() {
        return flour;
    }

    public double getSugar() {
        return sugar;
    }

    public int getEggs() {
        return eggs;
    }

    public double getChocolate() {
        return chocolate;
    }

    public double getMilk() {
        return milk;
    }

    private int eggs = 0;
    private double chocolate = 0d;
    private double milk = 0d;

    public Cake build() {
        return new Cake(this);
    }

    public Builder addFlour(double flour) {
        this.flour = flour;
        return this;
    }

    public Builder addSugar(double sugar){
        this.sugar = sugar;
        return this;
    }

    public Builder addEggs(int eggs){
        this.eggs = eggs;
        return this;
    }

    public Builder addChocolate(double chocolate){
        this.chocolate = chocolate;
        return this;
    }

    public Builder addMilk(double milk){
        this.milk = milk;
        return this;
    }



}
