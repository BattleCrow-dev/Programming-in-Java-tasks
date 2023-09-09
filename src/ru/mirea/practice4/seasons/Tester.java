package ru.mirea.practice4.seasons;

public class Tester {
    public static void SayLoveToSeason(Seasons season){
        switch(season){
            case FALL -> System.out.println("Я люблю осень");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case WINTER -> System.out.println("Я люблю зиму");
        }
    }

    public static void main(String[] args) {
        for(Seasons season : Seasons.values()){
            System.out.println(season.name() + " " + season.getAverageTemperature() + " " + season.getDescription());
        }
    }
}
