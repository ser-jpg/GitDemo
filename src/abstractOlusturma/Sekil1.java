package abstractOlusturma;

import BootCampJava.CesitliBasitOrnekler.SquareRootExamples;

public abstract class Sekil1 {

    private String isim;

    public Sekil1(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    abstract void alanHesapla();
}
