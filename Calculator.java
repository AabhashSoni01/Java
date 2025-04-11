import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
        sc.close();
        switch (op) {
            case '+':
                System.out.println("Addition : " + (a + b));

                break;
            case '-':
                System.out.println("Subtraction : " + (a - b));

                break;
            case '*':
                System.out.println("Multiplication : " + (a * b));

                break;
            case '/':
                if (b > 0) {
                    System.out.println("Division : " + (float)(a / b));

                    break;
                } else {
                    System.out.println("INF");

                    break;
                }

            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
