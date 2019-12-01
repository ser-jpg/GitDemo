package BootCampJava.CesitliBasitOrnekler;

import java.util.Scanner;

public class AdSoyadIlkHarf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen adinizi girin:");
        String ad=scanner.nextLine();
        System.out.println("Lutfen soy adinizi giriniz:");
        String soyad=scanner.nextLine();
        System.out.print(ad.toUpperCase().charAt(0));
        System.out.println(soyad.toUpperCase().charAt(0));
    }
}
