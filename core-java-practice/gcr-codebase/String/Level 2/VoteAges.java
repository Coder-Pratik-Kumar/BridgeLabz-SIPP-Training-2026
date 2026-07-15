import java.util.Scanner;
public class VoteAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = randomAges(n);
        String[][] voteTable = buildVoteTable(ages);

        System.out.printf("%-10s %-10s%n", "Age", "Can Vote");
        for (String[] row : voteTable) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
        sc.close();
    }

    public static int[] randomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + (int) (Math.random() * 90);
        }
        return ages;
    }

    public static String[][] buildVoteTable(int[] ages) {
        String[][] table = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            table[i][0] = String.valueOf(ages[i]);
            table[i][1] = String.valueOf(canVote(ages[i]));
        }
        return table;
    }

    public static boolean canVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }
}
