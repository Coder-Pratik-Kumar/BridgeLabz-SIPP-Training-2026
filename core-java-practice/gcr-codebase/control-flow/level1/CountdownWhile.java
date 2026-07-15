import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int counter = input.nextInt();
        input.close();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
