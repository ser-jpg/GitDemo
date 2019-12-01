package ObjectOrientedATM;

import java.util.Scanner;

public class Login {

    public boolean login(ObjectOrientedATM.Hesap hesap){

        Scanner scanner=new Scanner(System.in);
        String kullanici_adi;
        String parola;
        System.out.println("Lutfen kullanici adini girin :");
        kullanici_adi=scanner.nextLine();
        System.out.println("Lutfen parola yi giriniz :");
        parola= scanner.nextLine();
        if(hesap.getKullanici_adi().equals(kullanici_adi)&& hesap.getParola().equals(parola)){
            return true;

        }
        else {
            return false;
        }


    }
}
