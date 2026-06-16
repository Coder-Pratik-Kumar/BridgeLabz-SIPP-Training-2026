import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean logic1 = isPalindromeIterative(text);
        boolean logic2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean logic3 = isPalindromeWithReverse(text);

        System.out.println("Logic 1 (iterative): " + logic1);
        System.out.println("Logic 2 (recursive): " + logic2);
        System.out.println("Logic 3 (reverse): " + logic3);
        sc.close();
    }

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeWithReverse(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseChars(text);
        if (original.length != reversed.length) {
            return false;
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseChars(String text) {
        int len = text.length();
        char[] result = new char[len];
        for (int i = 0; i < len; i++) {
            result[i] = text.charAt(len - 1 - i);
        }
        return result;
    }
}
