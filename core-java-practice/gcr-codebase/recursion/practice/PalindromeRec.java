import java.util.Scanner;

public class PalindromeRec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        System.out.println(isPalindrome(input) ? "Palindrome" : "Not Palindrome");
        scanner.close();
    }

    public static boolean isPalindrome(String text) {
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindrome(text.substring(1, text.length() - 1));
    }
}
