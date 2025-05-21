import java.util.Scanner;

public class PosNegCounter {

    public static void main(String[] args) {
        System.out.print("array size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int posCount = 0, negCount = 0, zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posCount++;
            } else if (arr[i] < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("total positive no. present : " + posCount);
        System.out.println("total negative no. present : " + negCount);
        System.out.println("total zeros present : " + zeroCount);
    }
}