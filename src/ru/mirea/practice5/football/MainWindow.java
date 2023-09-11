package ru.mirea.practice5.football;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MainWindow extends JFrame implements ActionListener {
    private final JLabel resultText;
    private final JLabel lastScorerText;
    private final JLabel winnerText;
    private int milanCount = 0, madridCount = 0;

    public MainWindow() {
        super("Football frame");
        ImageIcon iconFile = new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png")));
        setIconImage(iconFile.getImage());
        setSize(300, 250);

        JPanel buttonsPanel = new JPanel();
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        milanButton.setActionCommand("Push to Milan");
        madridButton.setActionCommand("Push to Madrid");
        milanButton.addActionListener(this);
        madridButton.addActionListener(this);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));

        resultText = new JLabel("Result: 0 X 0");
        resultText.setAlignmentX(Component.CENTER_ALIGNMENT);

        lastScorerText = new JLabel("Last scorer: N/A");
        lastScorerText.setAlignmentX(Component.CENTER_ALIGNMENT);

        winnerText = new JLabel("Winner: DRAW");
        winnerText.setAlignmentX(Component.CENTER_ALIGNMENT);

        buttonsPanel.add(milanButton);
        buttonsPanel.add(madridButton);
        getContentPane().add(BorderLayout.SOUTH, buttonsPanel);

        textPanel.add(resultText);
        textPanel.add(lastScorerText);
        textPanel.add(winnerText);
        getContentPane().add(BorderLayout.CENTER, textPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Push to Milan")){
            milanCount += 1;
            resultText.setText("Result: " + milanCount + " X " + madridCount);
            lastScorerText.setText("Last scorer: AC Milan");
            winnerText.setText("Winner: " + (milanCount > madridCount ? "AC Milan" : milanCount < madridCount ? "Real Madrid" : "DRAW"));
        }
        else if (e.getActionCommand().equals("Push to Madrid")){
            madridCount += 1;
            resultText.setText("Result: " + milanCount + " X " + madridCount);
            lastScorerText.setText("Last scorer: Real Madrid");
            winnerText.setText("Winner: " + (milanCount > madridCount ? "AC Milan" : milanCount < madridCount ? "Real Madrid" : "DRAW"));
        }
    }
}
