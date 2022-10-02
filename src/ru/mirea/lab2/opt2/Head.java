package ru.mirea.lab2.opt2;

public class Head {
    double heightOfHead = 22.5;
    double widthOfHead = 13.9;
    double heightOfEars = 6.5;
    double widthOfEyes = 2.42;
    double heightOfNose = 5.8;
    double widthOfMouth = 9.6;
    String colorOfHairs = "light brown";
    String colorOfEyes = "grey";

    public double getHeightOfHead() {
        return heightOfHead;
    }
    public void setHeightOfHead(double heightOfHead) {
        this.heightOfHead = heightOfHead;
    }

    public double getWidthOfHead() {
        return widthOfHead;
    }
    public void setWidthOfHead(double widthOfHead) {
        this.widthOfHead = widthOfHead;
    }

    public double getHeightOfEars() {
        return heightOfEars;
    }
    public void setHeightOfEars(double heightOfEars) {
        this.heightOfEars = heightOfEars;
    }

    public double getWidthOfEyes() {
        return widthOfEyes;
    }
    public void setWidthOfEyes(double widthOfEyes) {
        this.widthOfEyes = widthOfEyes;
    }

    public double getHeightOfNose() {
        return heightOfNose;
    }
    public void setHeightOfNose(double heightOfNose) {
        this.heightOfNose = heightOfNose;
    }

    public double getWidthOfMouth() {
        return widthOfMouth;
    }
    public void setWidthOfMouth(double widthOfMouth) {
        this.widthOfMouth = widthOfMouth;
    }

    public String getColorOfHairs() {
        return colorOfHairs;
    }
    public void setColorOfHairs(String colorOfHairs) {
        this.colorOfHairs = colorOfHairs;
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }
    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }

    public String toString(){
        return "\n\nHead:" +
                "\nThe height of the head is " + heightOfHead +
                "\nThe width of the head is " + widthOfHead +
                "\nThe height of the ears is " + heightOfEars +
                "\nThe width of the eyes is " + widthOfEyes +
                "\nThe height of the nose is " + heightOfNose +
                "\nThe width of the mouth is " + widthOfMouth +
                "\nThe color of hair is " + colorOfHairs +
                "\nThe color of the eyes is " + colorOfEyes;
    }
}
