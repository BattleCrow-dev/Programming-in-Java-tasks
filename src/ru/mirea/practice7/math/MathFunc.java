package ru.mirea.practice7.math;

public class MathFunc implements  MathCalculable{
    @Override
    public double pow(double value, int degree) {
        return Math.pow(value, degree);
    }

    @Override
    public double complexAbs(double a, double b) {
        return Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
    }

    public double circleArea(double radius){
        return PI * radius * radius;
    }
}
