package BootCampJava.CesitliBasitOrnekler.Review1;

public class CarInsuranceTest {
    public static void main(String[] args) {
        CarInsurance carInsurance=new CarInsurance(2015,0,0,2000,1500,2019);

        carInsurance.makeOffer(1500);
        System.out.println(carInsurance.getBasePrice());
        CarInsuranceDeal mydeal=new CarInsuranceDeal(2015,0,0,2000,1500,2019,50);

        System.out.println(mydeal.discountPercentage);
        System.out.println(mydeal);



    }
}
