package ru.mirea.task1.opt3;

import java.util.ArrayList;
import java.util.Scanner;
public class SumMas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.print("Введите размер массива: ");
        int n, i;
        n = scan.nextInt();
        System.out.println("Вводите элементы массива: ");
        for (i=0; i<n; i++){
            if (i==0) System.out.print("   ");
            array.add(scan.nextInt());
            if (i!=n-1) System.out.print(" + ");
        }

        int sumFor = 0, sumWhile=0, sumDoWhile=0;

        for (i=0; i<n; i++) {
            sumFor += array.get(i);
        }

        i = 0;
        while (i < n) {
            sumWhile += array.get(i);
            i++;
        }

        i = 0;
        do {
            sumDoWhile +=array.get(i);
            i++;
        } while (i<n);

        System.out.print("Сумма элементов массива через цикл for: ");
        System.out.println(sumFor);
        System.out.print("Сумма элементов массива через цикл while: ");
        System.out.println(sumWhile);
        System.out.print("Сума элементов массива через цикл do while: ");
        System.out.print(sumDoWhile);
    }
}
