package ru.mirea.practice2.circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 5);
        Circle circle2 = new Circle(0, 0, 6);

        System.out.println(circle1.getArea());
        System.out.println(circle1.getLength());
        System.out.println(circle1.isThisBiggerThan(circle2));
    }
}
