package ru.mirea.practice13.word_mage;

import java.io.IOException;
import java.util.*;

public class Tester {
    public static boolean isChain(ArrayList<String> wordsList){
        for (int i = 0; i < wordsList.size()-1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i + 1).toLowerCase();

            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0))
                return false;
        }
        return true;
    }

    public static StringBuilder getLine(ArrayList<String> words){
        StringBuilder result = new StringBuilder();

        // Брутфорс наше всё!
        while (!isChain(words))
            Collections.shuffle(words);

        for (String word: words)
            result.append(word).append(" ");

        result.deleteCharAt(result.length() - 1);
        return result;
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scan.next();

        Scanner file = new Scanner(Objects.requireNonNull(Tester.class.getResource(fileName)).openStream());

        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(file.nextLine().split(" ")));

        StringBuilder result = getLine(wordsList);
        System.out.println(result);
    }
}
