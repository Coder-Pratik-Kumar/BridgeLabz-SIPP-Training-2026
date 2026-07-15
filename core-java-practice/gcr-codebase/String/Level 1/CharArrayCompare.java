import java.util.Scanner;
public class CharArrayCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = sc.next();

        char[] customChars = getCharsWithoutToCharArray(text);
        char[] builtInChars = text.toCharArray();
        boolean same = compareCharArrays(customChars, builtInChars);

        System.out.println("Custom char array: " + String.valueOf(customChars));
        System.out.println("Built-in char array: " + String.valueOf(builtInChars));
        System.out.println("Arrays are " + (same ? "equal." : "not equal."));
        sc.close();
    }

    public static char[] getCharsWithoutToCharArray(String text) {
        if (text == null) {
            return null;
        }
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a == null || b == null) {
            return a == b;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
