import java.util.HashMap;

public class HashMapQue3 {
    // printing the character that is present only once

    public static void main(String[] args) {
        String str = "aaabccddeee";
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                System.out.println(key);
                break;
            }
        }
    }
}
