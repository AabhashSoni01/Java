abstract class Shape {
    abstract void area(int m, int n);

    void display() {
        System.out.println("Area has been calculated !");
    }
}

class Circle extends Shape {
    void area(int m, int n) {
        if (m != n) {
            System.out.println("For a circle, both parameters must be equal (radius).");
        } else {
            System.out.println("Area of circle of radius " + m + " : " + (3.14 * m * m));
        }
    }
}

class Rectangle extends Shape {
    void area(int length, int width) {
        System.out
                .println("Area of a rectangle of length " + length + " and width " + width + " : " + (length * width));
    }
}

public class AbstractClassQuestion1 {

    public static void main(String[] args) {
        Shape obj1 = new Circle();
        obj1.area(5, 5);
        obj1.display();

        Shape obj2 = new Rectangle();
        obj2.area(8, 9);
        obj2.display();
    }
}
