package ru.mirea.practice4_1.transport;

public abstract class Transport {
    private final double costPerKilometer;
    private final double speed;

    public Transport(double costPerKilometer, double speed) {
        this.costPerKilometer = costPerKilometer;
        this.speed = speed;
    }

    public void calculateCostAndTime(double kilometers){
        System.out.println("Cost: " + costPerKilometer * kilometers +"\nTime: " + kilometers / speed);
    }
}
