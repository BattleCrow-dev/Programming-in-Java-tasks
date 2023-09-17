package ru.mirea.practice9.merge_sort;

public class Student implements Comparable{
    private final int idNumber;

    public Student(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student)
            return this.getIdNumber() - ((Student) o).getIdNumber();

        throw new IllegalArgumentException("Не студент!");
    }
}
