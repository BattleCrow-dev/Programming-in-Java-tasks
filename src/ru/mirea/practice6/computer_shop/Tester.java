package ru.mirea.practice6.computer_shop;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner scan = new Scanner(System.in);
        ComputerMarks mark;
        String processor, monitor, memory;

        int command = -1;
        System.out.println("Команды: \n 1 - Добавить компьютер \n 2 - Удалить компьютер \n 3 - Найти компьютер \n 0 - Выход");
        while(command != 0){
            System.out.print("Введите команду: ");
            command = scan.nextInt();

            if(command == 1){
                System.out.print("Введите марку компьютера: ");
                mark = ComputerMarks.valueOf(scan.next());
                System.out.print("Введите название процессора: ");
                processor = scan.next();
                System.out.print("Введите название монитора: ");
                monitor = scan.next();
                System.out.print("Введите название памяти: ");
                memory = scan.next();

                shop.pushComputer(new Computer(mark, new Processor(processor), new Memory(memory), new Monitor(monitor)));
            }
            else if(command == 2){
                System.out.print("Введите марку компьютера: ");
                mark = ComputerMarks.valueOf(scan.next());
                System.out.print("Введите название процессора: ");
                processor = scan.next();
                System.out.print("Введите название монитора: ");
                monitor = scan.next();
                System.out.print("Введите название памяти: ");
                memory = scan.next();

                shop.removeComputer(new Computer(mark, new Processor(processor), new Memory(memory), new Monitor(monitor)));
            }
            else if(command == 3){
                System.out.print("Введите марку компьютера: ");
                mark = ComputerMarks.valueOf(scan.next());
                System.out.print("Введите название процессора: ");
                processor = scan.next();
                System.out.print("Введите название монитора: ");
                monitor = scan.next();
                System.out.print("Введите название памяти: ");
                memory = scan.next();

                shop.findComputer(new Computer(mark, new Processor(processor), new Memory(memory), new Monitor(monitor)));
            }
            else if(command != 0)
                System.out.println("Неверная команда!");
        }
    }
}
