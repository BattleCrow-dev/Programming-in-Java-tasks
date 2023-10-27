package ru.mirea.practice17.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.setButtonListener(new ButtonListener());
    }

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = view.getEnteredName();
            model.setName(name);
            view.displayMessage("Здарова, " + model.getName() + "!");
        }
    }
}
