import java.util.*;

public class ComparableAndComparatorQue1 {

    // Sort by Name Length using Comparator

    public static class Student {
        String name;

        Student(String name) {
            this.name = name;
        }

        // For display purposes
        public String toString() {
            return name;
        }
    }

    // Comparator to sort by name length
    public static class NameLengthComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.name.length(), s2.name.length());
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Aabhash"));
        students.add(new Student("Adarsh"));
        students.add(new Student("Aditya"));
        students.add(new Student("Bob"));

        // Sort using the NameLengthComparator
        Collections.sort(students, new NameLengthComparator());

        // Output the sorted list
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
