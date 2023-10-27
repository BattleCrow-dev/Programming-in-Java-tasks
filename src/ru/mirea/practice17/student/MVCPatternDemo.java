package ru.mirea.practice17.student;

public class MVCPatternDemo {
    public static void main(String[] args) {

        Student student = retriveStudentFromDatabase();

        Student model = new Student();
        model.setName(student.getName());
        model.setRollNo(student.getRollNo());

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();
    }

    public static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Дмитрий Пашков");
        student.setRollNo("22И1200");
        return student;
    }
}
