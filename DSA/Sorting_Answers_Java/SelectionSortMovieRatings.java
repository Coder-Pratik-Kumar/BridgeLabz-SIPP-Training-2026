import java.util.*;

public class SelectionSortMovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] ratings = new int[n];

        for (int i = 0; i < n; i++) {
            ratings[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (ratings[j] < ratings[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = ratings[i];
            ratings[i] = ratings[minIndex];
            ratings[minIndex] = temp;
        }

        System.out.println(Arrays.toString(ratings));
    }
}