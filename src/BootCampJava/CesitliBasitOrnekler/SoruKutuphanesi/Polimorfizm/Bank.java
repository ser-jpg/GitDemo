package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Polimorfizm;

public class Bank {

    private int accountNnumber;
    private String accountName;
    private double balance;

    public Bank(int accountNnumber, String accountName, double balance) {
        this.accountNnumber = accountNnumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNnumber() {
        return accountNnumber;
    }

    public void setAccountNnumber(int accountNnumber) {
        this.accountNnumber = accountNnumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNnumber=" + accountNnumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
    void addMoney(double amount){
        this.balance=this.balance+amount;

    }
    void drawMoney(double amount){
        this.balance=this.balance-amount;

    }
    void changeAccountName(String newname){

        this.accountName=newname;
    }
    double showCurrentBalans(){

        if(this.balance<100){
            System.out.println("Your Balance is very low...");
        }
        return this.balance;
    }
}
