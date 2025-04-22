import java.util.Scanner;

public class ArrayQue19 {
    public static void main(String[] args) {

        // linear search array

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements if array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search : ");
        int element = sc.nextInt();
        sc.close();

        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == element) {
        // System.out.println(element + " found at index : " + i);
        // }
        // }

        // or

        boolean found = false;
        for (int val : arr) {
            if (val == element) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(element + " is present in the array");
        } else {
            System.out.println(element + " is not present in the array");
        }
    }
}
