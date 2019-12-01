package BootCampJava.CesitliBasitOrnekler;

public class RemoveConsecative {
    public static String removeConsecative(String input){

        String remove="";


        for(int i=1;i<input.length();i++) {

            if(input.charAt(i-1)!=input.charAt(i)){
                remove=remove+input.charAt(i-1);

            }
        }
        return remove;


    }

    public static void main(String[] args) {
        System.out.println(removeConsecative("aaabbb"));
    }






}
