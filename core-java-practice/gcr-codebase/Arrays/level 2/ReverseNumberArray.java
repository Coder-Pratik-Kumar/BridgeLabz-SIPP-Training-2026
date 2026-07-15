import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        long original = number;
        if (number < 0) {
            number = -number;
        }

        int[] digits = new int[20];
        int index = 0;

        while (number != 0) {
            digits[index++] = (int) (number % 10);
            number /= 10;
        }

        if (index == 0) {
            digits[index++] = 0;
        }

        int[] reversed = new int[index];
        for (int i = 0; i < index; i++) {
            reversed[i] = digits[index - 1 - i];
        }

        System.out.println("Digits of " + original + " in reverse order:");
        for (int i = 0; i < index; i++) {
            System.out.print(reversed[i] + (i < index - 1 ? ", " : "\n"));
        }
        scanner.close();
    }
}
