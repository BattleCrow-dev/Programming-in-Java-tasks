package ru.mirea.practice4_1.shapes_1;

public class Square extends Shape{

    private final double side;

    public Square(double side) {
        super("square");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public String toString() {
        return super.toString() + " Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double getArea() {
        return super.getArea() + side * side;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() + 4 * side;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
