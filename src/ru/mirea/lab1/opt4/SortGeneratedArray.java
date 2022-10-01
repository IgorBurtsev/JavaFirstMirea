package ru.mirea.lab1.opt4;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class SortGeneratedArray {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int n, min, max;
        System.out.print("Введите размер массива: ");
        n = scan.nextInt();
        System.out.println("Введите целочисленные границы диапазона массива: ");
        min = scan.nextInt();
        max = scan.nextInt();

        //Генерация методом Math.random
        System.out.println("Массив, сгенерированный методом Math.random:");
        for (int i = 0; i < n; i++) {
            array.add((int) (Math.random() * (max - min + 1)) + min);
            System.out.print(array.get(i) + " ");
        }
        Collections.sort(array);
        System.out.println();
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        System.out.println();
        array.removeAll(array);

        //Генерация классом Random
        System.out.println("Массив, сгенерированный классом Random:");
        Random generator = new Random();
        for (int i=0; i<n; i++) {
            array.add(generator.nextInt(max+1-min)+min);
            System.out.print(array.get(i) + " ");
        }
        Collections.sort(array);
        System.out.println();
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array.get(i) + " ");
        }
    }

}


