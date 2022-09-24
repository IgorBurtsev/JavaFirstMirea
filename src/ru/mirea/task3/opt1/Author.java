package ru.mirea.task3.opt1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String e, char g) {
        this.name = n;
        this.email = e;
        this.gender = g;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String e) {
        this.email = e;
    }
    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}
