package ru.mirea.practice4_1.learner;


public class Tester {
    public static void main(String[] args) {
        Learner[] learners = {new Pupil(), new Pupil(), new Student(), new Student(), new Pupil()};

        System.out.println("Pupils:");
        for(Learner learner : learners){
            if(learner instanceof Pupil)
                System.out.println(learner.getClass().getName());
        }

        System.out.println("\nStudents:");
        for(Learner learner : learners){
            if(learner instanceof Student)
                System.out.println(learner.getClass().getName());
        }
    }
}
