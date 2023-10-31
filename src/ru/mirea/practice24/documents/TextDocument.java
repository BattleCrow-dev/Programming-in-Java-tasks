package ru.mirea.practice24.documents;

import javax.swing.*;

public class TextDocument implements IDocument {
    private String text;
    private String name;

    public TextDocument(String name) {
        this.name = name;
        this.text = "Напиши тут что-нибудь!";
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getTextValue() {
        return text;
    }

    @Override
    public ImageIcon getImageValue() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
