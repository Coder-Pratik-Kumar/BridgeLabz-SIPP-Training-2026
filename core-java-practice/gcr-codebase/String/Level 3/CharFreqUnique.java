import java.util.Scanner;
public class CharFreqUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] table = uniqueFrequencyTable(text);
        System.out.printf("%-10s %-10s%n", "Char", "Freq");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
        sc.close();
    }

    public static char[] uniqueChars(String text) {
        int len = text.length();
        char[] temp = new char[len];
        int idx = 0;
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[idx++] = c;
            }
        }
        char[] result = new char[idx];
        for (int i = 0; i < idx; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static String[][] uniqueFrequencyTable(String text) {
        int[] freq = new int[256];
        int len = text.length();
        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }
        char[] unique = uniqueChars(text);
        String[][] table = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            table[i][0] = String.valueOf(unique[i]);
            table[i][1] = String.valueOf(freq[unique[i]]);
        }
        return table;
    }
}
