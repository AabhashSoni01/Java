import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        // array size
        System.out.print("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        // array elements
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Target : ");
        int target = sc.nextInt();
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]); // gives two element whose sum = target
                }
            }
        }
    }
}
