import java.util.*;

public class FirstRepeatingElement {
    public static int firstRepeatingElement(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                return arr[i];
            }
            set.add(arr[i]);
        }
        return -1; // if no repeating element
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        System.out.println("First Repeating Element: " + firstRepeatingElement(arr));
    }
}
