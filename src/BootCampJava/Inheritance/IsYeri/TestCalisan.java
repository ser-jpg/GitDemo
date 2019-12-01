package BootCampJava.Inheritance.IsYeri;

import java.util.Scanner;

public class TestCalisan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Calisanlar Pragramina Hosgeldiniz...");
        String islemler="islemler...\n"
                        +"1.Yazilimci islemleri\n"
                        +"2.Yonetici islemleri\n"
                        +"Cikis Icin q ye basin";
        System.out.println("********************************");
        System.out.println(islemler);
        System.out.println("**********************************");

        while(true){
            System.out.println("Bir islem seciniz:");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan Ciliyor...");
                break;
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci=new Yazilimci("Serkan","Sen",12345,"ingilizce");
               String yazilim_islemleri="1.Format Atma\n"
                                        +"2.Bilgileri Gosterme\n"
                                        +"Cikis icin q ye basin";
                System.out.println(yazilim_islemleri);

                while(true){
                    System.out.println("islem Seciniz...");
                    String y_islemleri=scanner.nextLine();

                    if(y_islemleri.equals("q")){
                        System.out.println("yazilim isleminden cikisi...");
                        break;

                    }
                    else if(y_islemleri.equals("1")){
                        System.out.println("Isletim sistemi:");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci.formatat(isletim_sistemi);

                    }
                    else if(y_islemleri.equals("2")){
                        yazilimci.bilgilerigoster();

                    }
                    else {
                        System.out.println("Gecersiz yazilimci islemi...");
                    }


                }



            }
            else if(islem.equals("2")){
                Yonetici yonetici=new Yonetici("Serkan","Sen",1234,10);
                String yonetici_islem="Islemler:\n"
                                    +"1.Zam Yap\n"
                                    +"2.Bilgileri goster\n"
                                    +"Cikis icin q ya bas..";
                System.out.println(yonetici_islem);
                while (true){
                    System.out.println("islem seciniz...");
                    String y_islem=scanner.nextLine();
                    if(y_islem.equals("q")){
                        System.out.println("Yonetici isleminden cikiliyor...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.println("Yoneticinin ne kadar zam yapmasini istiyorsunuz?");
                        int zam_miktari=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktari);
                    }

                    else  if(y_islem.equals("2")){

                        yonetici.bilgilerigoster();
                    }
                    else {
                        System.out.println("Gecersiz islem yaptiniz..");
                    }
                }


            }

            else{
                System.out.println("Gecersiz bir islem Yaptiniz");
            }

        }
    }
}
