package ru.mirea.lab1.opt1;

import java.util.Scanner;
import java.util.ArrayList;

public class SumMas {
    int n;
    Scanner scan = new Scanner(System.in);
    ArrayList<Double> array = new ArrayList<>();

    public void setAmount() {
        System.out.print("Введите размер массива: ");
        n = scan.nextInt();
    }

    public void setArray() {
        System.out.println("Вводите элементы массива: ");
        for (int i=0; i<n; i++) {
            if (i==0) System.out.print("   ");
            array.add(scan.nextDouble());
            if (i!=n-1) System.out.print(" + ");
        }
    }

    public double countSumFor() {
        double sumFor = 0;
        for (int i=0; i<n; i++) {
            sumFor += array.get(i);
        }
        return sumFor;
    }

    public double countSumWhile() {
        double sumWhile = 0;
        int i = 0;
        while (i < n) {
            sumWhile += array.get(i);
            i++;
        }
        return sumWhile;
    }

    public double countSumDoWhile() {
        double sumDoWhile = 0;
        int i = 0;
        do {
            sumDoWhile +=array.get(i);
            i++;
        } while (i<n);
        return sumDoWhile;
    }
}
