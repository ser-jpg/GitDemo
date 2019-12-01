package BootCampJava.Bill;
/*
Parametre olarak double değerlerden oluşan bir diziyi alan ve bunların ortalamasını yine double bir
değer olarak döndüren ortalama adlı static bir metod yazınız.
 */

public class ArrayOrtalamaBul {

    public static void main(String[] args) {
        double[] arr={1.2,2.5,6.8,5.7,12.3};
        ortalama(arr);
        System.out.println(ayismi(1));
    }

    public static double ortalama(double []arr){


        double ortalama=0;
        for(int i=0;i<arr.length;i++){

            ortalama=(ortalama+arr[i]);

        }
        System.out.println(ortalama/arr.length);
        return ortalama;




    }
    public static String ayismi(int n)
    {
        String [] ayadi = { "Ocak", "Subat", "Mart", "Nisan", "Mayis",
                "Haziran", "Temmuz", "Agustos", "Eylul", "Ekim", "Kasim", "Aralik"};


        return ayadi[n-1];
    }
}
