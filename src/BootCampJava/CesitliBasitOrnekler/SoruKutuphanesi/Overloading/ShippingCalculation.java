package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Overloading;

public class ShippingCalculation {
    public static void main(String[] args) {
        ShippingCalculation myshipping=new ShippingCalculation();

        System.out.println(myshipping.calculateCost(12.5,1.8));
        System.out.println(myshipping.calculationCost(12.5,1.8,2.4));

    }
    public double calculateCost(double price,double tax){
        double cost;
        cost=(price+tax)*1.1;

        return cost;

    }

    public double calculationCost(double price,double tax,double shipping){

        double cost;
        cost=(price+tax)*1.1+shipping;

        return cost;

    }
}
