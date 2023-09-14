package ru.mirea.practice3.random_circle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        int length = 7;
        Circle[] circles = new Circle[length];
        Random rand = new Random();

        for(int i = 0; i < length; i++){
            circles[i] = new Circle(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());
        }

        sortCircles(circles);
        for(Circle circle : circles)
            System.out.println(circle);
    }

    public static Circle findSmallestCircle(Circle[] circles){
        Circle minCircle = new Circle(0, 0, Double.MAX_VALUE);

        for(Circle circle : circles){
            if(circle.getArea() < minCircle.getArea()){
                minCircle = circle;
            }
        }

        return minCircle;
    }

    public static Circle findBiggestCircle(Circle[] circles){
        Circle maxCircle = new Circle(0, 0, Double.MIN_VALUE);

        for(Circle circle : circles){
            if(circle.getArea() > maxCircle.getArea()){
                maxCircle = circle;
            }
        }

        return maxCircle;
    }

    public static void sortCircles(Circle[] circles){
        Arrays.sort(circles, Comparator.comparingDouble(Circle::getArea));
    }
}
