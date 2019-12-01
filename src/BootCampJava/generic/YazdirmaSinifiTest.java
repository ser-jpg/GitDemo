package BootCampJava.generic;

public class YazdirmaSinifiTest {

    public static void main(String[] args) {

        Character [] characters_dizi={'A','B','C','D','E'};
        String []strings_dizi={"Java","Phyton","C++"};
        Integer[]integers_dizi={1,2,3,4,5,6};

        YazdirmaSinifi<Character> yazdir_Char=new YazdirmaSinifi<>();
        YazdirmaSinifi<String> yazdir_String=new YazdirmaSinifi<>();
        YazdirmaSinifi<Integer> yadirma_integer=new YazdirmaSinifi<>();

       /* yazdir_Char.yazdir(characters_dizi);
        yazdir_String.yazdir(strings_dizi);
        yadirma_integer.yazdir(integers_dizi);*/

       yazdir(characters_dizi);
       yazdir(strings_dizi);
       yazdir(integers_dizi);
    }
    public static <E> void yazdir(E []dizi){

        for(E e:dizi){
            System.out.println(e);

        }
    }
}
