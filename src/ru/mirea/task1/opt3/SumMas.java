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
        int sum = 0;
        i = 0;
        while (i < n) {
            sum += array.get(i);
            i++;
        }
        System.out.print("Сума элементов массива равна: ");
        System.out.print(sum);
    }
}
