// Recursive Binary Search
public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9 };
        int x = 7;
        int result = search(arr, 0, arr.length - 1, x);
        System.out.println("Element found at index: " + result);
    }

    public static int search(int[] arr, int l, int r, int x) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x)
                return search(arr, mid + 1, r, x);
            else
                return search(arr, l, mid - 1, x);
        }
        return -1;
    }
}