import java.util.*;

public class SelectionSortExamScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = scanner.nextInt();
        int[] examScores = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            examScores[i] = scanner.nextInt();
        }

        for (int i = 0; i < examScores.length - 1; i++) {
            int minimumIndex = i;

            for (int j = i + 1; j < examScores.length; j++) {
                if (examScores[j] < examScores[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int temp = examScores[i];
            examScores[i] = examScores[minimumIndex];
            examScores[minimumIndex] = temp;
        }

        System.out.println(Arrays.toString(examScores));
    }
}