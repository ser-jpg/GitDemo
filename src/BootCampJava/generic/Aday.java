package BootCampJava.generic;

public abstract class Aday {
    private int turkce;
    private int matematik;
    private int fizik;
    private int edebiyat;

    public Aday(int turkce, int matematik, int fizik, int edebiyat) {
        this.turkce = turkce;
        this.matematik = matematik;
        this.fizik = fizik;
        this.edebiyat = edebiyat;
    }



    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }
    abstract int puanHesapla();
}
