import java.util.Scanner;
public class IndexOutDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("Demonstrating StringIndexOutOfBoundsException generation:");
        try {
            generateStringIndexOutOfBounds(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught in main: " + e);
        }

        System.out.println("\nDemonstrating StringIndexOutOfBoundsException handling:");
        handleStringIndexOutOfBounds(text);
        sc.close();
    }

    public static void generateStringIndexOutOfBounds(String text) {
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    public static void handleStringIndexOutOfBounds(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
