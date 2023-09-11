package ru.mirea.practice4_1.phones;

public class Phone {
    private final String number;
    private final String model;
    private double weight;

    public Phone() {
        this.number = "X(XXX)XXX-XX-XX";
        this.model = "None";
        this.weight = 0;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name){
        System.out.printf("Звонит %s!\n", name);
    }

    public void receiveCall(String name, String number){
        System.out.printf("Звонит %s! Его номер: %s\n", name, number);
    }

    public void sendMessage(String... receivers){
        for(String number : receivers)
            System.out.println("Отправили сообщение на номер " + number + ".");
    }
}
