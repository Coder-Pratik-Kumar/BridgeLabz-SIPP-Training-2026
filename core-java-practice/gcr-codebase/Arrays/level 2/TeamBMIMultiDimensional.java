import java.util.Scanner;

public class TeamBMIMultiDimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number of persons.");
            scanner.close();
            return;
        }

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            double height = scanner.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Enter positive values.");
                i--;
                continue;
            }

            double bmi = weight / (height * height);
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25.0) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30.0) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n", i + 1,
                personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        scanner.close();
    }
}
