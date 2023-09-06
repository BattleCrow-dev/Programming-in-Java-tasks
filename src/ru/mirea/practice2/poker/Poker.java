package ru.mirea.practice2.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    static List<String> cards = List.of("A♤", "A♡", "A♧", "A♢", "2♤", "2♡", "2♧", "2♢", "3♤", "3♡", "3♧", "3♢", "4♤", "4♡", "4♧", "4♢", "5♤", "5♡", "5♧", "5♢", "6♤", "6♡", "6♧", "6♢", "7♤", "7♡", "7♧", "7♢", "8♤", "8♡", "8♧", "8♢", "9♤", "9♡", "9♧", "9♢", "10♤", "10♡", "10♧", "10♢", "J♤", "J♡", "J♧", "J♢", "Q♤", "Q♡", "Q♧", "Q♢", "K♤", "K♡", "K♧", "K♢");

    public static void main(String[] args) {

        List<String> cards = new ArrayList<>();
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"♤", "♡", "♧", "♢"};

        for(String number : numbers)
            for(String suit : suits)
                cards.add(number + suit);

        int playersCount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        playersCount = scanner.nextInt();
        if(playersCount > 10)
            System.out.println("Слишком много игроков!");
        else if(playersCount < 1)
            System.out.println("Слишком мало игроков!");
        else{
            String[] playersHands = new String[playersCount];
            for(int i = 0; i < playersCount; i++){
                playersHands[i] = "";
                for(int j = 0; j < 5; j++){
                    int randInd = new Random().nextInt(cards.size());
                    String pick = cards.get(randInd);
                    playersHands[i] += pick + " ";
                    cards.remove(randInd);
                }
            }

            for(int i = 0; i < playersHands.length; i++){
                System.out.println("Игрок " + (i + 1) + " : " + playersHands[i]);
            }
        }
    }
}
