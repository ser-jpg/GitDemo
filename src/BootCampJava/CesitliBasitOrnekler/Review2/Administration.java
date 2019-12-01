package BootCampJava.CesitliBasitOrnekler.Review2;

public class Administration extends Register {
    public Administration(String bookTitle, String bookAuthor, int ISBN, int pages, boolean availability, String borrowDate, String returnDate, String name, int memberID) {
        super(bookTitle, bookAuthor, ISBN, pages, availability, borrowDate, returnDate, name, memberID);
    }
}
