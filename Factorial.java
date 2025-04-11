import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        System.out.print("Factorial : " + fact);
    }
}
