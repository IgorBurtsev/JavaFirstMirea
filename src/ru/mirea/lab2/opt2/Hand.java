package ru.mirea.lab2.opt2;

public class Hand {
    double lengthOfMiddleFinger = 7.5;
    double widthOfPalm = 17;
    double lengthOfUlna = 38.5;
    double lengthOfHumerus = 37.8;

    public double getLengthOfMiddleFinger(){
        return lengthOfMiddleFinger;
    }
    public void setLengthOfMiddleFinger(double lengthOfMiddleFinger){
        this.lengthOfMiddleFinger = lengthOfMiddleFinger;
    }

    public double getWidthOfPalm() {
        return widthOfPalm;
    }
    public void setWidthOfPalm(double widthOfPalm) {
        this.widthOfPalm = widthOfPalm;
    }

    public double getLengthOfUlna() {
        return lengthOfUlna;
    }
    public void setLengthOfUlna(double lengthOfUlna) {
        this.lengthOfUlna = lengthOfUlna;
    }

    public double getLengthOfHumerus() {
        return lengthOfHumerus;
    }
    public void setLengthOfHumerus(double lengthOfHumerus) {
        this.lengthOfHumerus = lengthOfHumerus;
    }

    public String toString(){
        return "\n\nHand:" +
                "\nThe length of middle finger is " + lengthOfMiddleFinger +
                "\nThe width of palm is " + widthOfPalm +
                "\nThe length of ulna is " + lengthOfUlna +
                "\nThe length of humerus is " + lengthOfHumerus;
    }
}
