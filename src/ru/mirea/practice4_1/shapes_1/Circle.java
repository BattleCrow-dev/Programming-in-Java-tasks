package ru.mirea.practice4_1.shapes_1;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        super("circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return super.toString() + " Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return super.getArea() + Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() + 2 * Math.PI * radius;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
