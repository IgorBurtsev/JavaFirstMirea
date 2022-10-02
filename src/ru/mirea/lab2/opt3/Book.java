package ru.mirea.lab2.opt3;

public class Book {
    String author = "Борис Акунин";
    String title = "Турецкий гамбит";
    int year = 1998;
    int numbOfPages = 210;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getNumbOfPages() {
        return numbOfPages;
    }
    public void setNumbOfPages(int numbOfPages) {
        this.numbOfPages = numbOfPages;
    }

    public String toString() {
        return "Книгу '" + title + "' написал " + author +
                ", она была выпущена в " + year + " году и содержит " + numbOfPages + " страниц.";
    }
}
