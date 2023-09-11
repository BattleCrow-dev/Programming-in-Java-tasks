package ru.mirea.practice5.shapes;

public class Shape {
    private final String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }
}
