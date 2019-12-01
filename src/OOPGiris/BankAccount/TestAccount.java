package OOPGiris.BankAccount;

public class TestAccount {
    public static void main(String[] args) {
        Account account1=new Account("123456",1000.0,"serkan sen","userkansen@gmail.com","9795495957");
        System.out.println(account1.getEmail());
        System.out.println(account1.getBakiye());
        account1.paraYatirma(500);

    }
}
