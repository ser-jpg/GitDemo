package BootCampJava.CesitliBasitOrnekler;

public class Shapes {



        public static void printPramit(int line,String sembol){
            for (int i = 1; i <=line; i++) {

                for (int j = 11; j >i; j--) {

                    System.out.print("  ");
                }
                for(int k=1;k<=2*i-1;k++){

                    System.out.print(sembol);
                }
                System.out.println();
            }


        }

}
