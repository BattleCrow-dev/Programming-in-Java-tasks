package ru.mirea.practice4_1.furniture;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture[] furnitures = {new Chair(700), new Table(1000), new Chair(650), new Closet(2500), new Sofa(3000)};

        for(Furniture furniture : furnitures){
            System.out.println(furniture);
        }
    }
}
