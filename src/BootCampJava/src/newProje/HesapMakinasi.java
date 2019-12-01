package newProje;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String islemler = "1.Toplama islemei\n"
                          +"2.Cikarma islemi\n"
                          +"3.Carmpa islemi\n"
                          +"4.Bolme islemi";
        System.out.println(islemler);


        System.out.print("islemi seciniz : ");
        String islem =scanner.nextLine();
        int a;
        int b;
        switch(islem){
            case "1":
                System.out.print("Birinci Sayi:");
                 a = scanner.nextInt();
                System.out.print("Ikinci Sayi");
                 b = scanner.nextInt();
                System.out.println("Toplam: " +(a+b));
                break;
            case "2":
                System.out.print("Birinci Sayi:");
                 a = scanner.nextInt();
                System.out.print("Ikinci Sayi");
                 b = scanner.nextInt();
                System.out.println("Cikarma: " +(a-b));
                break;
            case "3":
                System.out.print("Birinci Sayi:");
                 a = scanner.nextInt();
                System.out.print("Ikinci Sayi");
                 b = scanner.nextInt();
                System.out.println("Carpma: " +(a*b));
                break;
            case "4":
                System.out.print("Birinci Sayi:");
                 a = scanner.nextInt();
                System.out.print("Ikinci Sayi");
                 b = scanner.nextInt();
                System.out.println("Bolme: " +((double)a/b));
                break;
            default:
                System.out.println("Gecersiz Islem");
                break;








        }




    }





}




















