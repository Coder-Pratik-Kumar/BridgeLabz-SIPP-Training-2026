import java.util.Scanner;

public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int number = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.printf("Quotient: %d, Remainder: %d%n", result[1], result[0]);
        scanner.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}
