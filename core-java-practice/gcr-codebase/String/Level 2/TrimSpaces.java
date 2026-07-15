import java.util.Scanner;
public class TrimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with leading/trailing spaces: ");
        String text = sc.nextLine();

        int[] bounds = findTrimIndexes(text);
        String customTrim = substring(text, bounds[0], bounds[1]);
        String builtInTrim = text.trim();
        boolean same = compareStrings(customTrim, builtInTrim);

        System.out.println("Custom trim result: '" + customTrim + "'");
        System.out.println("Built-in trim result: '" + builtInTrim + "'");
        System.out.println("Results are " + (same ? "the same." : "different."));
        sc.close();
    }

    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = getLength(text);
        while (start < end && text.charAt(start) == ' ') {
            start++;
        }
        while (end > start && text.charAt(end - 1) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static int getLength(String text) {
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

    public static String substring(String text, int start, int end) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < end; i++) {
            builder.append(text.charAt(i));
        }
        return builder.toString();
    }

    public static boolean compareStrings(String a, String b) {
        if (a == null || b == null) {
            return a == b;
        }
        if (getLength(a) != getLength(b)) {
            return false;
        }
        for (int i = 0; i < getLength(a); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
