package BootCampJava.CesitliBasitOrnekler;

public class Exceptions {
    public static void main(String[] args) {

        int a=10;
        int b=0;

      try{
        int result=a/b;
        System.out.println(result);
      }
      catch (Exception e){
          System.out.println(a/(b+2));
      }
        System.out.println("Next LINE");
    }
}
