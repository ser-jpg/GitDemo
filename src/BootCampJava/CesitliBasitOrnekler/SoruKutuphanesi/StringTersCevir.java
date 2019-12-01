package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi;

public class StringTersCevir {
    public static void main(String[] args) {

        String word="serkan";
        palindrom(word);


    }
    public static String palindrom(String word){
        String result="";

        for(int i=word.length()-1;i>=0;i--){

            result=result+word.charAt(i);

        }
        System.out.println(result);
        return result;


    }
}
