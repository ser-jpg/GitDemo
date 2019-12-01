package newProje;
/*you use while and for lop:
1abcd
2abcd
3abcd
4abcd
 */
public class MathProblem1 {
    public static void main(String[]args){
        for(int i=1;i<6;i++){
            System.out.print(i);

            char letter='a';
            for(int j=1;j<5;j++){
                System.out.print(letter);
                letter++;
            }
            System.out.println();

        }
        int i=1;
        while (i<6){
            System.out.print(i);

            char letter1='a';
            int j=1;
            while (j<5){
                System.out.print(letter1);
                letter1++;
                j++;

            }
            i++;
            System.out.println();
        }

        for(int x=1;x<6;x++){
            System.out.print(x);
            char letter2='a';
            int y=1;
           while(y<5){
               System.out.print(letter2);
               letter2++;
               y++;
           }
            System.out.println();









        }






    }


}
