package it.develhope.fourthExercise;

public class Start {
    public static void main(String[] args) {

        Student student1 = new Student("Marco");

        Student student2 = new Student("Luca");


        Teacher teacher = new Teacher("Maria");




        student1.grade = 5;
        student2.grade = 10;

        student1.getStudentDetails();
        student2.getStudentDetails();

    }

}
