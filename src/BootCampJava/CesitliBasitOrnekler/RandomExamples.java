package BootCampJava.CesitliBasitOrnekler;

public class RandomExamples {
    public static int createRandomNumbers(){

        double randomNumber=Math.random()*3;
        int randInt=(int)randomNumber;
        return randInt;

    }


    public static String createRandomStrings(){

        String password="";
        double rand;
        for(int i=1;i<7;i++){

            rand=Math.random()*10;
            int randint=(int) rand;
            password=password+randint;

        }
        return password;
    }


    public static void main(String[] args) {
        System.out.println(createRandomStrings());
    }
}
