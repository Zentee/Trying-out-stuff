package org.academiadecodigo.testingoutstuff.Oopfun;

public class Pen {

        private String type = "gel";
        private String color = "blue";
        private int point = 10;
        private boolean clicked = false;


        public  void click(){
            this.clicked = true;
        }

        public  void unClicked(){
            this.clicked = false;
        }


    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
