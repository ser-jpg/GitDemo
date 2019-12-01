package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Polimorfizm;

public class BankLoan {

    double interestRate;
    int numberOfPayment;
    double amount;

    public BankLoan(double interestRate, int numberOfPayment, double amount) {
        this.interestRate = interestRate;
        this.numberOfPayment = numberOfPayment;
        this.amount = amount;
    }
    double calculateMontlyPyment(){
        return this.amount*this.interestRate/this.numberOfPayment;

    }
    double calculateTotalPayment(){
        return this.amount*this.interestRate;
    }
}
