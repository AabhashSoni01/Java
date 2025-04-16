import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the value of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("The array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
