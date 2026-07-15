import java.util.Scanner;

public class PowerOfNumberFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = input.nextInt();
        System.out.print("Enter power: ");
        int power = input.nextInt();
        input.close();

        if (power < 0) {
            System.out.println("Please enter a non-negative power.");
            return;
        }

        long result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println("The result is " + result);
    }
}
