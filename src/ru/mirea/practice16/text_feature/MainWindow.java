package ru.mirea.practice16.text_feature;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MainWindow extends JFrame {

    public MainWindow() {
        super("Text feature");
        setIconImage(new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png"))).getImage());
        setSize(300, 250);

        String[] colors = {"Синий", "Красный", "Чёрный"};
        String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};

        JComboBox<String> colorBox = new JComboBox<>(colors);
        colorBox.setBounds(100, 10, 100, 20);

        JComboBox<String> fontBox = new JComboBox<>(fonts);
        fontBox.setBounds(100, 40, 100, 20);

        JTextArea text = new JTextArea("Пиши сюда текст");
        text.setBounds(50, 100, 200, 50);

        colorBox.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                String item = (String)box.getSelectedItem();

                if(Objects.equals(item, "Синий"))
                    text.setForeground(Color.blue);
                else if(Objects.equals(item, "Красный"))
                    text.setForeground(Color.red);
                else if(Objects.equals(item, "Чёрный"))
                    text.setForeground(Color.black);
            }
        });

        fontBox.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                String item = (String)box.getSelectedItem();

                if(Objects.equals(item, "Times New Roman"))
                    text.setFont(new Font("Times New Roman", Font.PLAIN, 14));
                else if(Objects.equals(item, "MS Sans Serif"))
                    text.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
                else if(Objects.equals(item, "Courier New"))
                    text.setFont(new Font("Courier New", Font.PLAIN, 14));
            }
        });

        add(colorBox);
        add(fontBox);
        add(text);

        setLayout(null);
    }
}
