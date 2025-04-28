public class ArrayQue28 {

    // bubble sort

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.println(num + "");
        }
    }

    public static void target(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("target " + target + " found at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 4, 7, 6 };
        bubbleSort(arr);
        target(arr, 7);
    }
}
