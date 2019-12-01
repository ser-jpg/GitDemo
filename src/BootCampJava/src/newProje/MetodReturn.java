package newProje;

public class MetodReturn {

    public static int ikiiletopla(int a){
        return (a+2);
    }
    public static int dortilecarp(int a){
        return(a*4);
    }
    public static int sekizilecarp(int a){
        return (a*8);
    }
    public static void main(String[]args){


        System.out.println("islemin sonucu ="+  sekizilecarp(dortilecarp(ikiiletopla(3)))  );
    }
}
