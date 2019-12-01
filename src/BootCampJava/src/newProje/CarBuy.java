package newProje;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CarBuy {
    public static void main (String[]args){
        System.out.println("Please choose a model...");
        String model= "1.option modelX\n"
                    +"2.option modelY\n";

        System.out.print(model);
        System.out.println("*********************************");
        Scanner scanner=new Scanner(System.in);
        System.out.print("please choose X or Y :");
        String answer=scanner.next();
        int total_price=0;
        if(answer.equals("X")){
            int X =30000;
            System.out.print("Do you want body Y OR N? :");
            String body=scanner.next();
            if(body.equals("Y")){
                total_price=X+5000;
                System.out.println("Total Price :"+total_price);

            }
            else if(body.equals("N")){
                total_price=X+0;
                System.out.println("Total price :"+total_price);


            }
            else{
                System.out.println("please choose Y or N");
            }
            System.out.println("Do you want sound Yor N? :");
            String sound=scanner.next();
            if(sound.equals("Y")){
                total_price=X+3000;
                System.out.println("Total Price :"+total_price);

            }
            else if(sound.equals("N")){
                total_price=X+0;
                System.out.println("Total price :"+total_price);


            }
            else{System.out.println("please choose Y or N");
            }

        }
        else if(answer.equals("Y")){

        }
        else{
            System.out.println("please you choose X OR Y");
        }



    }
}
