package BootCampJava.CesitliBasitOrnekler;

public class PasswordNumbersLetter {
    public static String createPsswordNumbersLetter(){


        String password="";
        double rand;
        char randChar;

        for(int i=1;i<4;i++){
            rand=Math.random()*10;
            int randint=(int) rand;
            password=password+randint;

        }
        for(int j=1;j<4;j++){
            rand=Math.random()*(122-97)+97;
            randChar=(char) rand;
            password=password+randChar;


        }
        return password;
    }

    public static void main(String[] args) {
        int k=10;
        while (k>0){
        System.out.println(createPsswordNumbersLetter());
        k--;
        }
    }
}
