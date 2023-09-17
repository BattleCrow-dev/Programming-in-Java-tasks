package ru.mirea.practice9.quick_sort;

public class Student implements Comparable<Student> {
    private final int GPA;

    public Student(int GPA) {
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getGPA() - o.getGPA();
    }
}
