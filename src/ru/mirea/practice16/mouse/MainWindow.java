package ru.mirea.practice16.mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Objects;

public class MainWindow extends JFrame {

    public MainWindow() {
        super("Mouse");
        setIconImage(new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png"))).getImage());
        setSize(500, 500);

        JLabel north = createLabel("NORTH", "Добро пожаловать в САО");
        JLabel center = createLabel("CENTER", "Добро пожаловать в ЦАО");
        JLabel west = createLabel("WEST", "Добро пожаловать в ЗАО");
        JLabel east = createLabel("EAST", "Добро пожаловать в ВАО");
        JLabel south = createLabel("SOUTH", "Добро пожаловать в ЮАО");


        getContentPane().add(north, BorderLayout.NORTH);
        getContentPane().add(center, BorderLayout.CENTER);
        getContentPane().add(west, BorderLayout.WEST);
        getContentPane().add(east, BorderLayout.EAST);
        getContentPane().add(south, BorderLayout.SOUTH);
    }

    private JLabel createLabel(String name, String dialogText){
        JLabel label = new JLabel(name);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(BorderFactory.createLineBorder(Color.RED));
        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(label, dialogText);
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        return label;
    }
}
