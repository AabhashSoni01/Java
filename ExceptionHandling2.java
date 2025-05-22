import java.util.Scanner;

public class ExceptionHandling2 {
    // index out of bound
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("array size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("enter index b : ");
        int b = sc.nextInt();
        System.out.print("enter index c : ");
        int c = sc.nextInt();
        sc.close();

        try {
            System.out.println("value at index b : " + arr[b]);
            System.out.println("index b / index c : " + (float) arr[b] / arr[c]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("array index out of bound !!");
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("array index out of bound for index c, can't give you division !!");
            System.out.println();
        }
    }
}
