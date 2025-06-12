public class CircularSubarray {

    // Maximum circular subarray sum

    public static int kadane(int[] arr) {
        int max = arr[0], sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }
        return max;
    }

    public static int maxCircularSum(int[] arr) {
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i]; // invert for min subarray
        }

        int maxKadane = kadane(arr); // inverted kadane
        for (int i = 0; i < arr.length; i++)
            arr[i] = -arr[i]; // revert

        int maxWrap = totalSum + maxKadane;
        return (maxWrap == 0) ? kadane(arr) : Math.max(kadane(arr), maxWrap);
    }

    public static void main(String[] args) {
        int[] arr = { 8, -1, 3, 4 };
        System.out.println("Max Circular Sum: " + maxCircularSum(arr));
    }
}
