import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter physics marks: ");
        double physics = input.nextDouble();
        System.out.print("Enter chemistry marks: ");
        double chemistry = input.nextDouble();
        System.out.print("Enter maths marks: ");
        double maths = input.nextDouble();
        input.close();

        double total = physics + chemistry + maths;
        double average = total / 3.0;
        String grade;
        String remarks;

        if (average >= 90) {
            grade = "A";
            remarks = "Excellent";
        } else if (average >= 80) {
            grade = "B";
            remarks = "Very Good";
        } else if (average >= 70) {
            grade = "C";
            remarks = "Good";
        } else if (average >= 60) {
            grade = "D";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("Average mark: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
