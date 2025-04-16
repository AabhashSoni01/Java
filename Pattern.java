import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        // for(int i = 0; i < 5; i++) {
        // for(int j = 0; j <= 5; j++) {
        // System.out.print("* ");
        // }
        // System.out.println(" ");
        // }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('A');
            }
            for (int p = 1; p < i; p++) {
                System.out.print('A');
            }
            System.out.println();
        }

    }
}