package kapsam;

public class DegiskenKapsam {

    private int privateDegisken=30;//iki degisken ayni isimde fakat java daha local olani alir.

    public DegiskenKapsam(){

        System.out.println("Private degiskenimiz="+privateDegisken);

    }

    public void onileCarp(){

        int privateDegisken=10;//bu fonksiyon cagrildiginda java "10" degerini alir cunku daha lokaldir.


        for(int i=1;i<6;i++){

           // System.out.println(i+"*"+privateDegisken+"="+(i*privateDegisken));// normalde burda degisken olarak "10" alir
            System.out.println(i+"*"+this.privateDegisken+"="+(i*this.privateDegisken));// this koyarsak sinifin degiskeni olan "30 alir

        }
    }
}
