public class ArrayQue4 {
    public static void main(String[] args) {
        // giving sum of two arrays in a single digit
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int sum = 0, sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        sum = sum1 + sum2;
        System.out.println(sum);
    }
}
