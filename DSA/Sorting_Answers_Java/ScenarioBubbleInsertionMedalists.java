import java.util.*;

public class ScenarioBubbleInsertionMedalists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        int[] bubbleArray = scores.clone();
        int totalSwaps = 0;
        boolean alreadySorted = true;

        for (int pass = 0; pass < bubbleArray.length - 1; pass++) {
            boolean swapped = false;

            for (int j = 0; j < bubbleArray.length - 1 - pass; j++) {
                if (bubbleArray[j] > bubbleArray[j + 1]) {
                    int temp = bubbleArray[j];
                    bubbleArray[j] = bubbleArray[j + 1];
                    bubbleArray[j + 1] = temp;
                    totalSwaps++;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (pass + 1) + ": " + Arrays.toString(bubbleArray));

            if (!swapped) {
                break;
            }
        }

        alreadySorted = (totalSwaps == 0);

        int[] insertionArray = scores.clone();
        for (int i = 1; i < insertionArray.length; i++) {
            int key = insertionArray[i];
            int j = i - 1;

            while (j >= 0 && insertionArray[j] > key) {
                insertionArray[j + 1] = insertionArray[j];
                j--;
            }
            insertionArray[j + 1] = key;
        }

        System.out.println("Total Bubble Sort Swaps: " + totalSwaps);
        System.out.println("Already Sorted: " + alreadySorted);
        System.out.println("Insertion Sort Result: " + Arrays.toString(insertionArray));

        System.out.print("Top 3 Medalists: ");
        for (int i = insertionArray.length - 1; i >= Math.max(0, insertionArray.length - 3); i--) {
            System.out.print(insertionArray[i] + " ");
        }
    }
}