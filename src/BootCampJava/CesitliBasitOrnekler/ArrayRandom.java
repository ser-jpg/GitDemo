package BootCampJava.CesitliBasitOrnekler;
/* Write a java methods to create an integer array with "n" elements put random numbers between 1000-5000
sample:createRandomintegerarray(5)
output: {2435,4978,1987,2897,3578}
 */

public class ArrayRandom {
    public static void main(String[] args) {
        int Array[]=new int[20];
        double Random;
        for(int i=0;i<Array.length;i++){
            Random=Math.random()*(5000-1000)+1000;
            Array[i]=(int)Random;
            System.out.println(Array[i]);
        }


    }
}
