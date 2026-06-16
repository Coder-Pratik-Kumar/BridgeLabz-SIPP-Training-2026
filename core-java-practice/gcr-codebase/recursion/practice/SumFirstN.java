import java.util.Scanner;

public class SumFirstN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        System.out.println(sumFirstN(n));
        scanner.close();
    }

    public static int sumFirstN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumFirstN(n - 1);
    }
}
