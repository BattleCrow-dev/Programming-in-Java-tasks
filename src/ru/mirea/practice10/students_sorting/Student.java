package ru.mirea.practice10.students_sorting;

public class Student {
    private String firstname;
    private String lastname;
    private String speciality;
    private int courseNumber;
    private String groupName;

    public Student(String firstname, String lastname, String speciality, int courseNumber, String groupName) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.speciality = speciality;
        this.courseNumber = courseNumber;
        this.groupName = groupName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", speciality='" + speciality + '\'' +
                ", courseNumber=" + courseNumber +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
