import java.util.Scanner;
public class SubstrCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String customSubstring = substringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);
        boolean same = compareUsingCharAt(customSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Comparison result: " + same);
        sc.close();
    }

    public static String substringUsingCharAt(String text, int start, int end) {
        if (text == null) {
            return null;
        }
        if (start < 0 || end > text.length() || start > end) {
            throw new StringIndexOutOfBoundsException("Invalid start or end index");
        }
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
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
