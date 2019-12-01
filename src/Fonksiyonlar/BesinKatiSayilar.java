package Fonksiyonlar;

public class BesinKatiSayilar{

    public static boolean besinkatimi(int sayi){

        if(sayi%5==0){
            return true;

        }
        return false;


    }
    public static void main(String[]args){
        for(int i=1;i<100;i++){
            if(besinkatimi(i)){
                System.out.println(i);
            }
        }
    }

}
