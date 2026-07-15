import java.util.Scanner;

public class ReverseStringRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        System.out.println(reverse(input));
        scanner.close();
    }

    public static String reverse(String text) {
        if (text.isEmpty()) {
            return "";
        }
        return text.charAt(text.length() - 1) + reverse(text.substring(0, text.length() - 1));
    }
}
