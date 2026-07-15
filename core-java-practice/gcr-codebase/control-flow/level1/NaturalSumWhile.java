import java.util.Scanner;

public class NaturalSumWhile {
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
        int whileSum = 0;
        int i = 1;
        while (i <= number) {
            whileSum += i;
            i++;
        }

        System.out.println("Formula sum is " + formulaSum);
        System.out.println("While loop sum is " + whileSum);
        System.out.println("The results are " + (formulaSum == whileSum));
    }
}
