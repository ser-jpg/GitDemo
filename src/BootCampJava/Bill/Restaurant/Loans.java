package BootCampJava.Bill.Restaurant;

public class Loans {
    public int morgateLoans(int month,int montlypayment ){

        int result=montlypayment*(360-month);
        return result;



    }
    public double colculateCarInsurange(int carprice,int montly){

        double insurange=(carprice/montly)*0.9-montly;
        return insurange;
    }
}
