package ru.mirea.practice15.simple_calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MainWindow extends JFrame {

    public MainWindow() {
        super("Simple Calculator");
        setIconImage(new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png"))).getImage());

        TextField textField1 = new TextField();
        TextField textField2 = new TextField();

        textField1.setBounds(200,50, 100,20);
        textField2.setBounds(200,80, 100,20);

        JLabel text1 = new JLabel();
        JLabel text2 = new JLabel();
        JLabel textResult = new JLabel();

        text1.setBounds(100, 50, 100, 20);
        text1.setText("first number");
        text2.setBounds(100, 80, 100, 20);
        text2.setText("second number");
        textResult.setBounds(150, 110, 100, 20);
        textResult.setText("Result will here");

        Button additionButton = new Button("Addition");
        Button subtractionButton = new Button("Subtraction");
        Button multiplicationButton = new Button("Multiplication");
        Button divisionButton = new Button("Division");

        additionButton.setBounds(75, 150, 100, 75);
        subtractionButton.setBounds(75, 250, 100, 75);
        multiplicationButton.setBounds(225, 150, 100, 75);
        divisionButton.setBounds(225, 250, 100, 75);

        additionButton.setSize(100, 75);
        subtractionButton.setSize(100, 75);
        multiplicationButton.setSize(100, 75);
        divisionButton.setSize(100, 75);

        additionButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textResult.setText("Result : " + (Integer.parseInt(textField1.getText()) + Integer.parseInt(textField2.getText())));
            }
        });

        subtractionButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textResult.setText("Result : " + (Integer.parseInt(textField1.getText()) - Integer.parseInt(textField2.getText())));
            }
        });

        multiplicationButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textResult.setText("Result : " + Integer.parseInt(textField1.getText()) * Integer.parseInt(textField2.getText()));
            }
        });

        divisionButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                textResult.setText("Result : " + Integer.parseInt(textField1.getText()) / Integer.parseInt(textField2.getText()));
            }
        });

        add(additionButton);
        add(subtractionButton);
        add(multiplicationButton);
        add(divisionButton);
        add(textField1);
        add(textField2);
        add(text1);
        add(text2);
        add(textResult);

        setLayout(null);
        setVisible(true);
    }
}
