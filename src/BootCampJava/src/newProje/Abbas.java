package BootCampJava.src.newProje;

public class Abbas {
    public static void main(String[] args) {
        /*String[]array={"A","B","C","D","A","B"};
        removedublicateofStringArray(array);*/



        moveZerosToEnd(new int[] {12, 0, 7, 0, 8, 0, 3});


    }
    public static void removedublicateofStringArray(String[]array){


        String container=array[0];

        for(int i=0;i<array.length;i++){
            if(container!=array[i]){
                container=array[i];
                System.out.println(container);

            }


        }
    }

    static void moveZerosToEnd(int inputArray[]) {
        //Initializing counter to 0

        int counter = 0;

        //Traversing inputArray from left to right

        for (int i = 0; i < inputArray.length; i++) {
            //If inputArray[i] is non-zero

            if (inputArray[i] != 0) {
                //Assigning inputArray[i] to inputArray[counter]

                inputArray[counter] = inputArray[i];

                //Incrementing the counter by 1

                counter++;
                System.out.println();
            }
        }

        //Assigning zero to remaining elements

        while (counter < inputArray.length) {
            inputArray[counter] = 0;

            counter++;
        }
        System.out.println(inputArray);


    }
}
