package exceptionYakalama;

public class finallyBloqu {
    public static void main(String[] args) {

        try {

        String s=null;
        System.out.println(s.hashCode());
        }
        catch ( NullPointerException e){

            System.out.println("Null referans hatasi");


        }
        finally {
            System.out.println("Finally calisiyor...");// exception olussada olusmasada finally mutlaka calisir.
        }
    }
}
