package abstractOlusturma;

public class UcgenSekil1 extends Sekil1{
    private int a;
    private int b;
    private int c;

    public UcgenSekil1(String isim, int a, int b, int c) {
        super(isim);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void alanHesapla() {
        double u=(a+b+c)/2.0;

        double alan=(Math.sqrt( u*(u-a)*(u-b)*(u-c)));

        System.out.println(getIsim()+"alani :"+alan);

    }
}