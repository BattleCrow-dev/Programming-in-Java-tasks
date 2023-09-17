package ru.mirea.practice9.quick_sort;

public class Tester {
    public static SortingStudentsByGPA comparator = new SortingStudentsByGPA();
    public static void QuickSortReversed(Student[] students, int low, int high) {
        if (students.length == 0)
            return;

        if (low >= high)
            return;

        Student border = students[low + (high - low) / 2];

        int i = low, j = high;
        while (i <= j) {

            while (comparator.compare(students[i], border) > 0) {
                i++;
            }

            while (comparator.compare(students[j], border) < 0) {
                j--;
            }

            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            QuickSortReversed(students, low, j);

        if (high > i)
            QuickSortReversed(students, i, high);
    }

    public static void main(String[] args) {
        Student[] students = {new Student(10), new Student(5), new Student(8), new Student(15), new Student(28), new Student(1), new Student(10)};

        for(Student student: students)
            System.out.println(student);
        System.out.println();

        QuickSortReversed(students, 0, students.length - 1);

        for(Student student: students)
            System.out.println(student);
        System.out.println();
    }
}
