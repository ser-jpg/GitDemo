package newProje;

import java.util.Scanner;

public class FirstMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir not gir:");
        int Not = scanner.nextInt();
        switch(Not){
            case 90:
                ;
                System.out.println("AA");
                break;

            case 80:
                System.out.println("BB");
                break;

            case 70:
                ;
                System.out.println("CC");
                break;


            default:
                ;
                System.out.println("Maalesef Basarisizsiniz...");
        }







    }
}

