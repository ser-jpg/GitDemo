package BootCampJava.CesitliBasitOrnekler;
/* 1 2 3
   4 5 6
   7 8 9
 */


public class ArrayMultiDimensional {
    public static void main(String[] args) {



    int multi[][]={{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<multi.length;i++){

        for(int j=0;j<multi[i].length;j++){
            System.out.println(multi[i][j]);
        }
    }
    String name[][]={{"james","Alice"},{"wilson","jenifer"},{"Michel","David","Angela"},};
    for(int i=0;i<name.length;i++){
        for(int j=0;j<name[i].length;j++){

            System.out.println(name[i][j]);
        }
    }



    }

}
