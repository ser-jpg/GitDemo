package exceptionYakalama;

public class KendiExceptionClass extends ArithmeticException {
    public KendiExceptionClass( String message) {
        super(message);
    }

    @Override
    public  void printStackTrace() {
        System.out.println("Bu bir hatadir...");
    }

    public static void main(String[] args) {

    }
}
