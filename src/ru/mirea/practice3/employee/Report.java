package ru.mirea.practice3.employee;

public class Report {
    private static final Employee[] employees = {new Employee("Adam", 10), new Employee("Eva", 0), new Employee("Bob", 1000)};

    public static void generateReport() {
        for(Employee employee : employees){
            System.out.printf("%-10s : %10.2f", employee.getFullName(), employee.getSalary());
            System.out.println();
        }
    }
}
