package ru.mirea.practice5.shapes;

public class Circle extends Shape {

    private final double xPos, yPos;
    private final double radius;

    public Circle(double radius, double xPos, double yPos) {
        super("circle");
        this.radius = radius;
        this.xPos = xPos;
        this.yPos = yPos;
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

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }
}
