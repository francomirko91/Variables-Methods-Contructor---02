package it.develhope.fourthExercise;

public class Student {

    public String name;
    public int grade;


    public Student(String studentName) {
        System.out.println("The name of the student is " + studentName);
        this.name = studentName;

    }

    public void getStudentDetails() {
        System.out.println(name + " " +  grade);
    }


}
