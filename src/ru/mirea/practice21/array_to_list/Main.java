package ru.mirea.practice21.array_to_list;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"Привет", "Пока", "Привет"};
        List<String> stringList = ArrayToListConverter.convertArrayToList(stringArray);
        System.out.println(stringList);

        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = ArrayToListConverter.convertArrayToList(intArray);
        System.out.println(intList);
    }
}
