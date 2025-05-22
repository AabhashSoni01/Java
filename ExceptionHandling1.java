import java.util.Scanner;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        // int a = 10, b = 0;
        // try {
        // int c = a / b;
        // System.out.println(c);
        // } catch (Exception e) {
        // System.out.println("we can not divide by zeroo !!");
        // }
        // System.out.println("hey, code is running because we are using try & catch
        // !!");
        // System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a :");
        int a = sc.nextInt();
        System.out.print("enter b :");
        int b = sc.nextInt();
        sc.close();

        if (b == 0) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println("we can not divide by zeroo !!");
                System.out.println("hey, code is running because we are using try & catch !!");
                System.out.println();
            }
        } else {
            System.out.println("division of " + a + " / " + b + " : " + a / b);
        }
    }
}