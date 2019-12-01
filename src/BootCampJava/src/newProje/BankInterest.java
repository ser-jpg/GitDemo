package newProje;

import java.util.Scanner;
/* Faiz uygulamasi Kullanicidan ana para degerinive parasini kac yil vadeli yatirmak istedigi bilgisini alin
ve her sene sonunda toplam para miktarini yazdirin*/

public class BankInterest {
    public static void main(String[]args){
        System.out.println("Welcome our Bank");
        System.out.println("******************************");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your capital=");
        double capital=scanner.nextDouble();
        System.out.println("please enter year=");
        int year=scanner.nextInt();
        double total=capital;
        double interest_rate=0.06;
         int i=1;
        do {
            total=total*interest_rate+total;
            System.out.println("At the end of the "+i+"st You will be your total money "+total);
            i++;


        }while(i<=year);






    }

}
