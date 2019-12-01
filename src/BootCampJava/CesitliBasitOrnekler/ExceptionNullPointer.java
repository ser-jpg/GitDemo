package BootCampJava.CesitliBasitOrnekler;
/* write a methods to print any word with next letter consider null string inputs and a measure for that
simple:
input abc
output:bcd
 */

public class ExceptionNullPointer {
    public static void main(String[] args) {
        printNextLetter(null);



    }
    public static void printNextLetter(String input){

        char letter;
        try{
        for(int i=0;i<input.length();i++){

            letter=input.charAt(i);
            letter++;
            System.out.print(letter);
        }
        }
        catch (NullPointerException e){
            System.out.println("I can not do this null ");
        }
        System.out.println("Codes continue");


    }
}
