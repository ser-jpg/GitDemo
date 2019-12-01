package BootCampJava.Bill;

public class Loans {
    private String morgtage_calculater;
    private String car_loan;

    public Loans(String morgtage_calculater,String car_loan) {
        this.setMorgtage_calculater(morgtage_calculater);
        this.setCar_loan(car_loan);
    }

    public String getMorgtage_calculater() {
        return morgtage_calculater;
    }

    public void setMorgtage_calculater(String morgtage_calculater) {
        this.morgtage_calculater = morgtage_calculater;
    }

    public String getCar_loan() {
        return car_loan;
    }

    public void setCar_loan(String car_loan) {
        this.car_loan = car_loan;
    }
}

