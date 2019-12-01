package newProje;

import java.util.Scanner;

public class InternetBill {
    public static void main(String []args){

        Scanner scanner =new Scanner(System.in);
        System.out.print("Did you subscribed Y/N ? :");
        String subscription = scanner.next();
        if(subscription.equals("Y")){System.out.print("what obtion do you want to choose?");
        String choose1 =scanner.next();
        if(choose1.equals("Y")){ System.out.print("you have 0-100 GB and you will pay $10");}
        else{System.out.print("you have 100GB and you will pay $10+$40");}}
        else{System.out.print("Please visit subscribtion page");}

    }
}
