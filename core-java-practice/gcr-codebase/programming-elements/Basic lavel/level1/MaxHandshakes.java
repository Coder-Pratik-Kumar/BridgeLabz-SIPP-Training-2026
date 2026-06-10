import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        input.close();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.printf("The number of possible handshakes is %d%n", handshakes);
    }
}
