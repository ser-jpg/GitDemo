package BootCampJava.Inheritance;
//subclass
public class Yonetici extends Calisan {

    private int sorumlu_kisi;


    public Yonetici(String isim,int maas,String departman,int sorumlu_kisi){

        super(isim,maas,departman);
        this.sorumlu_kisi=sorumlu_kisi;
    }
    public void zamYap(int zam_miktari){

        System.out.println("Calisanlara"+zam_miktari+"zam yapildi");
    }
    public void bilgilerigoster(){
        super.bilgilerigoster();
        System.out.println("Sorumlu oldugu kisi sayisi="+sorumlu_kisi);
    }


    }




