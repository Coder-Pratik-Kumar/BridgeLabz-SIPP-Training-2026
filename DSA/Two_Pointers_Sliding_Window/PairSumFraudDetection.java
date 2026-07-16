import java.util.Scanner;

public class PairSumFraudDetection {

    public static int[] findPairSum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted transaction amounts:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int[] ans = findPairSum(arr, target);

        if (ans[0] == -1) {
            System.out.println("Pair Not Found");
        } else {
            System.out.println("Pair Found");
            System.out.println("Indices : " + ans[0] + " " + ans[1]);
            System.out.println("Values : " + arr[ans[0]] + " " + arr[ans[1]]);
        }

        sc.close();
    }
}