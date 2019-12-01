package BootCampJava.CesitliBasitOrnekler;
/*int solveMeFirst(int a, int b);

where,

a is the first integer input.
b is the second integer input
Return values

sum of the above two integers
Sample Input

a = 2
b = 3
Sample Output

5
*/

import java.util.Scanner;

public class HExampleSum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a=scanner.nextInt();
        System.out.println("Enter an other integer ");
        int b=scanner.nextInt();
        System.out.println("Total:"+subtwointeger(a,b));
    }

    public static int subtwointeger(int a, int b){

        return (a+b);
    }
}
