package newProje;

import java.util.Scanner;

public class UsersLogin {
    public static void main(String []args){

        Scanner scanner=new Scanner(System.in);
        int right_entry=3;
        String sys_password="1975";
        String sys_name="Serkan Sen";
        System.out.println("*********************************");
        System.out.println("welcome to our bank...");
        System.out.println("*********************************");

        while(true){
            System.out.println("Please enter your name :");
            String name=scanner.nextLine();
            System.out.println("Please enter password...");
            String password=scanner.nextLine();

            if(name.equals(sys_name)&& password.equals(sys_password)){
                System.out.println("Welcome...");
                break;
            }
            else if(name.equals(sys_name)&& !password.equals(sys_password)){
                right_entry-=1;
                System.out.println("Right Enter:"+right_entry);
                System.out.println("Your Password is wrong!");

            }


            else if(!name.equals(sys_name)&& password.equals(sys_password)){
                right_entry-=1;
                System.out.println("Right Enter:"+right_entry);
                System.out.println("Your name is wrong!");


            }

            else {
                System.out.println("Your users name and password is wrong");
                right_entry-=1;
                System.out.println("Right Enter :"+right_entry);

            }
            if(right_entry==0){
                System.out.println("Right Enter is finished!");
                break;

            }







        }


    }
}
