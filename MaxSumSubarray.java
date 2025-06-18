// Maximum Sum Subarray of Size K
public class MaxSumSubarray {
    public static int maxSum(int[] arr, int k) {
        int max = 0, windowSum = 0;
        for (int i = 0; i < k; i++)
            windowSum += arr[i];
        max = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            max = Math.max(max, windowSum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        System.out.println("Max Sum (k=3): " + maxSum(arr, 3));
    }
}
