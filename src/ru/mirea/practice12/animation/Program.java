package ru.mirea.practice12.animation;

import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setResizable(false);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
        mainWindow.Animation();
    }
}