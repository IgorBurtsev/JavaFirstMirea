package ru.mirea.lab1.opt3;

public class HarmonicSeries {
    public void output() {
        final int ONE = 1;
        System.out.print("                                   ");
        for (int n=0; n<9; n++) System.out.print(ONE + "   ");
        System.out.print("\nГармонический ряд из 10 чисел: 1 + ");
        for (int n=0; n<8; n++) System.out.print("- + ");
        System.out.print("--\n                                   ");
        for (int n=2; n<=10; n++) System.out.print(n + "   ");
    }
}
