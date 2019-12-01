package newProje;

/*
**********
**********
**********
**********
**********
 */
public class StarRectangle {
    public static void main(String[]args){

        for(int i=1;i<6;i++){

            for(int j=1;j<6;j++){
                if(j>=i) {
                    System.out.print("*");
                }
                for(int k=1;k<5;k++){
                    if(k<i){
                        System.out.print("");
                    }
                }

            }
            System.out.println();

        }
    }
}
