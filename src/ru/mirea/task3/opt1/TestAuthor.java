package ru.mirea.task3.opt1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Николай Гоголь", "gogol@mail.ru", 'm');
        author.setEmail("gogol-kolya@gmail.com");
        System.out.println(author);
    }
}
