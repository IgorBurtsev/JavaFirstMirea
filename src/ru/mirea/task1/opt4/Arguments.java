package ru.mirea.task1.opt4;

public class Arguments {
    public static void main(String[] args){
        System.out.println("Всего " + args.length + " аргументов:");
        for (int i=0; i<args.length; i++) System.out.println("Аргумент " + i + ": " + args[i]);
    }
}
