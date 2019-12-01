package BootCampJava.Inheritance;
//Buraya super class veya base class deniyor.
public class Calisan {

    private String isim;
    private  int maas;
    private String departman;

    public Calisan(String isim,int maas,String departman){

        this.isim=isim;
        this.maas=maas;
        this.departman=departman;

    }
    public void calis(){

        System.out.println("Calisan Calisiyor...");
    }
    public void bilgilerigoster(){

        System.out.println("isim="+isim);
        System.out.println("maas="+maas);
        System.out.println(("departman="+departman));
    }
    public void departman_degistir(String yeni_departman){

        System.out.println("Departman Degistiriliyor...");
        this.departman=yeni_departman;
        System.out.println("Yeni departman"+this.departman);
    }
}
