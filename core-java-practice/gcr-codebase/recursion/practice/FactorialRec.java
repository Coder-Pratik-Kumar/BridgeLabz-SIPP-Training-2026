import java.util.Scanner;

public class FactorialRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        System.out.println(factorial(n));
        scanner.close();
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
