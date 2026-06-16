import java.util.Scanner;
public class CharFreqNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] result = frequencyUsingNestedLoops(text);
        System.out.printf("%-10s %-10s%n", "Char", "Freq");
        for (String row : result) {
            String[] parts = row.split(":");
            System.out.printf("%-10s %-10s%n", parts[0], parts[1]);
        }
        sc.close();
    }

    public static String[] frequencyUsingNestedLoops(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];
        for (int i = 0; i < len; i++) {
            if (chars[i] == 0) {
                continue;
            }
            freq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = 0;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != 0) {
                count++;
            }
        }
        String[] result = new String[count];
        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != 0) {
                result[idx++] = chars[i] + ":" + freq[i];
            }
        }
        return result;
    }
}
