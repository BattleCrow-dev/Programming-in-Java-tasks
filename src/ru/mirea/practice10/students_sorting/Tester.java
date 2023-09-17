package ru.mirea.practice10.students_sorting;

import java.util.*;

public class Tester implements Comparator<Student> {
    private static Student[] students;
    private static String parameter;

    public static void setArray(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int count = scan.nextInt();

        students = new Student[count];

        String firstname;
        String lastname;
        String speciality;
        int courseNumber;
        String groupName;

        for(int i = 0; i < count; i++){
            System.out.println("\nСтудент номер " + (i + 1) + ": ");
            System.out.print("Введите имя: ");
            firstname = scan.next();
            System.out.print("Введите фамилию: ");
            lastname = scan.next();
            System.out.print("Введите специальность: ");
            speciality = scan.next();
            System.out.print("Введите номер курса: ");
            courseNumber = scan.nextInt();
            System.out.print("Введите название группы: ");
            groupName = scan.next();

            students[i] = new Student(firstname, lastname, speciality, courseNumber, groupName);
        }
    }

    public static void QuickSortReversed(Student[] students, int low, int high) {
        if (students.length == 0)
            return;

        if (low >= high)
            return;

        Student border = students[low + (high - low) / 2];

        int i = low, j = high;
        while (i <= j) {

            while (customCompare(students[i], border) > 0) {
                i++;
            }

            while (customCompare(students[j], border) < 0) {
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
    public static void QuickSort(Student[] students, int low, int high) {
        if (students.length == 0)
            return;

        if (low >= high)
            return;

        Student border = students[low + (high - low) / 2];

        int i = low, j = high;
        while (i <= j) {

            while (customCompare(students[i], border) < 0) {
                i++;
            }

            while (customCompare(students[j], border) > 0) {
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
            QuickSort(students, low, j);

        if (high > i)
            QuickSort(students, i, high);
    }
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
            if (customCompare(l[i], r[j]) <= 0)
                a[k++] = l[i++];
            else
                a[k++] = r[j++];

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];

    }

    public static void outArray(){
        System.out.println("\nСтуденты: ");
        for(Student student: students)
            System.out.println(student);
        System.out.println();
    }

    public static int customCompare(Student o1, Student o2){
        return new Tester().compare(o1, o2);
    }

    @Override
    public int compare(Student o1, Student o2) {
        if(Objects.equals(parameter, "firstname"))
            return o1.getFirstname().compareTo(o2.getFirstname());
        else if(Objects.equals(parameter, "lastname"))
            return o1.getLastname().compareTo(o2.getLastname());
        else if(Objects.equals(parameter, "speciality"))
            return o1.getSpeciality().compareTo(o2.getSpeciality());
        else if(Objects.equals(parameter, "courseNumber"))
            return o1.getCourseNumber() - o2.getCourseNumber();
        else if(Objects.equals(parameter, "groupName"))
            return o1.getGroupName().compareTo(o2.getGroupName());

        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        setArray();
        outArray();

        System.out.println("\nПо какому параметру будем сортировать? (firstname, lastname, speciality, courseNumber, groupName)");
        parameter = scan.next();

        System.out.println("\nКакую сортировку предпочитаете? (quicksort, quicksort_reverse, mergesort)");
        String sort = scan.next();

        if(Objects.equals(sort, "quicksort"))
            QuickSort(students, 0, students.length - 1);
        else if(Objects.equals(sort, "quicksort_reverse"))
            QuickSortReversed(students, 0 , students.length - 1);
        else if(Objects.equals(sort, "mergesort"))
            MergeSort(students, students.length);

        System.out.println("\nРезультат сортировки: ");
        outArray();

        System.out.println("\nПроверка сортировки склеенного массива:\n");

        Student[] students1 = {new Student("Дима", "Пашков", "Прогер", 2, "ИКБО-03-22"), new Student("Гриша", "Косов", "Прогер", 2, "ИКБО-03-22"), new Student("Васька", "Пупкин", "Нехочуха", 0, "НЕУЧ-00-00")};
        Student[] students2 = {new Student("Лена", "Головач", "Стример", 10, "ТВИЧ-10-20"), new Student("Иван", "Золо", "Тиктокер", -1, "ТИК-00-03")};

        Student[] allStudents = new Student[students1.length + students2.length];
        System.arraycopy(students1, 0, allStudents, 0, students1.length);
        System.arraycopy(students2, 0, allStudents, students1.length, students2.length);

        parameter = "courseNumber";

        for(Student student: allStudents)
            System.out.println(student);
        System.out.println();

        MergeSort(allStudents, allStudents.length);

        for(Student student: allStudents)
            System.out.println(student);
        System.out.println();
    }
}
