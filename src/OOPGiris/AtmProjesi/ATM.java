package OOPGiris.AtmProjesi;

import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap){
        Login login=new Login();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz...");
        System.out.println("*******************************");
        System.out.println("Kullanici Girisi...");
        System.out.println("********************************");
        int girishakki=3;
        while ((true)){

            if(login.login(hesap)){
                System.out.println("Giris basarili...");
                break;
            }
            else{
                System.out.println("Giris basarisiz");
                girishakki-=1;
                System.out.println("Kalan Giris Hakki="+girishakki);
            }
            if(girishakki==0){
                System.out.println("Giris Hakkiniz Bitti...");
                return;
            }
        }
        System.out.println("**********************************");
        String islemler="1.Bakiye goruntule\n"
                        +"2.Para Yatirma\n"
                        +"3.Para Cekme\n"
                        +"Cikis icin q ye basin";
        System.out.print("Islemler "+islemler);
        System.out.println("************************************");

        while(true){

            System.out.println("Bir islem seciniz:");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("islemden ciktiniz iyi gunler...");

                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz +"+hesap.getBakiye());

            }
            else if(islem.equals("2")){
                System.out.println("Yatirmak istediginiz tutar=");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatirma(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Cekmek istediginiz tutar+");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paraCekme(tutar);
            }
            else{
                System.out.println("Gecersiz islem...");
            }

        }




    }
}
