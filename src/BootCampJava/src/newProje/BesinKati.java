package newProje;

public class BesinKati {
    public static boolean besinkati(int sayi){

        for(int i=0;i<100;i++){
            if(sayi%5!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        for(int i=0;i<100;i++){
            if(besinkati(i)){
                System.out.println(i);
            }
        }
    }
}
