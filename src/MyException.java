public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
    public void m(){
        System.out.println("Hi from my Exception");
    }
}
