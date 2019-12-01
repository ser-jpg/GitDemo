package Fonksiyonlar;

public class AsalsayiBulma {
    public static boolean asalmi( int sayi) {

        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                return false;
            }

        }
        return true;


    }
    public static void main(String[]args) {

        for(int i=1;i<100;i++){
            if(asalmi(i)){
                System.out.println(i);
            }
        }
    }
}
