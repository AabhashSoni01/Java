import java.util.*;

public class ComparableAndComparatorQue2 {

    // Implement Comparable in Student to Sort by Roll Number

    public static class Student implements Comparable<Student> {
        int rollNumber;
        String name;

        Student(int rollNumber, String name) {
            this.rollNumber = rollNumber;
            this.name = name;
        }

        public int compareTo(Student other) {
            return Integer.compare(this.rollNumber, other.rollNumber);
        }

        public String toString() {
            return rollNumber + " - " + name;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1001, "Aabhash"));
        students.add(new Student(1012, "Adarsh"));
        students.add(new Student(1022, "Aditya"));
        students.add(new Student(1072, "Bob"));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
