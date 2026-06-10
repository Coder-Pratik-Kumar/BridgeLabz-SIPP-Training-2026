import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        if (number <= 1) {
            System.out.println("The greatest factor beside itself is 1");
            return;
        }

        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("The greatest factor beside itself is " + greatestFactor);
    }
}
