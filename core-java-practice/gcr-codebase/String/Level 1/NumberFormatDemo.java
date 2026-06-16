import java.util.Scanner;
public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to parse as integer: ");
        String text = sc.next();

        System.out.println("Demonstrating NumberFormatException generation:");
        try {
            generateNumberFormatException(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught in main: " + e);
        }

        System.out.println("\nDemonstrating NumberFormatException handling:");
        handleNumberFormatException(text);
        sc.close();
    }

    public static void generateNumberFormatException(String text) {
        System.out.println("Parsed number: " + Integer.parseInt(text));
    }

    public static void handleNumberFormatException(String text) {
        try {
            System.out.println("Parsed number: " + Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled generic RuntimeException: " + e.getClass().getSimpleName());
        }
    }
}
