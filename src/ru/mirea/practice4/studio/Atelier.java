package ru.mirea.practice4.studio;

public class Atelier {

    public void dressWomen(Clothes[] clothes){
        for(Clothes elem : clothes){
            if(elem instanceof WomenClothing){
                ((WomenClothing) elem).dressWoman();
            }
        }
    }

    public void dressMan(Clothes[] clothes){
        for(Clothes elem : clothes){
            if(elem instanceof MenClothing){
                ((MenClothing) elem).dressMan();
            }
        }
    }
}
