package ru.mirea.practice13.shirt;

public class Shirt {
    private String number, name, color, size;

    public void setFields(String line){
        String[] strings = line.split(",");

        number = strings[0];
        name = strings[1];
        color = strings[2];
        size = strings[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "Артикул='" + number + "',\n" +
                "Наименование='" + name + "',\n" +
                "Цвет='" + color + "',\n" +
                "Размер='" + size + "'\n" +
                '}';
    }
}
