package ru.mirea.practice6.computer_shop;

public class Computer {
    private final ComputerMarks mark;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    public Computer() {
        this.mark = ComputerMarks.HP;
        this.processor = null;
        this.memory = null;
        this.monitor = null;
    }

    public Computer(ComputerMarks mark, Processor processor, Memory memory, Monitor monitor) {
        this.mark = mark;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerMarks getMark() {
        return mark;
    }

    public String getProcessor() {
        return processor.getName();
    }

    public String getMemory() {
        return memory.getName();
    }

    public String getMonitor() {
        return monitor.getName();
    }
}
