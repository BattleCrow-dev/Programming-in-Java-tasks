package ru.mirea.practice4_1.employers;

public class Manager extends Employer{
    int averageSum;

    public Manager() {
        super();
        this.averageSum = 0;
    }

    public Manager(int averageSum) {
        super();
        this.averageSum = averageSum;
    }

    public Manager(String firstName, String lastName, int income, int averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public int getIncome() {
        return super.getIncome() + averageSum;
    }
}
