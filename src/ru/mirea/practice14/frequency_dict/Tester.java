package ru.mirea.practice14.frequency_dict;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> map = new HashMap<>();

        Scanner scan = new Scanner(Objects.requireNonNull(Tester.class.getResource("text.txt")).openStream());
        String line;

        while(scan.hasNextLine()){
            line = scan.nextLine();

            for(int i = 0; i < line.length(); i++){
                if(map.containsKey(line.charAt(i)))
                    map.put(line.charAt(i), map.get(line.charAt(i)) + 1);
                else
                    map.put(line.charAt(i), 1);
            }
        }

        Character[] characters = map.keySet().toArray(new Character[0]);
        Integer[] values = map.values().toArray(new Integer[0]);

        for(int i = 0; i < characters.length; i++){
            for(int j = i; j < characters.length; j++){
                if(characters[i] > characters[j]){
                    Character temp1 = characters[i];
                    characters[i] = characters[j];
                    characters[j] = temp1;

                    Integer temp2 = values[i];
                    values[i] = values[j];
                    values[j] = temp2;
                }
            }
        }

        for(int i = 0; i < characters.length; i++)
            System.out.println(characters[i] + " : " + values[i]);
    }
}
