package ru.mirea.lab1.opt5;

public class TestFactorial {
    public static void main (String[] args) {
        int n;
        Factorial factor = new Factorial();
        factor.setNumber();
        factor.factorial();
        System.out.println(factor);
    }
}
