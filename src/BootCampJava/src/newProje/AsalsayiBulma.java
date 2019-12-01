package newProje;

/* 1 den 1000 e kadar olan sayilari bul ve ekrana yazdir

 */
public class AsalsayiBulma {
    public static boolean asalmi(int sayi){
        int i;
        for(i=2;i<sayi;i++){

            if(sayi%i==0){
                return false;
            }
        }
        return true;



    }

    public static void main(String[]args){

        for(int i=2;i<1000;i++){

            if(asalmi(i)){
                System.out.println(i);
            }
        }




    }

}
