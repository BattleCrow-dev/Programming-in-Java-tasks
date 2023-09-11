package ru.mirea.practice5.shapes;

public class Square extends Shape {

    private final double xPos, yPos;
    private final double side;

    public Square(double side, double xPos, double yPos) {
        super("square");
        this.side = side;
        this.xPos = xPos;
        this.yPos = yPos;
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

    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }
}
