public class Book{
    String title = "";
    String author = "";
    int pages = 0;
    boolean isAvailable = false;

    public Book(String bookTitle, String bookAuthor, int pagesCount, boolean bookAvailability){
        title = bookTitle;
        author = bookAuthor;
        pages = pagesCount;
        isAvailable = bookAvailability;
        System.out.println("A new book " + title + " by " + author + " has been added to the library!");
    }
}