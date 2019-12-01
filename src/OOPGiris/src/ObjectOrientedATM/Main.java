package ObjectOrientedATM;

/*object oriented (Nesne yonetimi)ATM programi
//login class: kullanici girisini kontrol ediyorum.
//login hesap: hesap islemlerini yapacak.
//ATM atm mize calistiracak.
*/

public class Main {
    public static void main(String[]args){

        ATM atm=new ATM();

        Hesap hesap=new Hesap("Serkan sen","123456",2000);

        atm.calis(hesap);
        System.out.println("Programdan cikiliyor...");


    }
}
