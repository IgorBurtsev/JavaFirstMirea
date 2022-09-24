package ru.mirea.task2.opt3;

public class Book {
    private String title;
    private String author;
    private Integer pages;

    public Book() {
        title = "The Lord of the Rings";
        author = "John Ronald Reuel Tolkien";
        pages = 600;
    }

    public Book(String t, String a, Integer p) {
        title = t;
        author = a;
        pages = p;
    }

    public String toString() {
        System.out.println("The work of the " + title
                + " was written by " + author
                + " and contains " + pages + " pages");
        return null;
    }
}

