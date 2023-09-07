package ru.mirea.practice3.shell;

public class Test {
    public static void main(String[] args) {
        Double myDoubleFromValue = Double.valueOf("123.456");
        Double myDoubleFromParse = Double.parseDouble("123.456");

        Double MyTestDouble = 12.34;

        // Приведение к примитивным типам
        int testInt = Integer.parseInt(String.valueOf(MyTestDouble));
        float testFloat = Float.parseFloat(String.valueOf(MyTestDouble));
        boolean testBoolean = Boolean.parseBoolean(String.valueOf(MyTestDouble));

        // Вывод в консоль
        System.out.println(MyTestDouble);

        // Приведение к строке
        String pi = Double.toString(3.14);
    }
}
