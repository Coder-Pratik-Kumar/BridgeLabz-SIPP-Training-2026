import java.util.Scanner;
public class CompareChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String first = sc.next();
        System.out.print("Enter second string: ");
        String second = sc.next();

        boolean charAtResult = compareUsingCharAt(first, second);
        boolean equalsResult = first.equals(second);

        System.out.println("Result using charAt(): " + charAtResult);
        System.out.println("Result using equals(): " + equalsResult);
        System.out.println("The results are " + (charAtResult == equalsResult ? "the same." : "different."));
        sc.close();
    }

    public static boolean compareUsingCharAt(String a, String b) {
        if (a == null || b == null) {
            return a == b;
        }
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
