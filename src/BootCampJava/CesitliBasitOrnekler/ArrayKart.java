package BootCampJava.CesitliBasitOrnekler;

public class ArrayKart {

    private char deger;
    private boolean tahmin=false;

    public ArrayKart(char deger,boolean tahmin) {
        this.setDeger(deger);
        this.setTahmin(tahmin);

    }

    public char getDeger() {
        return deger;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }



}
