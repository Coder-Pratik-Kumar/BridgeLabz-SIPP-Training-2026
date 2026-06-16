import java.util.Scanner;

public class TeamBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number of persons.");
            scanner.close();
            return;
        }

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            double w = scanner.nextDouble();
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            double h = scanner.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input. Enter positive values.");
                i--;
                continue;
            }

            weight[i] = w;
            height[i] = h;
            bmi[i] = w / (h * h);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25.0) {
                status[i] = "Normal weight";
            } else if (bmi[i] < 30.0) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n", i + 1, height[i], weight[i], bmi[i], status[i]);
        }
        scanner.close();
    }
}
