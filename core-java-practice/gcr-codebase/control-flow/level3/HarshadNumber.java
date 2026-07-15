import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        int temp = Math.abs(number);
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }
    }
}
