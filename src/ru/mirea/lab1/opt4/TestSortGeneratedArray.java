package ru.mirea.lab1.opt4;

public class TestSortGeneratedArray {
    public static void main(String[] args) {
        SortGeneratedArray prog = new SortGeneratedArray();
        prog.setAmount();
        prog.setBorders();
        System.out.println("Массив, сгенерированный классом Random:");
        prog.generator();
        prog.output();
        prog.sort();
        System.out.println();
        System.out.println("Отсортированный массив:");
        prog.output();

    }
}


