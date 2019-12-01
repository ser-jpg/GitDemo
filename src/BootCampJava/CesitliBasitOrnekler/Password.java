package BootCampJava.CesitliBasitOrnekler;
/* Design a password program
length of the password can not be shorter than 6 character
Sample input: abcdef    output: Password is ok.
sample input: abc       output: Password is not ok.
 */

public class Password {

    public static String passwordCheck(String password){
        String answer="";
        if(password.length()>=6){
            System.out.println("Password is OK.");
        }
        else {
            System.out.println("Password should be at least 6 character");
        }
        return answer;

    }

    public static void main(String[] args) {
        passwordCheck("abcdef");
    }
}
