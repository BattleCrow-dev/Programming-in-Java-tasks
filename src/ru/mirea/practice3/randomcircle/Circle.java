package ru.mirea.practice3.randomcircle;

public class Circle {
    private Point center = new Point();
    private double radius = 0;

    public Circle(){
        this.center = new Point(0, 0);
        this.radius = 1;
    }

    public Circle(double x, double y, double radius){
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public void setCenter(double x, double y){
        center.setXY(x, y);
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getLength(){
        return 2 * Math.PI * radius;
    }

    public boolean isThisBiggerThan(Circle circle){
        return radius > circle.radius;
    }
}
