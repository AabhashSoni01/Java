import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int digit;
        int res = 0;
        while (a > 0) {
            digit = a % 10;
            res += digit;
            a = a / 10;
            // if (digit % 2 == 0) {
            //     System.out.println("even");
            // } else {
            //     System.out.println("odd");
            // }
        }
        System.out.println(res);
    }
}