import java.util.*;

class mayaBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== BMI CALCULATOR =====");
            System.out.println("1. Calculate BMI");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();

            System.out.print("Enter your weight in kg: ");
            double weight = sc.nextDouble();

            System.out.print("Enter your height in meters: ");
            double height = sc.nextDouble();

            double bmi = weight / (height * height);
            System.out.printf("Your BMI is: %.2f\n", bmi);

            if (bmi < 18.5) {
                System.out.println("You are underweight.");
            } else if (bmi < 25) {
                System.out.println("You have a normal weight.");
            } else if (bmi < 30) {
                System.out.println("You are overweight.");
            } else {
                System.out.println("You are obese.");
            }
            if (choice.equals("2")) {
                System.out.println("Exiting BMI Calculator. Stay healthy!");
                break;
            }
        }
    }
}