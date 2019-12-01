package innerClass;

public class StaticMath {

    private static double PI=Math.PI;

    public static class Alan{

        public void daireAlan(int yaricap){

            System.out.println("Dairenin alani: "+(PI*yaricap*yaricap));
        }
    }
}
