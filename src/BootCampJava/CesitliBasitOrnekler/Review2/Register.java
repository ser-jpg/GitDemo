package BootCampJava.CesitliBasitOrnekler.Review2;

public class Register extends Library {
    String name;
    int memberID;

    public Register(String bookTitle, String bookAuthor, int ISBN, int pages, boolean availability, String borrowDate, String returnDate, String name, int memberID) {
        super(bookTitle, bookAuthor, ISBN, pages, availability, borrowDate, returnDate);
        this.name = name;
        this.memberID = memberID;
    }

}
