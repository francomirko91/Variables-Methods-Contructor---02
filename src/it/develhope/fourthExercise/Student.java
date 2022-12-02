package it.develhope.fourthExercise;

public class Student {

    public String name;
    public int grade;


    public void creation(String studentName) {
        System.out.println("we are creating an object");
        this.name = studentName;

    }

    public void getStudentDetails() {
        System.out.println(name + grade);
    }


}
