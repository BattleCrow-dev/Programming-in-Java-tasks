package ru.mirea.practice4_1.employers;

public class Tester {
    public static void main(String[] args) {
        Employer[] employers = {new Employer("Дима", "Пашков", 1000), new Employer("Гриша", "Косов", 1500), new Manager("Вася", "Панов", 2000, 500)};

        for(Employer employer : employers)
            System.out.println(employer.getIncome());
    }
}
