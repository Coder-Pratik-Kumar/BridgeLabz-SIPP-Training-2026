import java.util.Scanner;

public class CPUSpikeDetector {

    public static int maxSubarrayOfSizeK(int[] cpuLoad, int k) {

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;

        for (int end = 0; end < cpuLoad.length; end++) {

            windowSum += cpuLoad[end];

            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= cpuLoad[start];
                start++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of CPU readings: ");
        int n = sc.nextInt();

        int[] cpuLoad = new int[n];

        System.out.println("Enter CPU readings:");

        for (int i = 0; i < n; i++) {
            cpuLoad[i] = sc.nextInt();
        }

        System.out.print("Enter window size (k): ");
        int k = sc.nextInt();

        int maxSum = maxSubarrayOfSizeK(cpuLoad, k);

        System.out.println("Maximum CPU Load: " + maxSum);

        sc.close();
    }
}