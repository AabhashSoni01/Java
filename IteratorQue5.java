import java.util.*;

public class IteratorQue5 {

    // Remove all negative, use a ListIterator to traverse the remaining list in
    // reverse and multiply each element by its index (in reverse order)

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, -3, 7, -1, 4));

        // Step 1: Remove all negative numbers
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() < 0) {
                it.remove();
            }
        }

        // Step 2: Reverse traverse using ListIterator and modify
        ListIterator<Integer> lit = list.listIterator(list.size());
        int index = list.size() - 1;
        while (lit.hasPrevious()) {
            int val = lit.previous();
            lit.set(val * index);
            index--;
        }

        System.out.println("Final list: " + list);
    }
}
