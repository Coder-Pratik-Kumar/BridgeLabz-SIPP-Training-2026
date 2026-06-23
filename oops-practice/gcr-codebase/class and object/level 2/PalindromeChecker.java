public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleaned = text.replaceAll("\\W", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleaned);
        return cleaned.equals(sb.reverse().toString());
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Is palindrome: " + isPalindrome());
        System.out.println();
    }
}
