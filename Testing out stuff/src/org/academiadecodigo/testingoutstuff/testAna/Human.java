package org.academiadecodigo.testingoutstuff.testAna;

public class Human {

    private Water water;
    private Food food;



    public Human(Water water, Food food){
        this.water = water;
        this.food = food;
    }





    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
