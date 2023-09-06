package ru.mirea.practice2.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);

        ball.setX(10);
        ball.setY(15);
        System.out.println(ball);

        ball.setXY(1, 1);
        System.out.println(ball);

        ball.move(5, 6);
        System.out.println(ball);
    }
}
