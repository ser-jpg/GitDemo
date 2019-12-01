package newProje;

public class MetodOverLoading {
    public static void skorhesapla(String isim,int puan){
        System.out.println(isim+ " adli kisinin "+puan+" puani var");
    }
    public static void skorhesapla(String isim){
        System.out.println(isim+ " adli kisinin hic puani yok");
    }
    public static void skorhesaplama(int puan){
        System.out.println("isimsiz kisinin  "+puan+ " puani var");
    }
    public static void main(String[]args){
        skorhesapla("Serkan",100);
        skorhesapla("Serkan");
        skorhesaplama(100);


    }
}
