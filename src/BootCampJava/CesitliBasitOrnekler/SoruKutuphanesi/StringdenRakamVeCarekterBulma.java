package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi;
/*
Verilen bir string’te harfler dışındaki rakam ve karakterleri bulan program..
 */

public class StringdenRakamVeCarekterBulma {
    public static void main(String[] args) {
        String s="Serkan Sen 45 yasinda?";
        String a="1975";
        int b=Integer.parseInt(a);
        System.out.println(b);

        System.out.println(s.charAt(4));
        System.out.println(s.toUpperCase());
        System.out.println(s.lastIndexOf('?'));
        System.out.println(s.lastIndexOf(3));
        String k="Serkan";
        String m=new String("Serkan");

    }
   /* public static String rakamVeKarekterBul(String word){

        String container="";

        for(int i=0;i<word.length();i++){

            if(word.charAt(i))
        }
    }*/
}
