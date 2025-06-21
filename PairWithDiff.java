import java.util.*;

// Check if Array has a Pair with Given Difference K

public class PairWithDiff {
    public static boolean hasPairWithDiff(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num + k) || set.contains(num - k))
                return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 20, 3, 2, 50, 80 };
        System.out.println(hasPairWithDiff(arr, 78)); // true
    }
}
