import java.util.*;

public class RomanToInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1, 'V', 5, 'X', 10,
                'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int total = 0, prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            if (curr < prev)
                total -= curr;
            else
                total += curr;
            prev = curr;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Roman to Integer: " + romanToInt("MCMXCIV")); // 1994
    }
}
