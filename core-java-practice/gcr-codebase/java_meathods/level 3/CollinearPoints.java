import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();

        boolean slopeCollinear = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaCollinear = areCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("Collinear by slope: " + slopeCollinear);
        System.out.println("Collinear by area: " + areaCollinear);
        scanner.close();
    }

    public static boolean areCollinearBySlope(double x1, double y1,
                                              double x2, double y2,
                                              double x3, double y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    public static boolean areCollinearByArea(double x1, double y1,
                                             double x2, double y2,
                                             double x3, double y3) {
        double area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return Math.abs(area) < 1e-9;
    }
}
