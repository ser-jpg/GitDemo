package BootCampJava.CesitliBasitOrnekler.Review1;

public class CarInsurance {
    private int model_Year;
    private int numberOfTicket;
    private int numberOfAccident;
    private double priceOffer;
    private double basePrice;
    private int currentYear;

    public CarInsurance(int model_Year, int numberOfTicket, int numberOfAccident, double priceOffer, double basePrice, int currentYear) {
        this.model_Year = model_Year;
        this.numberOfTicket = numberOfTicket;
        this.numberOfAccident = numberOfAccident;
        this.priceOffer = priceOffer;
        this.basePrice = basePrice;
        this.currentYear = currentYear;
    }
    public void makeOffer(double offer){

        offer=basePrice+(currentYear-model_Year)*50+(30*numberOfTicket)+(100*numberOfAccident);
        System.out.println(offer);
    }

    public int getModel_Year() {
        return model_Year;
    }

    public void setModel_Year(int model_Year) {
        this.model_Year = model_Year;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    public int getNumberOfAccident() {
        return numberOfAccident;
    }

    public void setNumberOfAccident(int numberOfAccident) {
        this.numberOfAccident = numberOfAccident;
    }

    public double getPriceOffer() {
        return priceOffer;
    }

    public void setPriceOffer(double priceOffer) {
        this.priceOffer = priceOffer;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }
}
