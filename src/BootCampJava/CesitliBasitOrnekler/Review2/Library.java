package BootCampJava.CesitliBasitOrnekler.Review2;

public class Library {

    protected String bookTitle;
    protected String bookAuthor;
    protected int ISBN;
    protected int pages;
    protected boolean availability;
    protected String borrowDate;
    protected String returnDate;

    public Library(String bookTitle, String bookAuthor, int ISBN, int pages, boolean availability, String borrowDate, String returnDate) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
        this.pages = pages;
        this.availability = availability;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
    public void enterBarrowDate(String newBarrrowDate){

        this.borrowDate=newBarrrowDate;
        availability=false;
    }
    public void enterReturnDate(String newReturnDate){

        this.returnDate=newReturnDate;
        availability=true;
    }
}