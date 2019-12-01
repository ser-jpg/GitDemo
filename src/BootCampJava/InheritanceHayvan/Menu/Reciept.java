package BootCampJava.InheritanceHayvan.Menu;

import OOPGiris.AtmProjesi.Hesap;

import java.util.Scanner;

public class Reciept {
    public void reciept(Menu menu) {
        Scanner scanner = new Scanner(System.in);

        Login login = new Login();
        System.out.println("Wellcome our Restourant...");
        System.out.println("********************************");
        System.out.println("Please enter our System...");
        System.out.println("***********************************");
        while (true) {
            if (login.login(menu)) {

                System.out.println("Login is succesful...");
                break;
            } else {
                System.out.println("Login is failed.Please try again...");

            }
        }
        System.out.println("Restourant Menu Alternatives...");
        System.out.println("*********************************************");


        String alternatives = "1.Soups: Lentil[$3.99], Tomato[4.99], Fish[8.99]\n"
                + "2.Meals: Rice:[$3.99], Chicken[$5.99], Beef[$7.99]\n"
                + "3.Salad: Ceaser[$2.99], Waldorf[$3.99]\n"
                + "For exit Please press q button..";

        System.out.println(alternatives);
        System.out.println("***************************************************");

        double lentil = 3.99;
        double tomato = 4.99;
        double fish = 8.99;
        double rice = 3.99;
        double chicken = 5.99;
        double beef = 7.99;
        double ceaser = 2.99;
        double waldorf = 3.99;
        int quantity;
        while(true) {

            System.out.println("Please you set up a menu...");

            String choice = scanner.nextLine();
            System.out.println("Please enter quantity:");
            quantity = scanner.nextInt();
            scanner.nextLine();
            double total1 = 0;

            if (choice.equals("Lentil") || choice.equals("lentil")) {
                total1 = (quantity * lentil) + total1;
                System.out.println("you will pay for soup =" + total1);


            } else if (choice.equals("tomato") || choice.equals("Tomato")) {
                total1 = (quantity * tomato) + total1;
                System.out.println("you will pay for soup =" + total1);

            } else if (choice.equals("Fish") || choice.equals("fish")) {
                total1 = (quantity * fish) + total1;
                System.out.println("you will pay for soup =" + total1);
            } else {
                System.out.println("Invalid Transaction");

            }

            System.out.println("You can choice a meal if you want it:");

            if (choice.equals("rice") || choice.equals("Rice")) {
                total1 = (quantity * lentil) + total1;
                System.out.println("you will pay for meal =" + total1);


            } else if (choice.equals("chicken") || choice.equals("Chicken")) {
                total1 = (quantity * tomato) + total1;
                System.out.println("you will pay for meal =" + total1);

            } else if (choice.equals("Beef") || choice.equals("Beef")) {
                total1 = (quantity * fish) + total1;
                System.out.println("you will pay for meal =" + total1);
            } else {
                System.out.println("Invalid Transaction");


            }
            System.out.println("You can choice a salad if you want it:");
            if (choice.equals("Ceaser") || choice.equals("Ceaser")) {
                total1 = (quantity * lentil) + total1;
                System.out.println("you will pay for salad=" + total1);

            } else if (choice.equals("waldorf") || choice.equals("Waldorf")) {
                total1 = (quantity * tomato) + total1;
                System.out.println("you will pay for salad =" + total1);
            } else {
                System.out.println("Invalid Transaction");
            }
        }










    }

}







