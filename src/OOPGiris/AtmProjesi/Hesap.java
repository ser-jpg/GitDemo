package OOPGiris.AtmProjesi;

public class Hesap {


    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public Hesap(String kullaniciAdi,String parola,int bakiye) {
        this.setKullaniciAdi(kullaniciAdi);
        this.setParola(parola);
        this.setBakiye(bakiye);
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatirma(double miktar){
        bakiye+=miktar;
        System.out.println("Yeni bakiyeniz="+bakiye);


    }
    public void paraCekme(double miktar){

        if(miktar>1500){
            System.out.println("Bir gunde 1500 tl den fazla cekemessiniz...");
            return;
        }
        if(bakiye-miktar<0){
            System.out.println("Yeterli bakiyeniz yok.Bakiyeniz+"+bakiye);
        }
        else{
            bakiye-=miktar;
            System.out.println("Yeni bakiyeniz="+bakiye);
        }
    }
}
