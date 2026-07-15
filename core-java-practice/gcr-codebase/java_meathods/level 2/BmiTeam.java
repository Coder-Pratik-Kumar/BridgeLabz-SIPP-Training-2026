import java.util.Scanner;

public class BmiTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3];

        for (int i = 0; i < teamData.length; i++) {
            System.out.print("Enter weight in kg for person " + (i + 1) + ": ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Enter height in cm for person " + (i + 1) + ": ");
            teamData[i][1] = scanner.nextDouble();
        }

        populateBmi(teamData);
        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < teamData.length; i++) {
            double weight = teamData[i][0];
            double height = teamData[i][1];
            double bmi = teamData[i][2];
            String status = bmiStatus(bmi);
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s%n", i + 1, weight, height, bmi, status);
        }
        scanner.close();
    }

    public static void populateBmi(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100.0;
            if (heightMeters > 0) {
                data[i][2] = weight / (heightMeters * heightMeters);
            } else {
                data[i][2] = 0;
            }
        }
    }

    public static String bmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        }
        return "Obese";
    }
}
