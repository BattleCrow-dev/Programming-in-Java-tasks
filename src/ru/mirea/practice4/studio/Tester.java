package ru.mirea.practice4.studio;

public class Tester {
    public static void main(String[] args) {
        Clothes[] clothes = {new Pants(Sizes.L, 1000, "black"), new Skirt(Sizes.XXS, 250, "pink"), new Tie(Sizes.M, 150, "blue"), new TShirt(Sizes.XS, 750, "white")};
        Atelier atelier = new Atelier();

        atelier.dressWomen(clothes);
        System.out.println();
        atelier.dressMan(clothes);
    }
}
