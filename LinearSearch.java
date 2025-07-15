// 1. Linear Search
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int x = 8;
        int result = search(arr, x);
        System.out.println("Element found at index: " + result);
    }

    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}