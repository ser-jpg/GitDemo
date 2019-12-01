package BootCampJava.generic;

public class Asayisal extends Aday {
    @Override
    public int puanHesapla() {
        return getTurkce()*5+getMatematik()*5+getFizik()*4+getEdebiyat()*1;
    }

    public Asayisal(int turkce, int matematik, int fizik, int edebiyat) {
        super(turkce, matematik, fizik, edebiyat);
    }
}
