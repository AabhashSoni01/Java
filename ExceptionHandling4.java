import java.util.Scanner;

public class ExceptionHandling4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter a string : ");
            String str = sc.nextLine();
            sc.close();

            if (str == null) {
                throw new NullPointerException("string is null");
            }

            if(str.trim().isEmpty()){
                throw new IllegalArgumentException("Input string is empty or whitespace");
            }

            System.out.println("Uppercase of " + str + " : " + str.toUpperCase());

        } catch (NullPointerException e) {
            System.out.println("Exception occured : " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
