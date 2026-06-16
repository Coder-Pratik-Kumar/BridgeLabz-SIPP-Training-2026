import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number of students.");
            scanner.close();
            return;
        }

        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter physics marks for student " + (i + 1) + ": ");
            double p = scanner.nextDouble();
            System.out.print("Enter chemistry marks for student " + (i + 1) + ": ");
            double c = scanner.nextDouble();
            System.out.print("Enter maths marks for student " + (i + 1) + ": ");
            double m = scanner.nextDouble();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks. Enter non-negative values.");
                i--;
                continue;
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
            percentage[i] = (p + c + m) / 3.0;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 80) {
                grade[i] = "B";
            } else if (percentage[i] >= 70) {
                grade[i] = "C";
            } else if (percentage[i] >= 60) {
                grade[i] = "D";
            } else {
                grade[i] = "F";
            }
        }

        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.1f\t%.1f\t%.1f\t%.2f\t%s%n", i + 1,
                physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
        scanner.close();
    }
}
