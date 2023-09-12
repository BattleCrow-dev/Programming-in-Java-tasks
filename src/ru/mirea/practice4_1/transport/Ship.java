package ru.mirea.practice4_1.transport;

public class Ship extends Transport {
    public Ship(double costPerKilometer, double speed) {
        super(costPerKilometer, speed);
    }

    @Override
    public void calculateCostAndTime(double kilometers) {
        System.out.println("Cost: " + getCostPerKilometer() * kilometers +"\nTime: " + kilometers / getSpeed());
    }
}
