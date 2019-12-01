package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Polimorfizm;

public class BankHomeLoan extends BankLoan {

    private int PMI;

    public BankHomeLoan(double interestRate, int numberOfPayment, double amount, int PMI) {
        super(interestRate, numberOfPayment, amount);
        this.PMI = PMI;
    }

    @Override
    double calculateMontlyPyment() {
        return super.amount*super.interestRate/super.numberOfPayment+this.PMI;
    }

    @Override
    double calculateTotalPayment() {
        return super.amount*super.interestRate+this.PMI*super.numberOfPayment;
    }
}
