package ru.mirea.practice15.difficult_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MainWindow extends JFrame {

    public MainWindow() {
        super("Calculator");
        setSize(300, 200);
        setIconImage(new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png"))).getImage());

        JPanel mainPanel = new JPanel(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setBackground(Color.LIGHT_GRAY);

        JPanel grid = new JPanel(new GridLayout(4, 4, 10, 10));

        grid.add(createNumberButton("7", textArea));
        grid.add(createNumberButton("8", textArea));
        grid.add(createNumberButton("9", textArea));
        grid.add(createOperationButton("/", textArea));
        grid.add(createNumberButton("4", textArea));
        grid.add(createNumberButton("5", textArea));
        grid.add(createNumberButton("6", textArea));
        grid.add(createOperationButton("*", textArea));
        grid.add(createNumberButton("1", textArea));
        grid.add(createNumberButton("2", textArea));
        grid.add(createNumberButton("3", textArea));
        grid.add(createOperationButton("-", textArea));
        grid.add(createNumberButton("0", textArea));
        grid.add(createPointButton(textArea));
        grid.add(createEqualsButton(textArea));
        grid.add(createOperationButton("+", textArea));

        mainPanel.add(textArea, BorderLayout.NORTH);
        mainPanel.add(grid, BorderLayout.SOUTH);

        getContentPane().add(mainPanel);
    }

    private JButton createOperationButton(String text, JTextArea textArea){
        JButton button = new JButton(text);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textArea.getText().contains("/") || textArea.getText().contains("*") || textArea.getText().contains("+") || textArea.getText().contains("-") || textArea.getText().contains("="))
                    return;

                textArea.append(text);
            }
        });

        return button;
    }

    private JButton createNumberButton(String text, JTextArea textArea){
        JButton button = new JButton(text);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textArea.getText().contains("="))
                    return;

                textArea.append(text);
            }
        });

        return button;
    }

    private JButton createEqualsButton(JTextArea textArea){
        JButton button = new JButton("=");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Проверка на присутствие операции
                if(!textArea.getText().contains("/") && !textArea.getText().contains("*") && !textArea.getText().contains("+") && !textArea.getText().contains("-"))
                    return;

                // Проверка на отсутствие знака равенства
                if(textArea.getText().contains("="))
                    return;

                // Проверка на присутствие второго операнда
                if(textArea.getText().endsWith("/") || textArea.getText().endsWith("*") || textArea.getText().endsWith("+") || textArea.getText().endsWith("-"))
                    return;

                String result;
                if (textArea.getText().contains("+")) {
                    int index = textArea.getText().indexOf('+');
                    double num1 = Double.parseDouble(textArea.getText().substring(0, index));
                    double num2 = Double.parseDouble(textArea.getText().substring(index + 1));
                    result = Double.toString(num1 + num2);
                }
                else if (textArea.getText().contains("-")) {
                    int index = textArea.getText().indexOf('-');
                    double num1 = Double.parseDouble(textArea.getText().substring(0, index));
                    double num2 = Double.parseDouble(textArea.getText().substring(index + 1));
                    result = Double.toString(num1 - num2);
                }
                else if (textArea.getText().contains("*")) {
                    int index = textArea.getText().indexOf('*');
                    double num1 = Double.parseDouble(textArea.getText().substring(0, index));
                    double num2 = Double.parseDouble(textArea.getText().substring(index + 1));
                    result = Double.toString(num1 * num2);

                } else if (textArea.getText().contains("/")) {
                    int index = textArea.getText().indexOf('/');
                    double num1 = Double.parseDouble(textArea.getText().substring(0, index));
                    double num2 = Double.parseDouble(textArea.getText().substring(index + 1));
                    result = Double.toString(num1 / num2);
                }
                else {
                    result = "NONE";
                }

                textArea.append("=" + result);
            }
        });

        return button;
    }

    private JButton createPointButton(JTextArea textArea){
        JButton button = new JButton(".");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Проверка на три точки в строке
                if(textArea.getText().indexOf('.') != textArea.getText().lastIndexOf('.'))
                    return;

                // Проверка на две точки в одном числе
                if(textArea.getText().contains(".") && !textArea.getText().contains("/") && !textArea.getText().contains("*") && !textArea.getText().contains("+") && !textArea.getText().contains("-"))
                    return;

                // Проверка на знак равенства
                if(textArea.getText().contains("="))
                    return;

                textArea.append(".");
            }
        });

        return button;
    }
}
