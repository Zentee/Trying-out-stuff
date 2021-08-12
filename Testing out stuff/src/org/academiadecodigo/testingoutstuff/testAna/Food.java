package org.academiadecodigo.testingoutstuff.testAna;

public class Food {

    private String vegan = "vegetables";
    private String omnivero = "carne";


    public void bestTypeOfStyle(){
        System.out.println(vegan);
    }

    public String getVegan() {
        return vegan;
    }

    public void setVegan(String vegan) {
        this.vegan = vegan;
    }

    public String getOmnivero() {
        return omnivero;
    }

    public void setOmnivero(String omnivero) {
        this.omnivero = omnivero;
    }
}
