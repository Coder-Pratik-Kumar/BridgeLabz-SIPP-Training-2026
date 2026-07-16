import java.util.*;

public class BubbleSortProductPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] prices = new long[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextLong();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (prices[j] > prices[j + 1]) {
                    long temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(prices));
    }
}