import java.util.ArrayList;
import java.util.Iterator;

public class IteratorQue3 {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");

        // Obtain an iterator for the ArrayList
        Iterator<String> it = al.iterator();

        // Iterate through the elements and print each one
        while (it.hasNext()) {

            // Get the next element
            String n = it.next();
            System.out.println(n);
        }
    }
}
