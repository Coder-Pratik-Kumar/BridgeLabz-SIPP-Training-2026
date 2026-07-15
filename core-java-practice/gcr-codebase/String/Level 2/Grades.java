import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        String[][] results = calculateResults(scores);
        displayScorecard(results);
        sc.close();
    }

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + (int) (Math.random() * 90);
            scores[i][1] = 10 + (int) (Math.random() * 90);
            scores[i][2] = 10 + (int) (Math.random() * 90);
        }
        return scores;
    }

    public static String[][] calculateResults(int[][] scores) {
        String[][] table = new String[scores.length][7];
        for (int i = 0; i < scores.length; i++) {
            int physics = scores[i][0];
            int chemistry = scores[i][1];
            int maths = scores[i][2];
            int total = physics + chemistry + maths;
            double average = total / 3.0;
            double percentage = (total * 100.0) / 300.0;
            table[i][0] = String.valueOf(physics);
            table[i][1] = String.valueOf(chemistry);
            table[i][2] = String.valueOf(maths);
            table[i][3] = String.valueOf(total);
            table[i][4] = String.valueOf(Math.round(average * 100.0) / 100.0);
            table[i][5] = String.valueOf(Math.round(percentage * 100.0) / 100.0);
            table[i][6] = gradeForPercentage(percentage);
        }
        return table;
    }

    public static String gradeForPercentage(double percent) {
        if (percent >= 80) {
            return "A";
        }
        if (percent >= 70) {
            return "B";
        }
        if (percent >= 60) {
            return "C";
        }
        if (percent >= 50) {
            return "D";
        }
        if (percent >= 40) {
            return "E";
        }
        return "R";
    }

    public static void displayScorecard(String[][] table) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-5s%n", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-5s%n",
                    row[0], row[1], row[2], row[3], row[4], row[5], row[6]);
        }
    }
}
