package ru.mirea.practice15.combo_box;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MainWindow extends JFrame {

    public MainWindow() {
        super("Country info");
        setIconImage(new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png"))).getImage());

        String[] countries = {"Россия", "США", "Германия", "Франция", "Дания"};
        String[] descriptions = {"Ты выбрал Россию", "Ты выбрал США", "Ты выбрал Германию", "Ты выбрал Францию", "Ты выбрал Данию"};
        JComboBox<String> comboBox = new JComboBox<>(countries);
        comboBox.setBounds(150, 100, 100, 20);

        JLabel descriptionText = new JLabel("Тут будет описание");
        descriptionText.setBounds(150, 50, 200, 20);

        comboBox.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox) e.getSource();
                String item = (String)box.getSelectedItem();

                if(Objects.equals(item, "Россия"))
                    descriptionText.setText(descriptions[0]);
                else if(Objects.equals(item, "США"))
                    descriptionText.setText(descriptions[1]);
                else if(Objects.equals(item, "Германия"))
                    descriptionText.setText(descriptions[2]);
                else if(Objects.equals(item, "Франция"))
                    descriptionText.setText(descriptions[3]);
                else if(Objects.equals(item, "Дания"))
                    descriptionText.setText(descriptions[4]);
            }
        });

        add(comboBox);
        add(descriptionText);

        setLayout(null);
    }
}
