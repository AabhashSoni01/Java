public class ExceptionHandling5 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Caught a null pointer exception !");
        }
    }
}
