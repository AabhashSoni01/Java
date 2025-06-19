// LeetCode Problem: 209. Minimum Size Subarray Sum
// Description: Given an array of positive integers nums and a positive integer target,
// return the minimal length of a contiguous subarray of which the sum is greater than or equal to target.
// If there is no such subarray, return 0 instead.

public class SmallestSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left++];
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        System.out.println(minSubArrayLen(7, nums)); // Output: 2
    }
}
