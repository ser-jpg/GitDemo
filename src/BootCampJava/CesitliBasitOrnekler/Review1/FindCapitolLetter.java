package BootCampJava.CesitliBasitOrnekler.Review1;

public class FindCapitolLetter {
    public static void main(String[] args) {

        System.out.println(findCapitolLetter("AbcfgDNJUYbhyuikl"));
        System.out.println(decideString("asedFGHResdbPOU"));

    }
    public static int findCapitolLetter(String input){
        int findCapitolLetter=0;
        for(int i=0;i<input.length();i++){
        if(input.charAt(i)>64&&input.charAt(i)<91){
            findCapitolLetter++;

        }


        }



        return findCapitolLetter;

    }
    public static String decideString(String input){
        String decition="";
        int result=findCapitolLetter(input);
        if(result>4){
            decition="Accept";
        }
        else{

            decition="reject";
        }

        return decition;
    }
}
