import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQue1 {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("rahul");
        arr.add("mohit");
        arr.add("rohit");
        arr.add("dhoni");
        arr.add("virat");
        arr.add(0, "jethalal");
        arr.remove(2);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println();
    }
}