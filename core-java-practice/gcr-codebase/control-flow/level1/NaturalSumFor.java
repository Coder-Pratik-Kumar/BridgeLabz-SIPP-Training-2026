import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        input.close();

        if (number < 0) {
            System.out.println("The number " + number + " is not a natural number");
            return;
        }

        int formulaSum = number * (number + 1) / 2;
        int forSum = 0;
        for (int i = 1; i <= number; i++) {
            forSum += i;
        }

        System.out.println("Formula sum is " + formulaSum);
        System.out.println("For loop sum is " + forSum);
        System.out.println("The results are " + (formulaSum == forSum));
    }
}
