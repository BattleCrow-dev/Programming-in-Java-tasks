package ru.mirea.practice16.passwords;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MainWindow extends JFrame {

    public MainWindow() {
        super("Password");
        setIconImage(new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png"))).getImage());
        setSize(300, 150);

        JPanel content = new JPanel(new FlowLayout());

        JPanel service = new JPanel(new FlowLayout());
        JTextField serviceText = new JTextField("      Service:");
        serviceText.setFont(new Font("Times New Roman", Font.BOLD, 14));
        serviceText.setBorder(null);
        serviceText.setEditable(false);
        JTextField serviceField = new JTextField(18);
        service.add(serviceText);
        service.add(serviceField);

        JPanel username = new JPanel(new FlowLayout());
        JTextField usernameText = new JTextField(" User name:");
        usernameText.setFont(new Font("Times New Roman", Font.BOLD, 14));
        usernameText.setBorder(null);
        usernameText.setEditable(false);
        JTextField usernameField = new JTextField(18);
        username.add(usernameText);
        username.add(usernameField);

        JPanel password = new JPanel(new FlowLayout());
        JTextField passwordText = new JTextField("   Password:");
        passwordText.setFont(new Font("Times New Roman", Font.BOLD, 14));
        passwordText.setBorder(null);
        passwordText.setEditable(false);
        JTextField passwordField = new JTextField(18);
        password.add(passwordText);
        password.add(passwordField);

        content.add(service);
        content.add(username);
        content.add(password);
        getContentPane().add(content);

        //setLayout(null);
    }
}
