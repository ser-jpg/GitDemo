package OOPGiris.BankAccount;

public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo) {
        this.hesapNo = hesapNo;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.telefonNo=telefonNo;
    }

    public void paraYatirma(double miktar){

        bakiye+=miktar;
        System.out.println("Yeni bakiye="+bakiye);
    }
    public void paraCekme(double miktar){

        if(miktar>1500){
            System.out.println("Bir gunden 1500 tl den fazla cekemessiniz...");
        }

        if(bakiye-miktar<0){

            System.out.println("Yeterli Bakiyeniz Yok. Bakiye="+bakiye);
        }
        else{
            bakiye-=miktar;
            System.out.println("Yeni bakiyeniz="+bakiye);
        }
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
