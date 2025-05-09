class circle {
    int radius;

    public float Circumference() {
        float pi = 3.14f;
        return 2 * pi * radius;
    }

    public static void main(String[] args) {
        circle c1 = new circle();
        c1.radius = 5;
        circle c2 = new circle();
        c2.radius = 8;

        System.out.println("Circumference of circle 1 : " + c1.Circumference());
        System.out.println("Circumference of circle 2 : " + c2.Circumference());
    }
}
