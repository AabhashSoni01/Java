import java.util.*;

public class IteratorQue6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("alice", "bob", "", "Alice", "BOB", "eve", ""));

        // Step 1: Remove empty strings and case-insensitive duplicates
        Set<String> seen = new HashSet<>();
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next().trim();
            if (name.isEmpty() || !seen.add(name.toLowerCase())) {
                it.remove();
            }
        }

        // Step 2: Convert to Title Case using ListIterator
        ListIterator<String> lit = names.listIterator();
        while (lit.hasNext()) {
            String name = lit.next();
            lit.set(capitalize(name));
        }

        // Step 3: Print cleaned list
        System.out.println("Cleaned Names: " + names);
    }

    // Helper method to capitalize first letter
    public static String capitalize(String name) {
        if (name.isEmpty())
            return name;
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
