import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = buildBmiTable(data);
        displayTable(result);
        sc.close();
    }

    public static String[] computeBmiStatus(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);
        double roundedBmi = Math.round(bmi * 100.0) / 100.0;
        String status;
        if (roundedBmi < 18.5) {
            status = "Underweight";
        } else if (roundedBmi < 25) {
            status = "Normal";
        } else if (roundedBmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        return new String[]{String.valueOf(roundedBmi), status};
    }

    public static String[][] buildBmiTable(double[][] data) {
        String[][] table = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            String weight = String.valueOf(data[i][0]);
            String height = String.valueOf(data[i][1]);
            String[] bmiStatus = computeBmiStatus(data[i][0], data[i][1]);
            table[i][0] = height;
            table[i][1] = weight;
            table[i][2] = bmiStatus[0];
            table[i][3] = bmiStatus[1];
        }
        return table;
    }

    public static void displayTable(String[][] table) {
        System.out.printf("%-10s %-10s %-10s %-12s%n", "Height", "Weight", "BMI", "Status");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s %-10s %-12s%n", row[0], row[1], row[2], row[3]);
        }
    }
}
