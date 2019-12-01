package BootCampJava.Composition;
// Bir classı oluşturduktan sonra başka bir class içerisinde kullanmamızı sağlayan yapıya composition denir.
// Bu sayede her kodlamada aynı kodu yazmak zorunda kalmayacak ve oluşabilecek kod kirliliğinin önüne geçmiş olacaksınız.

//Composition da sahiplik ilişkisi vardır.
// Bizim bir masaüstü bilgisayarımızın olduğunu düşünelim.
// Bu bilgisayarı oluştururken kasa , monitor , anakart , ram vs. alıyoruz.
// Tüm bunları birleştirerek bir bilgisayar ortaya çıkarıyoruz.
// Bu bilgisayarı OOP ile tasarlayacağımızı düşünürsek bu bilgisayar objesinin içinde aslında bir tane kasa objesi ,
// bir tane anakart objesi , bir tane ram objesi , bir tane monıtor objesi vs. olacak.
// Yani bunlar birleşerek bir tane bilgisayar objesi oluşturuyorlar. Compositionun tam olarak anlamı bu. .

public class Bilgisayar {
    private Anakart anakart;
    private Monitor monitor;
    private Kasa kasa;

    public Bilgisayar(Anakart anakart,Monitor monitor,Kasa kasa) {
        this.setAnakart(anakart);
        this.setMonitor(monitor);
        this.setKasa(kasa);
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }
}
