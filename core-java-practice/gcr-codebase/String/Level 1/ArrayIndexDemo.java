import java.util.Scanner;
public class ArrayIndexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names will you enter? ");
        int count = sc.nextInt();
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        System.out.println("Demonstrating ArrayIndexOutOfBoundsException generation:");
        try {
            generateArrayIndexOutOfBounds(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught in main: " + e);
        }

        System.out.println("\nDemonstrating ArrayIndexOutOfBoundsException handling:");
        handleArrayIndexOutOfBounds(names);
        sc.close();
    }

    public static void generateArrayIndexOutOfBounds(String[] names) {
        System.out.println("Accessed name: " + names[names.length]);
    }

    public static void handleArrayIndexOutOfBounds(String[] names) {
        try {
            System.out.println("Accessed name: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled generic RuntimeException: " + e.getClass().getSimpleName());
        }
    }
}
