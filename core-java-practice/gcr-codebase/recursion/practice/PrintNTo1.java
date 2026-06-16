import java.util.Scanner;

public class PrintNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        printNTo1(n);
        System.out.println();
        scanner.close();
    }

    public static void printNTo1(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(n + " ");
        printNTo1(n - 1);
    }
}
