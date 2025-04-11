import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println("Table of " + num + " : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " : " + (num * i));
        }
    }
}
