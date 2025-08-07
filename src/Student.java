import java.awt.*;

public class Student {
    String name = "";
    int age = 0;
    String course = "";
    double grade1 = 0;
    double grade2= 0;
    double grade3 = 0;
    boolean studentPass = false;

    static int totalStudent =0;
    static int passingStudents =0;

    public Student(String studentName,int studentAge, String studentCourse, double studentGrade1, double studentGrade2, double studentGrade3){
        name = studentName;
        age = studentAge;
        course = studentCourse;
        grade1 = studentGrade1;
        grade2 = studentGrade2;
        grade3 = studentGrade3;
        totalStudent += 1;
    }

    public void displayInfo(){
        System.out.println("\nStudent Name: " + name + "," + age + "," + course);
        System.out.println("Student Grade: " + grade1 + ", " +  grade2 + ", " +  grade3);


    }

    public void calculateAverage(){
        double average = grade1 + grade2 + grade3 / 300.0 * 100;
        System.out.println("Average Score: " + average);

    }

    public void getLetterGrade(){
        double average = grade1 + grade2 + grade3 / 300.0 * 100;
        if (average >= 90) {
            System.out.println("LETTER GRADE: A");
        } else if (average >= 80) {
            System.out.println("LETTER GRADE: B");
        } else if (average >= 70) {
            System.out.println("LETTER GRADE: C");
        } else if (average >= 60) {
            System.out.println("LETTER GRADE: D");
        } else {
            System.out.println("LETTER GRADE: F");
        }
    }

    void isPassing(){
        double average = grade1 + grade2 + grade3 / 300.0 * 100;
        if(average >= 70){
            System.out.println("STATUS: PASSING");
            passingStudents +=1;
        } else {
            System.out.println("STATUS: FAILING");
        }

    }

}
