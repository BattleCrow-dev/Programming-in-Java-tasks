package ru.mirea.practice4_1.employers;

public class Employer {
    private final String firstName;
    private final String lastName;
    private final int income;

    public Employer() {
        this.firstName = "None";
        this.lastName = "None";
        this.income = 0;
    }

    public Employer(String firstName, String lastName, int income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public int getIncome() {
        return income;
    }
}
