import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        generate(arr);
        scanner.close();
    }

    public static void generate(int[] arr) {
        generate(arr, 0, new ArrayList<>());
    }

    private static void generate(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        generate(arr, index + 1, current);
        current.add(arr[index]);
        generate(arr, index + 1, current);
        current.remove(current.size() - 1);
    }
}
