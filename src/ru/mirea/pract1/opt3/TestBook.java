package ru.mirea.pract1.opt3;

public class TestBook {
    public static void main (String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Harry Potter and Philosopher's stone", "J.K.Rowling", 399);
        Book b3 = new Book("Турецкий гамбит", "Борис Акунин", 268);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
