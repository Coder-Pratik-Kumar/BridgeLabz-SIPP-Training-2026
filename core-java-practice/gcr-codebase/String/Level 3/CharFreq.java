import java.util.Scanner;
public class CharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[][] table = frequencyTable(text);
        System.out.printf("%-10s %-10s%n", "Char", "Freq");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
        sc.close();
    }

    public static String[][] frequencyTable(String text) {
        int[] freq = new int[256];
        int len = text.length();
        for (int i = 0; i < len; i++) {
            freq[text.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }
        String[][] table = new String[count][2];
        int idx = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                table[idx][0] = String.valueOf((char) i);
                table[idx][1] = String.valueOf(freq[i]);
                idx++;
            }
        }
        return table;
    }
}
