import java.util.*;

public class MostFrequentErrorCode {

    public static int mostFrequentErrorCode(int[] codes) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        int bestCode = codes[0];
        int bestCount = 0;

        for (int code : codes) {

            int count = freq.getOrDefault(code, 0) + 1;
            freq.put(code, count);

            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }

        return bestCode;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of error codes: ");
        int n = sc.nextInt();

        int[] codes = new int[n];

        System.out.println("Enter error codes:");

        for (int i = 0; i < n; i++) {
            codes[i] = sc.nextInt();
        }

        int result = mostFrequentErrorCode(codes);

        System.out.println("Most Frequent Error Code: " + result);

        sc.close();
    }
}