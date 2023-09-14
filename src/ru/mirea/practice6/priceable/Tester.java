package ru.mirea.practice6.priceable;

public class Tester {
    public static void main(String[] args) {
        Priceable[] objects = {new Car(1_000_000), new House(10_000_000), new Airplane(8_500_000)};

        for(Priceable object : objects){
            System.out.println(object.getClass() + " : " + object.getPrice());
        }
    }
}
