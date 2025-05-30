import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorQue2 {
    // ListIterators
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("rohit");
        name.add("shivam");
        name.add("virat");
        name.add("aabhash");

        ListIterator<String> itr = name.listIterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
        }

        System.out.println("\nin reverse :");
        while (itr.hasPrevious()) {
            String lastvalue = itr.previous();
            System.out.println(lastvalue);
        }
    }
}
