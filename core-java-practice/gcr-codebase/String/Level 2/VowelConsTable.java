import java.util.Scanner;
public class VowelConsTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] table = analyzeCharacterTypes(text);
        displayTable(table);
        sc.close();
    }

    public static String characterType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] analyzeCharacterTypes(String text) {
        int len = getLength(text);
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = characterType(c);
        }
        return result;
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

    public static void displayTable(String[][] rows) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        for (String[] row : rows) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }
}
