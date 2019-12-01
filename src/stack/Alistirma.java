package stack;

import java.util.Enumeration;
import java.util.Stack;

public class Alistirma {

    public static void main(String[] args) {

        Stack<String> stack=new Stack<String>();

        stack.push("Java");
        stack.push("phaytaon");
        stack.push("go");
        stack.push("c");

        for(String s:stack){

            System.out.println(s);
        }
        System.out.println("**********************");
        // istersek boyle de yapabiliriz.

        Enumeration<String> enumeration=stack.elements();

        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        System.out.println("*******************************");
        System.out.println("son elemani goster"+stack.peek());

        System.out.println("**********************");
        System.out.println("son eleman cikariliyor"+stack.pop());
        System.out.println("*******************");

        while (!stack.empty()){
            System.out.println("Eleman cikariliyor :"+stack.pop());
        }
    }
}
