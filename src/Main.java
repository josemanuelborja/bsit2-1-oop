import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Your First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Your Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Your Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Your Section: ");
        String section = scanner.nextLine();

        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.print("\nEnter Midterm Exam Score: ");
        int midtermExamScore = scanner.nextInt();

        System.out.print("Enter Final Exam Score: ");
        int finalExamScore = scanner.nextInt();

        System.out.print("Enter Project Score: ");
        int projectScore = scanner.nextInt();

        System.out.print("Enter Attendance Score: ");
        int attendanceScore = scanner.nextInt();

        int averageScore = midtermExamScore + finalExamScore + projectScore + attendanceScore;
        double allOverScore  = averageScore / 400.0 * 100;

        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermExamScore);
        System.out.println("Final Exam Score: " + finalExamScore);
        System.out.println("Project Score:" + projectScore);
        System.out.println("Attendance Score:" + attendanceScore);
        System.out.println("Averange Score:" + allOverScore);


        if (allOverScore < 75){
            System.out.print ("Remarks: FAILED!");
        } else {
            System.out.print ("Remarks: PASSED!");
        }

        scanner.close();
    }
}
