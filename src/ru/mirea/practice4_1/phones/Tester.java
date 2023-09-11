package ru.mirea.practice4_1.phones;

public class Tester {
    public static void main(String[] args) {
        Phone phone1 = new Phone("8(800)555-35-35", "Samsung", 150);
        Phone phone2 = new Phone("8(989)825-58-69", "Xiaomi", 125);
        Phone phone3 = new Phone("8(918)123-45-67", "LG", 100);

        System.out.println("Все поля:");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        System.out.println("\nreceiveCall(v.1):");
        phone1.receiveCall("Дима");
        phone2.receiveCall("Гриша");
        phone3.receiveCall("Вася");

        System.out.println("\ngetNumber:");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        System.out.println("\nreceiveCall(v.2):");
        phone1.receiveCall("Дима", phone2.getNumber());
        phone2.receiveCall("Гриша", phone3.getNumber());
        phone3.receiveCall("Вася", phone1.getNumber());

        System.out.println("\nsendMessage:");
        phone1.sendMessage(phone2.getNumber(), phone3.getNumber());
    }
}
