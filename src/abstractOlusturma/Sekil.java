package abstractOlusturma;
// Abstract icerisinde hem ozelliklerimiz hem normal metotlarimiz hem de abstract (soyut) metotlar bulunabiliyor.
public abstract class Sekil {

    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    public void isminiSoyle(){

        System.out.println("Bu obje"+isim+"objesidir.");
    }
    abstract void alanHesapla();// govdesiz alt siniflarimiz bunu override etmek zorunda.

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

