package BootCampJava.CesitliBasitOrnekler;

public class RandomPassString {
    public static String createRandomStringPass(){


        String password="";//empty container
        double rand;       // to store random double value
        int randInt;       // to store double to int
        char randChar;     //
        for(int i=6;i>0;i--){
            rand=Math.random()*(122-97)+97; // producing random number in rage 97-122
            randInt=(int) rand;             //double to int type casting
            randChar=(char) randInt;         //int to char type casting
            password=password+randChar;
        }
        return password;
    }

    public static void main(String[] args) {
        int i=20;
       while(i>0) {
        System.out.println(createRandomStringPass());
        i--;
       }
    }
}
