package ru.mirea.lab2.opt1;

import java.lang.Math;

public class Circle {
    private double radius;

    public  Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius*2;
    }

    public double getLength() {
        return 2*Math.PI*radius;
    }

    public void output() {
        System.out.print("Радиус равен: " + radius
                + "\nДиаметр равен: ");
        System.out.printf("%.2f", getDiameter());
        System.out.print("\nДлина окружности: ");
        System.out.printf("%.2f %n %n", getLength());
    }
}
