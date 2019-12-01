package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Polimorfizm;

public class BankCarLoan extends BankLoan {
    double APR;
    int creditScore;

    public BankCarLoan(double interestRate, int numberOfPayment, double amount, double APR, int creditScore) {
        super(interestRate, numberOfPayment, amount);
        this.APR = APR;
        this.creditScore = creditScore;
    }

    @Override
    double calculateMontlyPyment() {
        return super.amount*this.APR/super.numberOfPayment-(this.creditScore/10);
    }
}
