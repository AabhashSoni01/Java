import java.util.ArrayList;
import java.util.Iterator;

public class IteratorQue1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("rohit");
        name.add("shivam");
        name.add("virat");
        name.add("aabhash");

        Iterator<String> itr = name.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element);
            if (element.startsWith("s")) {
                itr.remove();
            }
        }
        System.out.println(name);
    }
}
