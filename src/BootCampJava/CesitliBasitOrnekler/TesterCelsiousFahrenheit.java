package BootCampJava.CesitliBasitOrnekler;

import java.util.Scanner;

public class TesterCelsiousFahrenheit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.println("Please enter a temperature unit(Examples:C or F):");
            String temperature_unit = scanner.nextLine();
            if (temperature_unit.equalsIgnoreCase("C")) {
                System.out.println("Please enter celsious:");
                int celcious = scanner.nextInt();
                Convert.celsious_to_fahrenheit(celcious);



            } else if (temperature_unit.equalsIgnoreCase("F")) {
                System.out.println("Please enter fahrenheit:");
                int fahrenheit = scanner.nextInt();
                Convert.fahrenheit_to_celsious(fahrenheit);



            } else {
                System.out.println("Invalid Transaction...");


            }
        }
    }
}
