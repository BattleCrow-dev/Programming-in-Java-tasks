package ru.mirea.practice4.seasons;

public enum Seasons {
    WINTER(-10),
    SPRING(7.5),
    SUMMER(30),
    FALL(10);

    private final double averageTemperature;

    Seasons(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription(){
        if(this == Seasons.SUMMER)
            return "Тёплое время года";

        return "Холодное время года";
    }
}
