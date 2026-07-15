import java.util.Scanner;

public class GreatestFactorWhile {
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
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("The greatest factor beside itself is " + greatestFactor);
    }
}
