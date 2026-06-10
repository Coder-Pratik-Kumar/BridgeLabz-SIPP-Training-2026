import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        input.close();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
