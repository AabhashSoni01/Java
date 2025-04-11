import java.util.Scanner;

public class SumNaturalNum {
    public static void main(String[] args) {
        System.out.println("Enter a num : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int orignalNum = num;
        int sum = 0;
        while (num > 0) {
            sum = sum + num;
            num--;
        }
        System.out.println("Sum of natural numbers upto " + orignalNum + " : " + sum);
    }
}
