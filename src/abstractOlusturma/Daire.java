package abstractOlusturma;

public class Daire extends Sekil {

    private int yariCap;
    @Override
    void alanHesapla() {

        System.out.println(getIsim()+" alani"+(Math.PI*yariCap*yariCap)+" dir.");

    }

    public Daire(String isim, int yariCap) {
        super(isim);
        this.yariCap = yariCap;
    }
}
