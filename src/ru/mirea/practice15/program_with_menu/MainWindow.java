package ru.mirea.practice15.program_with_menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MainWindow extends JFrame {

    public MainWindow() {
        super("Menu program");
        setSize(512, 128);
        setIconImage(new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png"))).getImage());

        JPanel mainPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(2, 1, 5, 5);

        mainPanel.setLayout(gridLayout);

        JMenuBar menuPanel = new JMenuBar();
        JPanel buttonsPanel = new JPanel();
        JTextArea textAreaPanel = new JTextArea();

        // Menu panel
        menuPanel.add(createFileMenu());
        menuPanel.add(createEditMenu());
        menuPanel.add(createHelpMenu());

        // Buttons panel
        buttonsPanel.add(createButton("Press me!"));
        buttonsPanel.add(createButton("Also press me!"));
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Text area panel
        textAreaPanel.add(createTextArea());

        setJMenuBar(menuPanel);
        mainPanel.add(buttonsPanel);
        mainPanel.add(textAreaPanel);

        getContentPane().add(mainPanel);
    }

    private JMenu createFileMenu()
    {
        JMenu fileMenu = new JMenu("File");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        fileMenu.add(save);
        fileMenu.add(exit);

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("File Saved");
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Please, press exit button");
            }
        });

        return fileMenu;
    }

    private JMenu createEditMenu()
    {
        JMenu editMenu = new JMenu("Edit");

        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem insert = new JMenuItem("Insert");

        editMenu.add(copy);
        editMenu.add(cut);
        editMenu.add(insert);

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("String copied");
            }
        });

        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("String cut out");
            }
        });

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("String inserted");
            }
        });

        return editMenu;
    }

    private JMenu createHelpMenu()
    {
        JMenu helpMenu = new JMenu("Help");

        JMenuItem help = new JMenuItem("Open help");

        helpMenu.add(help);

        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("NOBODY HELPS YOU");
            }
        });

        return helpMenu;
    }

    private JButton createButton(String name){
        JButton button = new JButton(name);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("CLICK");
            }
        });

        return button;
    }

    private JTextArea createTextArea(){
        JTextArea textArea = new JTextArea();

        textArea.setFont(Font.getFont(Font.SANS_SERIF));

        return textArea;
    }
}
