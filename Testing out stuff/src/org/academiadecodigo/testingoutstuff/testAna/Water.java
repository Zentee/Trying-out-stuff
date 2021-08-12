package org.academiadecodigo.testingoutstuff.testAna;

public class Water {

    private String brand = "luso";
    private boolean hasMinerals = true;


    public void hasMinerals(){
        if(hasMinerals = false){
            System.out.println("I'm healthy");
        }
        System.out.println("I'm not healthy...");
    };







    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isHasMinerals() {
        return hasMinerals;
    }

    public void setHasMinerals(boolean hasMinerals) {
        this.hasMinerals = hasMinerals;
    }
}
