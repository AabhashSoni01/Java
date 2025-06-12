import java.util.*;

// Rearrange array such that arr[i] = i, if i is present

public class RearrangeArray {
    public static void fixArray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = set.contains(i) ? i : -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        fixArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
