package BootCampJava.Bill.Restaurant;

public class Test {
    public static void main(String[] args) {
        Invoices invoices=new Invoices();
        String myelectric=invoices.evaluateElectric(1560);
        String myinternet=invoices.evaluateInternet(200);
        System.out.println(myelectric);
        System.out.println(myinternet);
        Loans loans=new Loans();
        double myinsurange=loans.colculateCarInsurange(30000,12);
        int mymorgate=loans.morgateLoans(60,1500);
        Suggestion suggestion=new Suggestion();
        suggestion.suggestion();
        suggestion.suggestCloth();

    }
}
