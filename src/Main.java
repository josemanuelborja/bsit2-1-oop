public class Main {

    public static void main(String[]args){
        System.out.println("\nSTUDENT INFORMATION: ");
        Student student1 = new Student("JUAN DELA CRUZ",20, "BSIT", 50, 50, 50);
        student1.displayInfo();
        student1.calculateAverage();
        student1.getLetterGrade();
        student1.isPassing();

        Student student2 = new Student("CARDO DALISAY",21, "BSCS", 20, 40, 30);
        student2.displayInfo();
        student2.calculateAverage();
        student2.getLetterGrade();
        student2.isPassing();

        Student student3 = new Student("TANGGOL",22, "BSIT", 10, 10, 10);
        student3.displayInfo();
        student3.calculateAverage();
        student3.getLetterGrade();
        student3.isPassing();

        System.out.println("\nSummary" + " " + Student.passingStudents + " out of " + Student.totalStudent + " students are passing");

    }


}

