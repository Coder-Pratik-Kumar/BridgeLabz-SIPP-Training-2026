import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine();
        permute(input.toCharArray(), 0);
        scanner.close();
    }

    private static void permute(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permute(chars, index + 1);
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
