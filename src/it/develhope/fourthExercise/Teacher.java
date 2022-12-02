package it.develhope.fourthExercise;

public class Teacher {
    public String teacherName;

    public Teacher(String teacherName2) {
        System.out.println("The name of the teacher is " + teacherName2);
        this.teacherName = teacherName2;
    }

    public void assignGrade(Student alum, int finalGrade) {
        alum.grade = finalGrade;



    }


}
