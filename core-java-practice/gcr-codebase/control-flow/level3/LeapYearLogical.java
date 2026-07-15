import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        input.close();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year");
        } else {
            System.out.println("The program only works for year >= 1582.");
        }
    }
}
