package ru.mirea.practice9.merge_sort;

public class Tester {
    public static SortingStudentsByID comparator = new SortingStudentsByID();
    public static void MergeSort(Student[] a, int n) {

        if (n < 2)
            return;

        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);

        MergeSort(l, mid);
        MergeSort(r, n - mid);

        Merge(a, l, r, mid, n - mid);
    }

    public static void Merge(Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right)
            if (comparator.compare(l[i], r[j]) <= 0)
                a[k++] = l[i++];
            else
                a[k++] = r[j++];

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];

    }

    public static void main(String[] args) {
        Student[] students1 = {new Student(10), new Student(5), new Student(8), new Student(15), new Student(28), new Student(1), new Student(10)};
        Student[] students2 = {new Student(20), new Student(10), new Student(16), new Student(30), new Student(56), new Student(2), new Student(20)};

        Student[] allStudents = new Student[students1.length + students2.length];
        System.arraycopy(students1, 0, allStudents, 0, students1.length);
        System.arraycopy(students2, 0, allStudents, students1.length, students2.length);

        for(Student student: allStudents)
            System.out.println(student);
        System.out.println();

        MergeSort(allStudents, allStudents.length);

        for(Student student: allStudents)
            System.out.println(student);
        System.out.println();
    }
}
