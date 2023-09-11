package ru.mirea.practice5.shapes;

public class Rectangle extends Shape {

    private final double xPos, yPos;
    private final double side1, side2;

    public Rectangle(double side1, double side2, double xPos, double yPos) {
        super("rectangle");
        this.side1 = side1;
        this.side2 = side2;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public String toString() {
        return super.toString() + " Rectangle{" +
                "side1=" + side1 + ", " +
                "side2=" + side2 +
                '}';
    }

    @Override
    public double getArea() {
        return super.getArea() + side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() + 2 * (side1 + side2);
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
