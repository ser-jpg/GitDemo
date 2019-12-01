import java.util.Scanner;

public class NotHesaplama {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vize1 gir : ");
        int Vize1 = scanner.nextInt();
        System.out.print("Vize2 gir : ");
        int Vize2 = scanner.nextInt();
        System.out.print("Final gir : ");
        int Final = scanner.nextInt();
        System.out.print("Okul ortalamaniz :");
        double okulortalamasi =scanner.nextDouble();
        double toplamNot =Vize1*0.30+Vize2*0.30+Final*0.40;
        System.out.print("Toplam Not: " + toplamNot);
        if(toplamNot>=90){
            System.out.print(" AA");
        }
        else if(toplamNot>=85) {
            System.out.print(" BA");}

        else if(toplamNot>=80) {
            System.out.print(" BB");}

        else if(toplamNot>=75){
            System.out.print(" CB");}
        else if(toplamNot>=70){
            System.out.print(" CC");}
        else if(toplamNot>=65){
            System.out.print(" DC");}
        else if(toplamNot>=60){
            System.out.print(" DD");
        if(okulortalamasi<2.5){
        System.out.print(" aldiniz ve not ortalamaniz dusuk. Bu dersi tekrar aliniz");}
        }
        else if(toplamNot>=55){
            System.out.print(" FD Kaldiniz...");}
        else {System.out.print(" FF Kaldiniz..");}







    }
}
