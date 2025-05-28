import java.util.HashMap;

public class HashMapQue1 {
    // counting the frequency of characters using hashmap

    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Character key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}