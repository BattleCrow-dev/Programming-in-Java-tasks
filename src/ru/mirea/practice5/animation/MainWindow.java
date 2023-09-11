package ru.mirea.practice5.animation;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MainWindow extends JFrame{
    public MainWindow() {
        super("Animation frame");
        ImageIcon iconFile = new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png")));
        setIconImage(iconFile.getImage());
        setSize(175, 175);
    }

    public void Animation(){
        JLabel label = new JLabel();
        getContentPane().add(label);

        ImageIcon[] images = new ImageIcon[107];
        for(int i = 0; i < 107; i++) {
            if(i < 10)
                images[i] = new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/tile00" + i + ".png")));
            else if(i < 100){
                images[i] = new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/tile0" + i + ".png")));
            }
            else{
                images[i] = new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/tile" + i + ".png")));
            }
        }

        int i = 0;
        while(true) {
            label.setIcon(images[i]);
            i = (i + 1) % 107;
            try {Thread.sleep(50); } catch (InterruptedException ignored) {};
        }


    }
}
