// Iterative Binary Search
public class IterativeBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9 };
        int x = 5;
        int result = search(arr, x);
        System.out.println("Element found at index: " + result);
    }

    public static int search(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
}