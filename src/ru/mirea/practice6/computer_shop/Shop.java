package ru.mirea.practice6.computer_shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shop {
    private List<Computer> computers;

    public Shop() {
        this.computers = new ArrayList<>();
    }

    public void pushComputer(Computer computer){
        computers.add(computer);
    }

    public void removeComputer(Computer computer){
        for(Computer comp : computers)
            if (comp.getMark() == computer.getMark() && Objects.equals(comp.getMonitor(), computer.getMonitor()) && Objects.equals(comp.getMemory(), computer.getMemory()) && Objects.equals(comp.getProcessor(), computer.getProcessor())) {
                computers.remove(comp);
                return;
            }
        System.out.println("Компьютер не найден!");
    }

    public void findComputer(Computer computer){
        for(Computer comp : computers)
            if (comp.getMark() == computer.getMark() && Objects.equals(comp.getMonitor(), computer.getMonitor()) && Objects.equals(comp.getMemory(), computer.getMemory()) && Objects.equals(comp.getProcessor(), computer.getProcessor())) {
                System.out.println("Компьютер найден!");
                return;
            }
        System.out.println("Компьютер не найден!");
    }
}
