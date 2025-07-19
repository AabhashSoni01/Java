// Merge Sort
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 1, 3 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("Sorted array: ");
        for (int n : arr)
            System.out.print(n + " ");
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int[] left = java.util.Arrays.copyOfRange(arr, l, mid + 1);
        int[] right = java.util.Arrays.copyOfRange(arr, mid + 1, r + 1);
        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
    }
}