import java.util.*;

public class DuplicateSessionTokenDetector {

    public static boolean hasDuplicateToken(String[] tokens) {

        HashSet<String> seen = new HashSet<>();

        for (String token : tokens) {

            if (!seen.add(token)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of session tokens: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] tokens = new String[n];

        System.out.println("Enter session tokens:");

        for (int i = 0; i < n; i++) {
            tokens[i] = sc.nextLine();
        }

        if (hasDuplicateToken(tokens)) {
            System.out.println("Duplicate Token Found");
        } else {
            System.out.println("No Duplicate Token Found");
        }

        sc.close();
    }
}