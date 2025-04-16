import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int res = 0;
        while (a > 0) {
            int digit = a % 10;
            res += digit;
            a = a / 10;
        }
        System.out.println(res);
    }
}