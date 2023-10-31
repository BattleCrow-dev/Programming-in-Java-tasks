package ru.mirea.practice22.RPN_calculator;

public class Main {
    public static void main(String[] args) {
        String rpnExpression = "2 3 4 5 * +";
        double result = RPNCalculator.calculateRPN(rpnExpression);

        if (Double.isNaN(result))
            System.out.println("Результат неизмерим");
        else
            System.out.println("Результат: " + result);
    }
}
