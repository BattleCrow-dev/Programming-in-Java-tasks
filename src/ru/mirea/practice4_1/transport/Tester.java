package ru.mirea.practice4_1.transport;

public class Tester {
    public static void main(String[] args) {
        Transport[] transports = {new Airplane(1000, 150),
        new Automobile(100, 200), new Ship(750, 250),
        new Train(50, 100)};

        for(Transport transport : transports) {
            System.out.println(transport.getClass().getName());
            transport.calculateCostAndTime(5000);
            System.out.println();
        }
    }
}
