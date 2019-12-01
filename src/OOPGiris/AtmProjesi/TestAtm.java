package OOPGiris.AtmProjesi;

public class TestAtm {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Hesap hesap=new Hesap("Serkan Sen","12345",2000);
        atm.calis(hesap);;
    }
}
