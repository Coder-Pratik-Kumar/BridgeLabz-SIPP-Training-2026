import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = scanner.nextInt();
        move(n, 'A', 'B', 'C');
        scanner.close();
    }

    public static void move(int n, char source, char aux, char dest) {
        if (n == 0) {
            return;
        }
        move(n - 1, source, dest, aux);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        move(n - 1, aux, source, dest);
    }
}
