package BootCampJava.generic;

public class AdayTest {

    public static void main(String[] args) {

        Asayisal asayisal1=new Asayisal(30,40,20,30);
        Asayisal asayisal2=new Asayisal(25,45,2,35);

        AEsitagirlik aesitagirlik1=new AEsitagirlik(30,20,40,2);
        AEsitagirlik aesitagirlik2=new AEsitagirlik(40,10,50,0);

        Asayisal birinci=birinci(asayisal1,asayisal2);
        AEsitagirlik birinci2=birinci(aesitagirlik1,aesitagirlik2);

        System.out.println("Birinci sayisal ogrencinin puani:"+birinci.puanHesapla());
        System.out.println("Birinci esitagirlik ogrencinin puani:"+birinci2.puanHesapla());

    }
    public static <E extends Aday> E birinci(E e1,E e2){

        if(e1.puanHesapla()>e2.puanHesapla()){

            return e1;
        }
        else {
            return e2;
        }
    }
}
