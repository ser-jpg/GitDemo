package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi;
/*
Girilen sayının binary olup olmadığı kontrolü yapan bir metod yazınız.
 */

public class BinaryOlupOLmadigi {
    public static void main(String[] args) {
        boolean binary=kontrol(10);







    }

    public static boolean kontrol(int number){


        String temp=String.valueOf(number);
        int count=0;

        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)=='0'||temp.charAt(i)=='1'){


            }
            else{
                count++;
            }

        }
        System.out.println(count);
        if(count<1){
            return true;
        }
        else{
            return false;
        }
    }
}
