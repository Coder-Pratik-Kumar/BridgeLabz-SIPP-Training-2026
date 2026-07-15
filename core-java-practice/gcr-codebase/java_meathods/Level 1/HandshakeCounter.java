import java.util.Scanner;

public class HandshakeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();

        int maximumHandshakes = calculateMaximumHandshakes(numberOfStudents);
        System.out.printf("Maximum possible handshakes among %d students is %d\n",
                numberOfStudents, maximumHandshakes);
        scanner.close();
    }

    public static int calculateMaximumHandshakes(int numberOfStudents) {
        return numberOfStudents * (numberOfStudents - 1) / 2;
    }
}
