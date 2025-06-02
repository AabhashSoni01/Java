import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionQue2 {
    public static class student {
        int rollNo;
        String name;
        int age;

        public student(int rollNo, String name, int age) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return "rollNo: " + rollNo + " name: " + name + " age: " + age;
        }

        public int compareTo(student s) {
            return this.age - s.age;
        }
    }

    public static class sortByName implements Comparator<student> {
        public int compare(student s1, student s2) {
            return s1.name.compareTo(s2.name);
        }
    }

    public static class sortByRollNo implements Comparator<student> {
        public int compare(student s1, student s2) {
            return s1.rollNo - s2.rollNo;
        }
    }

    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student(2, "rahul", 20));
        list.add(new student(1, "rohit", 19));
        Collections.sort(list, new sortByName());
        System.out.println("\nsorted name wise :");
        for (student s : list) {
            System.out.println(s);
        }
        Collections.sort(list, new sortByRollNo());
        System.out.println("\nsorted roll no wise :");
        for (student s : list) {
            System.out.println(s);
        }
        System.out.println();
    }
}
