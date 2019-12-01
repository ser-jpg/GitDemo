package BootCampJava.CesitliBasitOrnekler;

public class ArrayOddFind {
    public static void main(String[] args) {
        int a[]={1,2,4,6,8,10,9,3,4,774,98};
        int odd;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==1){

                System.out.println(a[i]);
            }
        }
    }
}
