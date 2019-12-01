package BootCampJava;

        import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for(int j=1;j>0;j++) {
            System.out.print("You enter number:");
            int number = scanner.nextInt();
            System.out.print("You open power:");
            int power = scanner.nextInt();
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;

            }


            System.out.println(result);


        }
    }
}
