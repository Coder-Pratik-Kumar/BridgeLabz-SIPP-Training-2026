import java.util.Scanner;

public class NaturalSumRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Please enter a natural number greater than zero.");
            scanner.close();
            return;
        }

        long recursiveSum = sumRecursive(n);
        long formulaSum = sumFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Both results match: " + (recursiveSum == formulaSum));
        scanner.close();
    }

    public static long sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    public static long sumFormula(int n) {
        return (long) n * (n + 1) / 2;
    }
}
