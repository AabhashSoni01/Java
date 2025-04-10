import java.util.Scanner;

public class Divisible5and11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Divisible by 5 and 11");
        } else {
            System.out.println("Not divisible by 5 and 11");
        }
    }
}