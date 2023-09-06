package ru.mirea.practice2.point;

public class Tester {
    public static void main(String[] args) {
        int length = 10;
        Circle[] circles = new Circle[length];

        for(int i = 0; i < length; i++) {
            circles[i] = new Circle(i, i, i * i);
            System.out.println(circles[i]);
        }
    }
}
