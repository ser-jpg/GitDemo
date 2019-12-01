package newProje;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number=scanner.nextInt();
        System.out.println("Please say How many digit your number?;");
        int digit=scanner.nextInt();
        int temprary_number=number;

        int total=0;
        do{

            int digit_value= temprary_number%10;
            System.out.println("digit value"+digit_value);
            temprary_number/=10;
            System.out.println("number"+number);
            total+=Math.pow(digit_value,digit);

            System.out.println("toplam ="+total);
        }while (temprary_number>0);

        if(number == total){
            System.out.println("This number is a Armstrong");

        }
        else{
            System.out.println("This number is not a Armstrong");}

    }
}
