package ru.mirea.practice12.wallpapers;

import javax.swing.*;
import java.util.Objects;

public class MainWindow extends JFrame{
    public MainWindow() {
        super("Wallpapers frame");
        ImageIcon iconFile = new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png")));
        setIconImage(iconFile.getImage());
        setSize(900, 900);
    }

    public void ShowImage(String path){
        ImageIcon wallpaper = new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource(path)));
        JLabel label = new JLabel(wallpaper);
        getContentPane().add(label);
    }
}
