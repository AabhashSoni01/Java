public class ArrayQue26 {
    static int minInArray() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                arr[i] = min;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Minimum in array: " + minInArray());
    }
}
