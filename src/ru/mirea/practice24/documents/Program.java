package ru.mirea.practice24.documents;

import javax.swing.*;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();

        mainWindow.pushTextDocument("Привет", "Привет, это я, твой единственный ученик! \nСейчас я сдам эту работу всеми своими клонами!");
        mainWindow.pushTextDocument("Извини", "Прости, я тебя обманул в прошлом документе! \n\nЯ не единственный ученик. Есть ещё три моих кореша: \n1. Гриша Косов \n2. Тёмыч Чернов \n3. Саня Шанаев \n\n Остальные - боты на нашем сервере! Осторожно!");
        mainWindow.pushTextDocument("База", "Пары не удары, можно пропустить! \n\n0.5 + 0.5 = литр");
        mainWindow.pushTextDocument("Анекдот", "Учитель физкультуры: \n— Как на урок, так формы у вас нет! А как по району двигаться, так все в АДИДАСЕ.\n");

        mainWindow.pushImageDocument("Страшно", new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/shrek.jpg"))));
        mainWindow.pushImageDocument("Пафос", new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/robert.jpg"))));
        mainWindow.pushImageDocument("Стильно", new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/stethem.jpg"))));
        mainWindow.pushImageDocument("Мужик", new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/giga.jpg"))));
        mainWindow.pushImageDocument("Деньги", new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/dengi.jpg"))));
        mainWindow.pushImageDocument("Борец", new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/habib.jpg"))));
        mainWindow.pushImageDocument("Миленько", new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/cat.jpg"))));
        mainWindow.pushImageDocument("Анекдот", new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/masha.jpg"))));
        mainWindow.pushImageDocument("MAGNUM", new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/svarka.jpg"))));

        mainWindow.updateMenu();

        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setResizable(false);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
    }
}
