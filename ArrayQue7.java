public class ArrayQue7 {
    public static void main(String[] args) {
        // common in two arrays
        int[] arr1 = { 1, 3, 5, 7, 8, 9 };
        int[] arr2 = { 1, 0, 90, 4, 8, 9 };

        System.out.print("Common element : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
