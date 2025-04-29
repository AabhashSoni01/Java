class student {
    int rollNo;
    String name;
    int marks;

    student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll no : " + rollNo + "\n" + "Name : " + name + "\n" + "Marks : " + marks);
    }
}

public class ArrayQue31 {
    public static void main(String[] args) {
        student s1 = new student(1, "one", 66);
        s1.display();
    }
}
