import java.util.Scanner;

public class TriangularRunRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangular park in meters: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 of the triangular park in meters: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 of the triangular park in meters: ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;
        double roundsNeeded = calculateRoundsForDistance(perimeter, 5000.0);

        System.out.printf("Perimeter of the triangular park is %.2f meters.%n", perimeter);
        System.out.printf("To complete a 5 km run, the athlete needs %.2f rounds (%.0f full rounds minimum).%n",
                roundsNeeded, Math.ceil(roundsNeeded));
        scanner.close();
    }

    public static double calculateRoundsForDistance(double perimeter, double distanceMeters) {
        if (perimeter <= 0) {
            return 0;
        }
        return distanceMeters / perimeter;
    }
}
