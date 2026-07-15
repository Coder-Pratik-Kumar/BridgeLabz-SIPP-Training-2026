public class Circle {
    private double radius;

    public Circle() {
        this(1.0); // default radius via constructor chaining
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Circle:");
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.4f\n", area());
        System.out.println();
    }
}
