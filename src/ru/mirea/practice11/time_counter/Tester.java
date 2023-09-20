package ru.mirea.practice11.time_counter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        long start, end;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 1. Вставка
        start = System.currentTimeMillis();
        for(int i = 0; i < 10_000_000; i++){
            arrayList.add(i);
        }
        end = System.currentTimeMillis();

        System.out.println("Время вставки (ArrayList): " + (end - start));

        start = System.currentTimeMillis();
        for(int i = 0; i < 10_000_000; i++){
            linkedList.add(i);
        }
        end = System.currentTimeMillis();

        System.out.println("Время вставки (LinkedList): " + (end - start));
        System.out.println();

        // 2. Удаление
        start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            arrayList.remove(0);
        }
        end = System.currentTimeMillis();

        System.out.println("Время удаления (ArrayList): " + (end - start));

        start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            linkedList.remove(0);
        }
        end = System.currentTimeMillis();

        System.out.println("Время удаления (LinkedList): " + (end - start));
        System.out.println();

        // 3. Поиск
        start = System.currentTimeMillis();
        arrayList.indexOf(123456);
        end = System.currentTimeMillis();

        System.out.println("Время поиска (ArrayList): " + (end - start));

        start = System.currentTimeMillis();
        arrayList.indexOf(123456);
        end = System.currentTimeMillis();

        System.out.println("Время поиска (LinkedList): " + (end - start));
        System.out.println();
    }
}
