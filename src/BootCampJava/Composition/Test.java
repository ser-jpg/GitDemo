package BootCampJava.Composition;

public class Test {
    public static void main(String[] args) {
        Resolution resolution=new Resolution(1920,1080);
        Monitor monitor=new Monitor("vs197ds","Asus","18.5",resolution);

        Kasa kasa=new Kasa("Shadow Blade","Shadow","Temperli cam");
        Anakart anakart=new Anakart("B250PRO","ASUS",10,"windows 10");

        Bilgisayar pc=new Bilgisayar(anakart,monitor,kasa);
        pc.getKasa().bilgisayari_ac();
        pc.getMonitor().monitoru_kapat();







    }
}
