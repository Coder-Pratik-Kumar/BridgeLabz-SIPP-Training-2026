import java.util.Scanner;
public class UniqueChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] unique = findUniqueChars(text);
        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c);
        }
        System.out.println();
        sc.close();
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

    public static char[] findUniqueChars(String text) {
        int len = getLength(text);
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
}
