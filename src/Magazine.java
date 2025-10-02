public class Magazine extends LibraryItem implements  Borrowable{
    private int issueNumber = 0;
    private String publicationMonth = "";
    private boolean isLatestIssue = true;

    public Magazine (String itemId, String title, String author, int issueNumber, String publicationMonth, boolean isLatestIssue) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
        this.publicationMonth = publicationMonth;
        this.isLatestIssue = isLatestIssue;
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

    @Override
    public void getItemType() {

    }

    @Override
    public double calculateLateFee(int daysLate) {
        return 0;
    }
}
