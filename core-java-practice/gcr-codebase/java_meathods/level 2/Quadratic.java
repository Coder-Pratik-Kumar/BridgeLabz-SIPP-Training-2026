import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient a cannot be zero for a quadratic equation.");
            scanner.close();
            return;
        }

        double[] roots = findRoots(a, b, c);
        if (roots.length == 2) {
            System.out.printf("Root 1: %.4f%nRoot 2: %.4f%n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("One root: %.4f%n", roots[0]);
        } else {
            System.out.println("No real roots.");
        }
        scanner.close();
    }

    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            return new double[0];
        }
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        double sqrtDelta = Math.sqrt(delta);
        double root1 = (-b + sqrtDelta) / (2 * a);
        double root2 = (-b - sqrtDelta) / (2 * a);
        return new double[]{root1, root2};
    }
}
