package BootCampJava.CesitliBasitOrnekler;
/*
For any String array find the number of elements their length is less than 4
Sample: array={"abc","desft"," klmn","as"}
output: There are 2 elements its is less than 4
 */

public class ArrayFindLenght {
    public static void main(String[] args) {
        String array[]={"1234","asdvr","as","qwe","olk"};
        int elements=0;
        for(int i=0;i<array.length;i++){
            if(array[i].length()<4){
                elements++;
            }
        }
        System.out.println("There are "+elements+ " elements in your array");
    }
}
