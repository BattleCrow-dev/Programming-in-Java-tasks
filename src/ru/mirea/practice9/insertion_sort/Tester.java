package ru.mirea.practice9.insertion_sort;

public class Tester {
    public static void main(String[] args) {
        Student[] students = {new Student(10), new Student(5), new Student(8), new Student(15), new Student(28), new Student(1), new Student(10)};

        for(Student student: students)
            System.out.println(student);
        System.out.println();

        // Insertion sort
        for(int i = 1; i < students.length; i++){
            for(int j = i; j > 0 && students[j - 1].compareTo(students[j]) > 0; j--){
                Student temp = students[j];
                students[j] = students[j - 1];
                students[j - 1] = temp;
            }
        }

        for(Student student: students)
            System.out.println(student);
        System.out.println();
    }
}
