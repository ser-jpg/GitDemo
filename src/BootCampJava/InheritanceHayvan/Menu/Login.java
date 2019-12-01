package BootCampJava.InheritanceHayvan.Menu;

import java.util.Scanner;

public class Login {
    public boolean login(Menu menu){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter users name:");
        String user_name=scanner.nextLine();
        System.out.print("Please enter password:");
        String password=scanner.nextLine();
        if(menu.getUsers_name().equals(user_name)&&menu.getPassword().equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
