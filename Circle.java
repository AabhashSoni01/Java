public class Circle {
    int radius;

    public float Circumference() {
        float pi = 3.14f;
        return 2 * pi * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5;
        Circle c2 = new Circle();
        c2.radius = 8;

        System.out.println("Circumference of circle 1 : " + c1.Circumference());
        System.out.println("Circumference of circle 2 : " + c2.Circumference());
    }
}
