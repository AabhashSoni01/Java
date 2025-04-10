import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        if (age >= 18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not Eligible");
        }
    }
}
