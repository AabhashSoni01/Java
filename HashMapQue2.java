import java.util.HashMap;

public class HashMapQue2 {
    // counting the frequency of words using hashmap

    public static void main(String[] args) {
        String str = "programming is fun and fun is programming";
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
