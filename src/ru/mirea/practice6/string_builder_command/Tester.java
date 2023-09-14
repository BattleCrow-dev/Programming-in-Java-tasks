package ru.mirea.practice6.string_builder_command;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        UndoableStringBuilder stringBuilder = new UndoableStringBuilder();
        Scanner scan = new Scanner(System.in);
        String text;
        int start, end;

        int command = -1;
        System.out.println("Список команд: \n 1 - Развернуть строку \n 2 - Добавить подстроку в конец \n 3 - Удалить подстроку \n 4 - Удалить один символ \n 5 - Заменить подстроку на другую \n 6 - Вставить подстроку \n 7 - Отменить последнее действие");
        while(command != 0){
            System.out.print("Введите команду: ");
            command = scan.nextInt();

            if(command == 1){
                stringBuilder.reverse();
                System.out.println(stringBuilder);
                System.out.println();
            }
            else if(command == 2){
                System.out.print("Введите текст для вставки в конец: ");
                text = scan.next();
                stringBuilder.append(text);
                System.out.println(stringBuilder);
                System.out.println();
            }
            else if(command == 3){
                System.out.print("Введите индекс начала подстроки: ");
                start = scan.nextInt();
                System.out.print("Введите индекс конца подстроки: ");
                end = scan.nextInt();
                stringBuilder.delete(start, end);
                System.out.println(stringBuilder);
                System.out.println();
            }
            else if(command == 4){
                System.out.print("Введите индекс символа для удаления: ");
                start = scan.nextInt();
                stringBuilder.deleteCharAt(start);
                System.out.println(stringBuilder);
                System.out.println();
            }
            else if(command == 5){
                System.out.print("Введите текст для замены: ");
                text = scan.next();
                System.out.print("Введите индекс начала подстроки: ");
                start = scan.nextInt();
                System.out.print("Введите индекс конца подстроки: ");
                end = scan.nextInt();
                stringBuilder.replace(start, end, text);
                System.out.println(stringBuilder);
                System.out.println();
            }
            else if(command == 6){
                System.out.print("Введите текст для вставки: ");
                text = scan.next();
                System.out.print("Введите офсет для вставки: ");
                start = scan.nextInt();
                stringBuilder.insert(start, text);
                System.out.println(stringBuilder);
                System.out.println();
            }
            else if(command == 7){
                stringBuilder.undo();
                System.out.println(stringBuilder);
                System.out.println();
            }
            else if(command == 0) {
                System.out.println("Пока-пока!");
            }
            else
                System.out.println("Неверная команда!");
        }
    }
}
