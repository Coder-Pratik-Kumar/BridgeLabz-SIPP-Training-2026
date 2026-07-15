import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int sign = checkNumberSign(number);
        String message;
        if (sign > 0) {
            message = "Positive number";
        } else if (sign < 0) {
            message = "Negative number";
        } else {
            message = "Zero";
        }

        System.out.printf("The number %d is %s (return value: %d).\n", number, message, sign);
        scanner.close();
    }

    public static int checkNumberSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        }
        return 0;
    }
}
