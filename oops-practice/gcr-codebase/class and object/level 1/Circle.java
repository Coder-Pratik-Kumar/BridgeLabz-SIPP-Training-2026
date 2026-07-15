public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.4f\n", area());
        System.out.printf("Circumference: %.4f\n", circumference());
        System.out.println();
    }
}
