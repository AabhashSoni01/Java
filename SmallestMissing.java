import java.util.*;

// Smallest missing positive integer in an array

public class SmallestMissing {
    public static int findMissing(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr)
            if (num > 0)
                set.add(num);

        for (int i = 1; i <= arr.length + 1; i++) {
            if (!set.contains(i))
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, -10, 1, 3, -20 };
        System.out.println("Smallest Missing Positive: " + findMissing(arr));
    }
}
