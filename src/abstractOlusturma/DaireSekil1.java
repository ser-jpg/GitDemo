package abstractOlusturma;

public class DaireSekil1 extends Sekil1 {

    private int yariCap;

    public DaireSekil1(String isim, int yariCap) {
        super(isim);
        this.yariCap = yariCap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim()+" nin alani"+Math.PI*yariCap*yariCap+" dir");

    }
}
