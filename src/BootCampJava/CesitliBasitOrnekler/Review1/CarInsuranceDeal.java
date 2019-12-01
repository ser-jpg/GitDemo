package BootCampJava.CesitliBasitOrnekler.Review1;

public class CarInsuranceDeal extends CarInsurance {

    int discountPercentage;

    public CarInsuranceDeal(int model_Year, int numberOfTicket, int numberOfAccident, double priceOffer, double basePrice, int currentYear, int discountPercentage) {
        super(model_Year, numberOfTicket, numberOfAccident, priceOffer, basePrice, currentYear);
        this.discountPercentage = discountPercentage;
    }
    public void makeDiscount(int rate){


    }
}
