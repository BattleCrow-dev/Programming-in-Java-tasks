package ru.mirea.practice4.computer;

public class Tester {
    public static void main(String[] args) {
        Computer computer = new Computer(ComputerMarks.ACER, new Processor("Intel"), new Memory("Samsung"), new Monitor("Phillips"));

        System.out.println(computer.getMark().toString());
        System.out.println(computer.getProcessor().getName());
        System.out.println(computer.getMemory().getName());
        System.out.println(computer.getMonitor().getName());
    }
}
