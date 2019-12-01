package BootCampJava.CesitliBasitOrnekler;

public class Convert {

    public static void celsious_to_fahrenheit(int celsious){
       double fahrenheit;

       fahrenheit= celsious*9/5+32;
        System.out.println(celsious+"C="+fahrenheit+"F");


    }
    public static void fahrenheit_to_celsious(int fahrenheit){

        double celsious;

        celsious=(fahrenheit-32)*5/9;
        System.out.println(fahrenheit+"F="+celsious+"C");
    }
}
