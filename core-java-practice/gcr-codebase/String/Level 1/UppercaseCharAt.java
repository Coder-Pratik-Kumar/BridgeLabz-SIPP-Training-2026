import java.util.Scanner;
public class UppercaseCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to convert to uppercase: ");
        String text = sc.nextLine();

        String customUpper = convertToUpperUsingCharAt(text);
        String builtInUpper = text.toUpperCase();
        boolean same = compareUsingCharAt(customUpper, builtInUpper);

        System.out.println("Custom uppercase: " + customUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("The two uppercase strings are " + (same ? "equal." : "not equal."));
        sc.close();
    }

    public static String convertToUpperUsingCharAt(String text) {
        if (text == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char) (c - 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean compareUsingCharAt(String a, String b) {
        if (a == null || b == null) {
            return a == b;
        }
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
