import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (number < 0) {
            number = -number;
        }

        int[] digits = new int[20];
        int index = 0;

        if (number == 0) {
            digits[index++] = 0;
        }

        while (number != 0) {
            digits[index++] = (int) (number % 10);
            number /= 10;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }

        System.out.println("Digit frequencies:");
        for (int digit = 0; digit < frequency.length; digit++) {
            if (frequency[digit] > 0) {
                System.out.println(digit + " appears " + frequency[digit] + " time(s)");
            }
        }
        scanner.close();
    }
}
