package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi.Overloading;

public class Conversion {

    public static void main(String[] args) {
        convertLenght(100);
        convertLenght(100.0);



    }
    public static void convertLenght(int cm){
        System.out.println(cm+"cm is " +cm*2.54+ "inch");

    }
    public static void convertLenght(double inch){
        System.out.println(inch+"inch is " +inch/2.54 +"cm");

    }
}
