import java.util.Scanner;

public class ArrayQue3 {

    // for even odd count
    public static void main(String[] args) {
        System.out.print("Size of array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int even = 0, odd = 0;

        System.out.println("Array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even numbers : " + even + " Odd numbers : " + odd);
    }
}
