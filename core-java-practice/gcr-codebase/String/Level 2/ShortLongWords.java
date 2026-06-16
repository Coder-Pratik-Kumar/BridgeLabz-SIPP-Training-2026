import java.util.Scanner;
public class ShortLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitTextIntoWords(text);
        String[][] table = wordsToLengthTable(words);
        int[] minMax = findShortestAndLongest(table);

        System.out.printf("%-20s %-10s%n", "Word", "Length");
        for (String[] row : table) {
            System.out.printf("%-20s %-10s%n", row[0], row[1]);
        }

        if (words.length > 0) {
            System.out.println("Shortest word: " + table[minMax[0]][0] + " (" + table[minMax[0]][1] + ")");
            System.out.println("Longest word: " + table[minMax[1]][0] + " (" + table[minMax[1]][1] + ")");
        } else {
            System.out.println("No words found.");
        }
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

    public static String[][] wordsToLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getStringLengthWithoutLength(words[i]));
        }
        return table;
    }

    public static int[] findShortestAndLongest(String[][] table) {
        if (table.length == 0) {
            return new int[]{-1, -1};
        }
        int shortest = 0;
        int longest = 0;
        for (int i = 1; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            int shortestLength = Integer.parseInt(table[shortest][1]);
            int longestLength = Integer.parseInt(table[longest][1]);
            if (length < shortestLength) {
                shortest = i;
            }
            if (length > longestLength) {
                longest = i;
            }
        }
        return new int[]{shortest, longest};
    }

    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < end; i++) {
            builder.append(text.charAt(i));
        }
        return builder.toString();
    }
}
