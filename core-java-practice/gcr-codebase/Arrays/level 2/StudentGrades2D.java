import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number of students.");
            scanner.close();
            return;
        }

        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter physics marks for student " + (i + 1) + ": ");
            double physicsMark = scanner.nextDouble();
            System.out.print("Enter chemistry marks for student " + (i + 1) + ": ");
            double chemistryMark = scanner.nextDouble();
            System.out.print("Enter maths marks for student " + (i + 1) + ": ");
            double mathsMark = scanner.nextDouble();

            if (physicsMark < 0 || chemistryMark < 0 || mathsMark < 0) {
                System.out.println("Invalid marks. Enter non-negative values.");
                i--;
                continue;
            }

            marks[i][0] = physicsMark;
            marks[i][1] = chemistryMark;
            marks[i][2] = mathsMark;
            percentage[i] = (physicsMark + chemistryMark + mathsMark) / 3.0;

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
                marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
        scanner.close();
    }
}
