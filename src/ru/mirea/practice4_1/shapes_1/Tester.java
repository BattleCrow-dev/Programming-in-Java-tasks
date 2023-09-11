package ru.mirea.practice4_1.shapes_1;

public class Tester {
    public static void main(String[] args) {
        Shape shape1 = new Circle(3);
        Shape shape2 = new Rectangle(10, 15);
        Shape shape3 = new Square(5);
        Shape shape4 = new Shape("dot");

        System.out.println("ToString: ");
        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println(shape3);
        System.out.println(shape4);
        System.out.println("\nGetType: ");
        System.out.println(shape1.getType());
        System.out.println(shape2.getType());
        System.out.println(shape3.getType());
        System.out.println(shape4.getType());
        System.out.println("\nGetArea: ");
        System.out.println(shape1.getArea());
        System.out.println(shape2.getArea());
        System.out.println(shape3.getArea());
        System.out.println(shape4.getArea());
        System.out.println("\nGetPerimeter: ");
        System.out.println(shape1.getPerimeter());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape4.getPerimeter());
    }
}
