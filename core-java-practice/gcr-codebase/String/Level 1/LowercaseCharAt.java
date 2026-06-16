import java.util.Scanner;
public class LowercaseCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to convert to lowercase: ");
        String text = sc.nextLine();

        String customLower = convertToLowerUsingCharAt(text);
        String builtInLower = text.toLowerCase();
        boolean same = compareUsingCharAt(customLower, builtInLower);

        System.out.println("Custom lowercase: " + customLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("The two lowercase strings are " + (same ? "equal." : "not equal."));
        sc.close();
    }

    public static String convertToLowerUsingCharAt(String text) {
        if (text == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result.append((char) (c + 32));
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
