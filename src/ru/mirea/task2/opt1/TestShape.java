package ru.mirea.task2.opt1;

public class TestShape {
    public static void main(String[] args) {
        Shape sh1 = new Shape();
        Shape sh2 = new Shape("rectangle");
        Shape sh3 = new Shape(265.9, 57.8);
        sh1.toString();
        sh2.toString();
        sh3.toString();
    }
}
