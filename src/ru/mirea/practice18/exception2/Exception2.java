package ru.mirea.practice18.exception2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print("Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch(NumberFormatException e) {
            System.out.println("It's not a integer!");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic exception!");
        }
    }
}
