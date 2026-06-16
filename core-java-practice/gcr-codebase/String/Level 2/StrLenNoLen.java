import java.util.Scanner;
public class StrLenNoLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLength = getStringLengthWithoutLength(text);
        int builtInLength = text.length();

        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);
        System.out.println("The lengths are " + (customLength == builtInLength ? "the same." : "different."));
        sc.close();
    }

    public static int getStringLengthWithoutLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}
