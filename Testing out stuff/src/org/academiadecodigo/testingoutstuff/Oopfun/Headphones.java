package org.academiadecodigo.testingoutstuff.Oopfun;

public class Headphones {

    private String charge = "Micro usb";
    private String[] controls = {"power", "volume", "skip", "play/pause"};
    private String color = "Red/black";

    private boolean power = false;
    private int volume = 0;


    public void powerOn(){
        this.power = true;
    }

    public void powerOff(){
        this.power = false;
    }

    public String getCharge(){
        return this.charge;
    }

    public void volumeUp(){
        this.volume++;
    }

    public void volumeDown(){
        this.volume--;
    }


}
