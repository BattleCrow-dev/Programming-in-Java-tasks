package ru.mirea.practice21.universal_array;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        UniversalArray<Integer> intGenericArray = new UniversalArray<>(intArray);
        System.out.println(intGenericArray.getElement(2));

        String[] stringArray = {"Привет", "Пока", "Привет"};
        UniversalArray<String> stringGenericArray = new UniversalArray<>(stringArray);
        System.out.println(stringGenericArray.getElement(1));
    }
}
