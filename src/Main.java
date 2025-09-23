public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java Fundamentals", "B001", "Robert Martin");
        DVD dvd1 = new DVD("OOP Concepts", "D001", "Tech Films");
        Magazine mag1 = new Magazine("Programming Weekly", "M001", 15);

        Student student = new Student("Alice Johnson", "S12345");
        Teacher teacher = new Teacher("Dr. Smith", "T001");
        Librarian librarian = new Librarian("Mary Brown", "L001");

        System.out.println("═══ Library Management System Demo ═══");
        System.out.println("\nAvailable Media:");
        displayMediaInfo(book1);
        displayMediaInfo(dvd1);
        displayMediaInfo(mag1);

        System.out.println("\n═══ Borrowing Test ═══");
        student.borrowMedia(book1);
        teacher.borrowMedia(dvd1);
        student.borrowMedia(book1);

        System.out.println("\n═══ Returning Test ═══");
        student.returnMedia(book1);
        librarian.borrowMedia(book1);

        System.out.println("\n═══ User Information ═══");
        displayUserInfo(student);
        displayUserInfo(teacher);
        displayUserInfo(librarian);
    }

    public static void displayMediaInfo(Media media) {
        media.displayInfo();
    }

    public static void displayUserInfo(LibraryUser user) {
        System.out.println(user.getUserType() + " - Max borrow limit: " + user.getMaxBorrowLimit() + " items");
    }
}