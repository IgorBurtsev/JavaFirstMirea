package ru.mirea.pract1.opt2;

public class Ball {
    private String color;
    private String pattern;
    private double volume;

    public Ball () {
        color = "red";
        pattern = "solid color";
        volume = 55.8;
    }

    public Ball(String c, String p) {
        color = c;
        pattern = p;
        volume = 12.4;
    }

    public String toString() {
        return("The ball is " + color + " with a " + pattern + " pattern and it's volume equals " + volume);
    }
}

