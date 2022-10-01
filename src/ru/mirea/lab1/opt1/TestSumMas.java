package ru.mirea.lab1.opt1;

public class TestSumMas {
    public static void main(String[] args) {
        SumMas mass = new SumMas();
        mass.setAmount();
        mass.setArray();
        System.out.println("Сумма элементов массива:");
        System.out.println("Через цикл for: " + mass.countSumFor());
        System.out.println("Через цикл while: " + mass.countSumWhile());
        System.out.println("Через цикл do while: " + mass.countSumDoWhile());
    }
}
