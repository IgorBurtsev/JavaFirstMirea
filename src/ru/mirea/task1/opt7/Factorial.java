package ru.mirea.task1.opt7;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Введите число: ");
        int n = scan.nextInt();
        System.out.print("Факториал числа " + n + " равен: " + factorial(n));
    }
    public static BigInteger factorial(int n){
        BigInteger factor = BigInteger.ONE;
        for (int i=1; i<=n; i++) factor = factor.multiply(BigInteger.valueOf(i));
        return factor;
    }
}
