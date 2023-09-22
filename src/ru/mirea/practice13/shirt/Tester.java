package ru.mirea.practice13.shirt;

public class Tester {
    public static void main(String[] args) {
        String[] dataBase = new String[11];
        dataBase[0] = "S001,Black Polo Shirt,Black,XL";
        dataBase[1] = "S002,Black Polo Shirt,Black,L";
        dataBase[2] = "S003,Blue Polo Shirt,Blue,XL";
        dataBase[3] = "S004,Blue Polo Shirt,Blue,M";
        dataBase[4] = "S005,Tan Polo Shirt,Tan,XL";
        dataBase[5] = "S006,Black T-Shirt,Black,XL";
        dataBase[6] = "S007,White T-Shirt,White,XL";
        dataBase[7] = "S008,White T-Shirt,White,L";
        dataBase[8] = "S009,Green T-Shirt,Green,S";
        dataBase[9] = "S010,Orange T-Shirt,Orange,S";
        dataBase[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirts = new Shirt[11];

        for(int i = 0; i < 11; i++) {
            shirts[i] = new Shirt();
            shirts[i].setFields(dataBase[i]);
            System.out.println(shirts[i]);
        }
    }
}
