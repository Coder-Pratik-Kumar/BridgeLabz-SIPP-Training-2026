import java.util.*;

public class MinimumCoverageWindow {

    public static String minWindowSubstring(String s, String t) {

        if (s.isEmpty() || t.isEmpty())
            return "";

        Map<Character, Integer> need = new HashMap<>();

        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> window = new HashMap<>();

        int required = need.size();
        int formed = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for (int end = 0; end < s.length(); end++) {

            char c = s.charAt(end);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) &&
                window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            while (formed == required) {

                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                char leftChar = s.charAt(start);
                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) &&
                    window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String s = sc.nextLine();

        System.out.print("Enter the target string: ");
        String t = sc.nextLine();

        String result = minWindowSubstring(s, t);

        if (result.isEmpty()) {
            System.out.println("No valid window found.");
        } else {
            System.out.println("Minimum Window: " + result);
        }

        sc.close();
    }
}