import java.util.Scanner;
public class SplitCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] customWords = splitTextIntoWords(text);
        String[] builtInWords = text.trim().isEmpty() ? new String[0] : text.trim().split("\\s+");
        boolean same = compareStringArrays(customWords, builtInWords);

        System.out.println("Custom split words:");
        printStringArray(customWords);
        System.out.println("Built-in split words:");
        printStringArray(builtInWords);
        System.out.println("The word arrays are " + (same ? "equal." : "not equal."));
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

    public static String[] splitTextIntoWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return new String[0];
        }
        int length = getStringLengthWithoutLength(text);
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        int start = -1;
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                if (start == -1) {
                    start = i;
                }
                if (i == length - 1) {
                    words[wordIndex++] = substringUsingCharAt(text, start, i + 1);
                }
            } else {
                if (start != -1) {
                    words[wordIndex++] = substringUsingCharAt(text, start, i);
                    start = -1;
                }
            }
        }
        return words;
    }

    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < end; i++) {
            builder.append(text.charAt(i));
        }
        return builder.toString();
    }

    public static boolean compareStringArrays(String[] a, String[] b) {
        if (a == null || b == null) {
            return a == b;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void printStringArray(String[] array) {
        for (String item : array) {
            System.out.println(item);
        }
    }
}
