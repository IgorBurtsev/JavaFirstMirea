package ru.mirea.lab1.opt4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class SortGeneratedArray {
    private int n, min, max;

    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> array = new ArrayList<>();

    public void setAmount() {
        System.out.println("Введите размер массива: ");
        this.n = scan.nextInt();
    }

    public void setBorders() {
        System.out.println("Введите целочисленные границы массива: ");
        this.min = scan.nextInt();
        this.max = scan.nextInt();
    }

    public void generator() {
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            array.add(generator.nextInt(max + 1 - min) + min);
        }
    }

    public void output() {
        for (int i = 0; i < n; i++) {
            System.out.print((array.get(i) + " "));
        }
    }

    public void sort() {
        Collections.sort(array);
    }
}
