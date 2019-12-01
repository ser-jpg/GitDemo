package newProje;

public class CiftSayi {

    public static boolean ciftsayi(int sayi){
        for(int i=2;i<1000;i++)
        if(sayi%2==1){
            return false;
        }
        return true;
    }
    public static void main(String[]args){
        for(int i=2;i<1000;i++){
            if(ciftsayi(i)){
                System.out.println(i);
            }

        }
    }


}
