package ru.mirea.pract1.opt4;

public class TestDog {
public static void main(String[] args) {
    Dog d1 = new Dog("Мухтар", 5);
    Dog d2 = new Dog("Рекс", 3);
    Dog d3 = new Dog("Белка");
    d3.setAge(1);
    System.out.println(d1);
    d1.intoHumanAge();
    System.out.println(d2);
    d2.intoHumanAge();
    System.out.println(d3);
    d3.intoHumanAge();
}
}
