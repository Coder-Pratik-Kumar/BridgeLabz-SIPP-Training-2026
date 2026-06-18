import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n to compute the sum of first n natural numbers: ");
        int n = scanner.nextInt();

        int sum = calculateNaturalNumberSum(n);
        System.out.printf("The sum of the first %d natural numbers is %d.%n", n, sum);
        scanner.close();
    }

    public static int calculateNaturalNumberSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
