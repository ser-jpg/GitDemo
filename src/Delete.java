import java.util.Scanner;

public class Delete {

    public static void main(String[] args) {
        System.out.println("* * * * * * * *");
        System.out.println("*"+"             *");
        System.out.println("*"+"             *");
        System.out.println("*"+"             *");
        System.out.println("*"+"             *");
        System.out.println("*"+"             *");
        System.out.println("*"+"             *");
        System.out.println("* * * * * * * *");

        System.out.println("sacma bir odev");
        System.out.println("sacma bir odev");
        System.out.println("sacma bir odev");
    }
    public void findMaxNumber(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("please eneter two number");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num1>num2){

            System.out.println("num1 is"+num1+"max");
        }
        else{
            System.out.println("num2 is"+num2+"max");
        }


    }

}
