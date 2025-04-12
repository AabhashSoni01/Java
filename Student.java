public class Student {

    // Empty class with no attributes
}

class Main {

    public static void main(String[] args) {
        Student s = new Student();

        // address with class name
        System.out.println("Address of class Student with class name : " + s);

        // address with only hash code
        System.out.print("Address of class Student with only its hash code : ");
        System.out.print(Integer.toHexString(s.hashCode()));
    }
}