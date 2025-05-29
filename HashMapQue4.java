import java.util.*;

public class HashMapQue4 {

    // Check if Two Strings Are Anagrams

    static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str2.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0)
                return false;
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println("They are anagrams !");
        } else {
            System.out.println("They are not anagrams !");
        }
    }
}
