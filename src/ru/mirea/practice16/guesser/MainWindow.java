package ru.mirea.practice16.guesser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MainWindow extends JFrame {

    static int tryCount = 1;
    static final int answer = (int) (Math.random() * 20);

    public MainWindow() {
        super("Guesser");
        setIconImage(new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png"))).getImage());
        setSize(250, 200);

        JTextField nameText = new JTextField("Угадай-ка!");
        nameText.setBounds(75, 0, 100 ,20);
        nameText.setFont(new Font("serif", Font.PLAIN, 20));
        nameText.setEditable(false);
        nameText.setBorder(null);

        JTextField tryText = new JTextField("Попытка: 1");
        tryText.setBounds(125, 20, 100 ,20);
        tryText.setFont(new Font("serif", Font.PLAIN, 14));
        tryText.setEditable(false);
        tryText.setBorder(null);

        JTextField descText = new JTextField("Введите число от 0 до 20");
        descText.setBounds(50, 60, 150 ,20);
        descText.setFont(new Font("serif", Font.PLAIN, 12));
        descText.setEditable(false);
        descText.setBorder(null);

        JTextField numText = new JTextField();
        numText.setBounds(125, 80, 50 ,20);
        numText.setFont(new Font("serif", Font.PLAIN, 12));

        JButton checkButton = new JButton("Проверить");
        checkButton.setBounds(75, 120, 100 ,20);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Integer.parseInt(numText.getText());
                }
                catch (Exception exception){
                    descText.setText("Вы ввели не число");
                    return;
                }

                int value = Integer.parseInt(numText.getText());

                if(value < 0 || value > 20){
                    descText.setText("Вы ввели число не из диапазона");
                    return;
                }

                tryText.setText("Попытка: " + ++tryCount);

                if(value > answer){
                    descText.setText("Ваше число больше");
                }
                else if(value < answer){
                    descText.setText("Ваше число меньше");
                }
                else{
                    descText.setText("Угадал!");
                }

                if(tryCount > 3){
                    descText.setText("Вы проиграли!");
                    tryText.setText("Попытка: ∞");
                }
            }
        });

        add(nameText);
        add(tryText);
        add(descText);
        add(numText);
        add(checkButton);

        setLayout(null);
    }
}
