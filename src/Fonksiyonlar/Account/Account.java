package Fonksiyonlar.Account;

public class Account {
    private String hesap_No;
    private Double bakiye;
    private String isim;
    private String email;
    private String tel_No;

    public Account(String hesap_No,double bakiye,String isim,String email,String tel_No) {
        this.hesap_No = hesap_No;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.tel_No=tel_No;
    }

    public void paraYatirma(double miktar){
        bakiye+=miktar;
        System.out.println("Yeni bakiye="+bakiye);

    }
    public void paraCekme(double miktar){
        if(miktar>1500){
            System.out.println("Bir gunde 1500 den fazla para cekemessiniz");
        }
        if(bakiye-miktar<0){
            System.out.println("Yeterli bakite yok.Bakiyeniz"+bakiye);
        }
        else{
            bakiye-=miktar;
            System.out.println("Yeni bakiyeniz ="+bakiye);
        }
    }

    public String getHesap_No() {
        return hesap_No;
    }

    public void setHesap_No(String hesap_No) {
        this.hesap_No = hesap_No;
    }

    public Double getBakiye() {
        return bakiye;
    }

    public void setBakiye(Double bakiye) {
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

    public String getTel_No() {
        return tel_No;
    }

    public void setTel_No(String tel_No) {
        this.tel_No = tel_No;
    }
}
