public class ArrayQue5 {
    public static void main(String[] args) {
        // sum of two arrays index wise
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int[] sum = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            sum[i] = arr1[i] + arr2[i];
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}
