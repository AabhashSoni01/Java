import java.util.*;

// Longest subarray with equal number of 0s and 1s

public class EqualZeroOne {
    public static int maxLength(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0) ? -1 : 1;

            if (sum == 0)
                maxLen = i + 1;
            else if (map.containsKey(sum))
                maxLen = Math.max(maxLen, i - map.get(sum));
            else
                map.put(sum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 1, 0 };
        System.out.println("Max Length of Equal 0s and 1s: " + maxLength(arr));
    }
}
