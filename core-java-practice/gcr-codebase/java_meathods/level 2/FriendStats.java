import java.util.Scanner;

public class FriendStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = scanner.nextDouble();
        }

        String youngest = findYoungestFriend(names, ages);
        String tallest = findTallestFriend(names, heights);

        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
        scanner.close();
    }

    public static String findYoungestFriend(String[] names, int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return names[minIndex];
    }

    public static String findTallestFriend(String[] names, double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return names[maxIndex];
    }
}
