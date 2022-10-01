package ru.mirea.pract1.opt1;

public class TestShape {
    public static void main(String[] args) {
        Shape sh1 = new Shape();
        Shape sh2 = new Shape("rectangle");
        Shape sh3 = new Shape(265.9, 57.8);
        System.out.println(sh1);
        System.out.println(sh2);
        System.out.println(sh3);
    }
}
