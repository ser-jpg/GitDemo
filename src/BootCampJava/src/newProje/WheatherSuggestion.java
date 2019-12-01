package newProje;

import java.util.Scanner;

public class WheatherSuggestion {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        System.out.print("please put weather temperature :");
        int temperature = scanner.nextInt();
        if(temperature >=30){
            System.out.print("You should take a hat");
        }
        else if(temperature>=25){
            System.out.print("You should take a sunglasses");
        }
        else if(temperature>=20) {
            System.out.print("You should take a jaket");
        }
        else {
            System.out.print("Hava Cok soguk olabilir dikkat et");
        }


    }
}
