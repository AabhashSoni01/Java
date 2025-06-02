import java.util.ArrayList;
import java.util.Collections;

public class CollectionQue1 {
    public static class student implements Comparable<student> {
        String name;
        int age;

        public student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " " + age;
        }

        public int compareTo(student s) {
            return this.age - s.age;
        }
    }

    public static void main(String[] args) {
        ArrayList<student> list = new ArrayList<>();
        list.add(new student("rahul", 20));
        list.add(new student("rohit", 19));
        Collections.sort(list);
        for (student s : list) {
            System.out.println(s);
        }
    }
}