
public class SalaryBonus {
    public static void main(String[] args) {
        double[][] staff = createStaffData(10);
        double[][] bonusData = calculateBonus(staff);
        displaySalaryTable(staff, bonusData);
    }

    public static double[][] createStaffData(int size) {
        double[][] data = new double[size][2];
        for (int i = 0; i < size; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] staff) {
        double[][] result = new double[staff.length][2];
        for (int i = 0; i < staff.length; i++) {
            double salary = staff[i][0];
            double service = staff[i][1];
            double rate = service > 5 ? 0.05 : 0.02;
            double bonus = salary * rate;
            result[i][0] = bonus;
            result[i][1] = salary + bonus;
        }
        return result;
    }

    public static void displaySalaryTable(double[][] staff, double[][] bonusData) {
        double sumOld = 0;
        double sumNew = 0;
        double sumBonus = 0;
        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < staff.length; i++) {
            double oldSalary = staff[i][0];
            double years = staff[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];
            sumOld += oldSalary;
            sumBonus += bonus;
            sumNew += newSalary;
            System.out.printf("%d\t%.0f\t\t%.0f\t\t%.2f\t%.2f%n", i + 1,
                    oldSalary, years, bonus, newSalary);
        }
        System.out.println("------------------------------------------------");
        System.out.printf("Total\t%.0f\t\t--\t\t%.2f\t%.2f%n", sumOld, sumBonus, sumNew);
    }
}
