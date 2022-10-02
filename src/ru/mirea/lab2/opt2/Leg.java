package ru.mirea.lab2.opt2;

public class Leg {
    double lengthOfHip = 75.7;
    double lengthOfShin = 72.3;
    double lengthOfFoot = 23.6;

    public double getLengthOfHip() {
        return lengthOfHip;
    }
    public void setLengthOfHip(double lengthOfHip) {
        this.lengthOfHip = lengthOfHip;
    }

    public double getLengthOfShin() {
        return lengthOfShin;
    }
    public void setLengthOfShin(double lengthOfShin) {
        this.lengthOfShin = lengthOfShin;
    }

    public double getLengthOfFoot() {
        return lengthOfFoot;
    }
    public void setLengthOfFoot(double lengthOfFoot) {
        this.lengthOfFoot = lengthOfFoot;
    }

    public String toString() {
        return "\n\nLeg:" +
                "\nThe length of the hip is " + lengthOfHip +
                "\nThe length of the shin is " + lengthOfShin +
                "\nThe length of the foot is " + lengthOfFoot;
    }
}
