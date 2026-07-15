import java.util.Scanner;

public class EmployeesBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonusAmount = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double inputSalary = scanner.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            double inputYears = scanner.nextDouble();

            if (inputSalary <= 0 || inputYears < 0) {
                System.out.println("Invalid input. Please enter positive salary and non-negative years of service.");
                i--; 
                continue;
            }

            salary[i] = inputSalary;
            yearsOfService[i] = inputYears;
        }

        for (int i = 0; i < 10; i++) {
            double rate = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonusAmount[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonusAmount[i];
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
        scanner.close();
    }
}
