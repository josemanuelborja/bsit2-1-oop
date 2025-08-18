public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        String studentName = "Jose Manuel";
        double average = student.calculateAverage(85.5, 92.0,78.5, 90.0);
        String letterGrade = student.getLetterGrade(average);

        student.displayResult(studentName, average);
        student.displayResult(studentName, average, letterGrade);
    }
}