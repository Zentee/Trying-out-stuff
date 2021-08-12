package org.academiadecodigo.testingoutstuff.BasicInheritance.mouse;

import org.academiadecodigo.testingoutstuff.BasicInheritance.mouse.Mouse;

public class Mouse1 extends Mouse {

    String texture = "Matte";




    public  void setColor(String color){
        System.out.println("color");
    }

    @Override
    public void leftClick() {
        System.out.println("lEFT CLICK HADDOOKEN");
    }

    @Override
    public void scrollUp() {
        super.scrollUp();
    }

    @Override
    public void scrollDown(){
        System.out.println("Go the fuck down");
    }

    @Override
    public void rightClick(String click){
        super.rightClick("huh?");
    }
}
