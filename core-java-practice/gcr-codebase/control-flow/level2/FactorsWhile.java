import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        input.close();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
