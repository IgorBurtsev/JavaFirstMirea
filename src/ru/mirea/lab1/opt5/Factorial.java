package ru.mirea.lab1.opt5;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    private int n;

    public void setNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Введите число: ");
        this.n = scan.nextInt();
    }

    public BigInteger factorial(){
        BigInteger factor = BigInteger.ONE;
        for (int i=1; i<=n; i++) {
            factor = factor.multiply(BigInteger.valueOf(i));
        }
        return factor;
    }

    public String toString() {
        return "Факториал числа " + n + " равен: " + factorial();
    }
}
