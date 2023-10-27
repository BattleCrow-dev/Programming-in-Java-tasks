package ru.mirea.practice18.exception4;

import java.util.Scanner;

public class Exception4 {
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
        finally {
            System.out.println("FINALLY!");
        }
    }
}
