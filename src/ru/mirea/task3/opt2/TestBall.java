package ru.mirea.task3.opt2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(10, 10);
        Ball ball2 = new Ball();
        System.out.println(ball1);
        ball1.move(100, 10);
        System.out.println(ball1);
        ball2.setXY(20, 5);
        ball2.move(-100, 100);
        System.out.println('\n');
        System.out.println(ball2);
    }
}
