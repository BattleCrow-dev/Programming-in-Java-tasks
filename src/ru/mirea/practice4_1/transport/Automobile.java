package ru.mirea.practice4_1.transport;

public class Automobile extends Transport {
    public Automobile(double costPerKilometer, double speed) {
        super(costPerKilometer, speed);
    }

    @Override
    public void calculateCostAndTime(double kilometers) {
        System.out.println("Cost: " + getCostPerKilometer() * kilometers +"\nTime: " + kilometers / getSpeed());
    }
}
