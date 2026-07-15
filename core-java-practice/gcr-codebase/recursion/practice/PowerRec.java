import java.util.Scanner;

public class PowerRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println(power(x, n));
        scanner.close();
    }

    public static long power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
