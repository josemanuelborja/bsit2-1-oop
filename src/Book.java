public class Book extends LibraryItem implements Borrowable {

    private String isbn;
    private int numberOfPages;
    private String genre;

    public Book(String itemId, String title, String author, String isbn, int numberOfPages, String genre){
        super(itemId, title, author);
        this.isbn = isbn;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    public String setGenre(String genre){

    }

    public int setNumberOfPages(int pages){

    }

    @Override
    public void getItemType(){
        System.out.println("Book");
    }

    @Override
    public double calculateLateFee(int daysLate){
        return daysLate * 0.50;
    }

    @Override
    public void borrowItem(String borrowerName) {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public int getBorrowingPeriod() {
        return 0;
    }
}




