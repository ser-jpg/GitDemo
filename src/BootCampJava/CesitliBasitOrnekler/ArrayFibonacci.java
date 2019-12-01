package BootCampJava.CesitliBasitOrnekler;
/* 1 1 2 3 5 8  13 21 34 55 89...
a[0]=1
a[1]=1
a[2]=2
a[3]=3
a[4]=5*/



public class ArrayFibonacci {
    public static void main(String[] args) {


       int a[]=new int[20];
       a[0]=1;
       a[1]=1;


        for(int i=2;i<a.length;i++) {
            a[i] = a[i - 1] + a[i - 2];
            System.out.println(a[i]);


        }
    }



}
