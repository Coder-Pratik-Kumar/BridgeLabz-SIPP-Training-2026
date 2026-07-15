import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.printf("Each child gets %d chocolates, remaining chocolates: %d%n",
                result[1], result[0]);
        scanner.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        if (divisor == 0) {
            return new int[]{number, 0};
        }
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}
