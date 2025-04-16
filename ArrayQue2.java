import java.util.Scanner;

public class ArrayQue2 {

    public static void main(String[] args) {
        System.out.print("Size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Array elemnts : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("\nMaximum element in array : " + max);
    }
}