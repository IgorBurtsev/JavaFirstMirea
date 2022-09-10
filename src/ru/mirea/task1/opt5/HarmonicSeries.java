package ru.mirea.task1.opt5;

public class HarmonicSeries {
    public static void main(String[] args) {
        final int ONE = 1;
        System.out.print("                                   ");
        for (int n=0; n<9; n++) System.out.printf("%s   ", ONE);
        System.out.printf("%nГармонический ряд из 10 чисел: 1 + ");
        for (int n=0; n<8; n++) System.out.print("- + ");
        System.out.printf("--%n                                   ");
        for (int n=2; n<=10; n++) System.out.printf("%s   ", n);
    }
}