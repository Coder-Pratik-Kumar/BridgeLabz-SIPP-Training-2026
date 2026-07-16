import java.util.*;

public class BubbleSortStudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();

        int[] marks = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            marks[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberOfStudents - 1; i++) {
            for (int j = 0; j < numberOfStudents - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(marks));
    }
}