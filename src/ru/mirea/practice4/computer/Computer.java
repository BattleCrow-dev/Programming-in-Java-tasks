package ru.mirea.practice4.computer;

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

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
