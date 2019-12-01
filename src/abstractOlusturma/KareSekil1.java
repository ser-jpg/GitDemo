package abstractOlusturma;

public class KareSekil1 extends Sekil1 {

    private int kenar;

    public KareSekil1(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {

        System.out.println(getIsim()+" nin alani"+(kenar*kenar)+" dir");

    }
}
