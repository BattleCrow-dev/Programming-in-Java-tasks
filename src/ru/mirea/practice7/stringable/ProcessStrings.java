package ru.mirea.practice7.stringable;

public class ProcessStrings implements Stringable{
    @Override
    public int getCharCount(String text) {
        return text.length();
    }

    @Override
    public String deleteEven(String text) {
        StringBuilder result = new StringBuilder();

        for(int i = 1; i < text.length(); i += 2)
            result.append(text.charAt(i));

        return result.toString();
    }

    @Override
    public String reverse(String text) {
        StringBuilder result = new StringBuilder();

        for(int i = text.length() - 1; i >= 0; i--){
            result.append(text.charAt(i));
        }

        return result.toString();
    }
}
