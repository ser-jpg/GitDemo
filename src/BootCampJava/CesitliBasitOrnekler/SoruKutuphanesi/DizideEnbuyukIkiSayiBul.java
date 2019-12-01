package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi;

/*
Verilen bir dizi’de ilk 2 en büyük sayıyı bulan metod.
 */

public class DizideEnbuyukIkiSayiBul {
    public static int[] sortingArray(int[] a) {

        int[] b = new int[2];
        int temp = a[0];
        int temp1 = a[0];
        for (int i = 1; i < a.length; i++) {
            if (temp >= a[i]) {
                temp=b[0];
            } else {
                temp = a[i];
            }

        }

        for (int i = 1; i < a.length; i++) {
            if (temp1 < temp && temp1 >= a[i]) {
                b[1] = temp1;
            } else {
                temp1 = a[i];
            }

        }

        return b;
    }

    public static void main(String[] args) {
        int mya[]={12,23,25,245,87,98,956,2};

        int[]donusArray=sortingArray(mya);
        for(int i=0;i<2;i++){
        System.out.println(donusArray[i]);
        }


    }

}
