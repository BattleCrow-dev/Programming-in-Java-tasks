package ru.mirea.practice9.my_comparable;

public class Student implements Comparable<Student>{
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
    public int compareTo(Student o) {
        return this.getIdNumber() - o.getIdNumber();
    }
}
