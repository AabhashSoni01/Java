public class MinJumps {

    // Minimum number of jumps to reach the end of the array

    public static int minJumpsToEnd(int[] arr) {
        if (arr.length <= 1)
            return 0;

        int jumps = 1, maxReach = arr[0], steps = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1)
                return jumps;
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;
            if (steps == 0) {
                jumps++;
                if (i >= maxReach)
                    return -1;
                steps = maxReach - i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println("Min Jumps: " + minJumpsToEnd(arr));
    }
}
