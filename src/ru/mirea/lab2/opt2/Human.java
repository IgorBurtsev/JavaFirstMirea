package ru.mirea.lab2.opt2;

public class Human {
    Head head = new Head();
    Hand hand = new Hand();
    Leg leg = new Leg();

    double height = 183.4;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "\nThe height of the human is " + height +
                " and the next parameters are:" +
                head.toString() + hand.toString() + leg.toString();
    }
}
