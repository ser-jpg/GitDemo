package newProje;

import java.util.Scanner;

public class atmprogram {
    public static void main(String []args) {

        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;

        System.out.println("Lutfen bir islem seciniz!");

        String islemler = "1.islem: Bakiye ogrenme\n"
                + "2.islem: Para Cekme\n"
                + "3.islem: Para Yatirma\n"
                + "cikis icn q ya basin";
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");
        while (true) {
            System.out.print("Lutfen bir islem seciniz :");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.print("Programdan ciktiniz");
                break;

            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz :"+bakiye);

            }
            else if (islem.equals("2")) {
                System.out.print("Lutfen bir tutar giriniz :");
                int tutar =scanner.nextInt();
                scanner.nextLine();
                if(bakiye-tutar<0){
                    System.out.println("Yeterli bakiye yok.Bakiyeniz ="+bakiye);

                }
                else {
                    bakiye-=tutar;
                    System.out.println("Yeni bakiyeniz ="+bakiye);

                }

            }
            else if (islem.equals("3")){
                System.out.println("Yatiracaginiz Tutari Girin :");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz ="+bakiye);

            }
            else{
                System.out.println("Gecersiz islem yaptiniz");
            }














        }
    }
}
