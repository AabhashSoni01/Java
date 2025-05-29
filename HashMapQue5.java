import java.util.*;

public class HashMapQue5 {

    // Sort a Map by Keys and Values
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Banana", 10);
        map.put("Apple", 30);
        map.put("Mango", 20);

        Map<String, Integer> treeMap = new TreeMap<>(map);
        System.out.println("Sorted by keys : " + treeMap);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        System.out.println("Sorted by values : ");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
