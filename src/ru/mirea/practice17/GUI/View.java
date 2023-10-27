package ru.mirea.practice17.GUI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class View {
    private final JFrame frame;
    private final JTextField textField;
    private final JButton button;

    public View() {
        frame = new JFrame("Name frame");
        frame.setIconImage(new ImageIcon(Objects.requireNonNull(View.class.getResource("images/icon.png"))).getImage());
        textField = new JTextField(20);
        button = new JButton("Дай мне своё имя");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public String getEnteredName() {
        return textField.getText();
    }

    public void setButtonListener(ActionListener listener) {
        button.addActionListener(listener);
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }
}
