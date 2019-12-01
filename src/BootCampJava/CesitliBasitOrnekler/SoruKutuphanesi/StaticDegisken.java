package BootCampJava.CesitliBasitOrnekler.SoruKutuphanesi;

public class StaticDegisken {



       /* public static int a;
        public int b;
        public static void yazdir(StaticDegisken sd){

            System.out.println(StaticDegisken.a);
        }

    public static void main(String[] args) {
        StaticDegisken sd=new StaticDegisken();
        StaticDegisken sd1=new StaticDegisken();
        sd.a=75;
        sd.b=45;
        sd1.b=30;
        System.out.println(sd1.a);
        System.out.println(sd.b);
        System.out.println(sd1.b);

        /*
        Ancak sd1.a için hiç bir şey yapmadım buna rağmen System.out.println(sd1.a);
        ile 75 bastırdım. İşte bunu yapabilmemi sağlayan a’nın static olmasıdır.
        Yani a static olduğundan dolayı oluşturulacak “StatikDeğişken” nesnelerin bütününde 75 olacaktır.
        Fakat b statik olmadığından nesneden nesneye değişecektir. O yüzden hem sd hem de sd1 için b yi tanımlamanız gerekir. Statiğin faydasını görmüş oluyoruz. Eğer değişkeniniz statikse bütün nesnelerde aynı değeri
gösterecektir
         */

            //aynı işi yapan biri statik biri statik olmayan iki metod tanımladım
           /* public static int Hesapla(int a,int b ){
                int sum=1;
                for (int i = 0; i < b; i++) {
                    sum*=a;
                }
                return sum;
            }
            public int Hesapla1(int a,int b){
                int sum=1;
                for (int i = 0; i < b; i++) {
                    sum*=a;
                }
                return sum;
            }

  /*  public static void main(String[] args) {
         StaticDegisken test=new StaticDegisken();
         StaticDegisken test1=new StaticDegisken();
        System.out.println( test.Hesapla1(3,5));
        System.out.println(test1.Hesapla1(3,2));
        int a=StaticDegisken.Hesapla(3,2);
        int b=StaticDegisken;


    }*/

}







