package ru.mirea.practice6.convertable;

import java.util.Objects;

public class Value implements Convertable{
    double value;
    String system;

    public Value(double value, String system) {
        this.value = value;
        this.system = system;
    }

    @Override
    public void convert(String system) {
        if(Objects.equals(this.system, system))
            return;

        if(Objects.equals(this.system, "Фаренгейт")) {
            if (Objects.equals(system, "Цельсий")) {
                value = (5 * (value - 32)) / 9;
            } else if (Objects.equals(system, "Кельвин")) {
                value = (5 * (value - 32)) / 9 + 273;
            }
        }
        else if(Objects.equals(this.system, "Цельсий")) {
            if (Objects.equals(system, "Фаренгейт")) {
                value = 1.8 * value + 32;
            } else if (Objects.equals(system, "Кельвин")) {
                value += 273;
            }
        }
        else{
            if (Objects.equals(system, "Фаренгейт")) {
                value = 1.8 * (value - 273) + 32;
            } else if (Objects.equals(system, "Цельсий")) {
                value -= 273;
            }
        }

        this.system = system;
    }

    public double getValue() {
        return value;
    }
}
