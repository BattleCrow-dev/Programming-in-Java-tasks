package ru.mirea.practice4_1.transport;

public abstract class Transport {
    private final double costPerKilometer;
    private final double speed;

    protected Transport(double costPerKilometer, double speed) {
        this.costPerKilometer = costPerKilometer;
        this.speed = speed;
    }

    public double getCostPerKilometer() {
        return costPerKilometer;
    }

    public double getSpeed() {
        return speed;
    }

    public abstract void calculateCostAndTime(double kilometers);
}
