package ru.mirea.practice13.person;

public class Person {
    private final String lastname;
    private String firstname, patronymic;

    public Person(String lastname) {
        this.lastname = lastname;
    }

    public Person(String lastname, String firstname, String patronymic) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
    }

    public String getFullName(){
        StringBuilder sb = new StringBuilder("Фамилия: " + lastname).append(";");
        if(firstname != null)
            sb.append(" Имя: ").append(firstname).append(";");

        if(patronymic != null)
            sb.append(" Отчество: ").append(patronymic).append(";");

        return sb.toString();
    }
}
