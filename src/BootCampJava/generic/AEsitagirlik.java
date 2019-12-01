package BootCampJava.generic;

public class AEsitagirlik extends Aday {
    @Override
    public int puanHesapla() {
        return getTurkce()*5+getMatematik()*5+getFizik()*1+getEdebiyat()*4;
    }

    public AEsitagirlik(int turkce, int matematik, int fizik, int edebiyat) {
        super(turkce, matematik, fizik, edebiyat);
    }
}
