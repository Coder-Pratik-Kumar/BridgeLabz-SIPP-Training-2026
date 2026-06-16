import java.util.Scanner;

public class StoreValuesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();
            if (input <= 0) {
                break;
            }
            if (index == values.length) {
                System.out.println("Array is full. Stopping input.");
                break;
            }
            values[index] = input;
            index++;
        }

        System.out.println("Values entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
            total += values[i];
        }

        System.out.println("Sum of all numbers: " + total);
        scanner.close();
    }
}
