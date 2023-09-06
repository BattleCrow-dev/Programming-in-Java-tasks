package ru.mirea.practice2.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shop implements ShopInterface{
    private final List<String> computers;

    public Shop()
    {
        this.computers = new ArrayList<>();
    }
    public Shop(List<String> computers)
    {
        this.computers = computers;
    }

    @Override
    public boolean findComputer(String computer) {
        for(String comp : computers)
            if(Objects.equals(comp, computer))
                return true;
        return false;
    }

    @Override
    public void addComputer(String computer) {
        if(!computers.contains(computer))
            computers.add(computer);
    }

    @Override
    public void removeComputer(String computer) {
        computers.remove(computer);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + computers +
                '}';
    }
}
