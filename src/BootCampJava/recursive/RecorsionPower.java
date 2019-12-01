package BootCampJava.recursive;

public class RecorsionPower {

    public static int pow(int base,int pow){

        if(pow==0){
            return 1;
        }
        else {
            return base*pow(base,pow-1);
        }

    }

    public static void main(String[] args) {
        System.out.println( pow(2,3));
    }
}
