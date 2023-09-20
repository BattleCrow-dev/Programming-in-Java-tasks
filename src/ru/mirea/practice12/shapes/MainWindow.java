package ru.mirea.practice12.shapes;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Random;

public class MainWindow extends JFrame{
    public MainWindow() {
        super("Geometry frame");
        ImageIcon iconFile = new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png")));
        setIconImage(iconFile.getImage());
        setSize(600, 600);
    }

    @Override
    public void paint(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        Image img = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        graphics2D.drawImage(img, 0, 0, 600, 600, this);

        random_shapes_paint(graphics2D);
    }

    void random_shapes_paint(Graphics2D g) {
        Random rand = new Random();
        Circle[] circles = {new Circle(50, 50, 50), new Circle(100, 350, 100)};
        Rectangle[] rectangles = {new Rectangle(100, 200, 400, 400), new Rectangle(200, 100, 100, 50)};
        Square[] squares = {new Square(50, 100, 400), new Square(200, 250, 250)};
        for (int i = 0; i < 20; i++) {
            int choice = rand.nextInt(1, 4);

            switch (choice) {
                case 1 -> {
                    int f = rand.nextInt(0, rectangles.length);
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int)rectangles[f].getXPos(),
                            (int)rectangles[f].getYPos(),
                            (int)rectangles[f].getSide1(),
                            (int)rectangles[f].getSide2()
                    );
                }
                case 2 -> {
                    int f = rand.nextInt(0, circles.length);
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillOval(
                            (int)circles[f].getXPos(),
                            (int)circles[f].getYPos(),
                            (int)circles[f].getRadius() * 2,
                            (int)circles[f].getRadius() * 2
                    );
                }
                case 3 -> {
                    int f = rand.nextInt(0, squares.length);
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int)squares[f].getXPos(),
                            (int)squares[f].getYPos(),
                            (int)squares[f].getSide(),
                            (int)squares[f].getSide()
                    );
                }
            }
        }
    }
}
