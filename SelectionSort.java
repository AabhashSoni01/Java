// Selection Sort
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 29, 10, 14, 37, 13 };
        sort(arr);
        System.out.print("Sorted array: ");
        for (int n : arr)
            System.out.print(n + " ");
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}