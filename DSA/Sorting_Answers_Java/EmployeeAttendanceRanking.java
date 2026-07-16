import java.util.*;

public class EmployeeAttendanceRanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] employeeIds = new int[n];
        int[] attendance = new int[n];

        for (int i = 0; i < n; i++) {
            employeeIds[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            attendance[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> {
            if (attendance[b] != attendance[a]) {
                return attendance[b] - attendance[a];
            }
            return employeeIds[a] - employeeIds[b];
        });

        for (int i = 0; i < k; i++) {
            System.out.print(employeeIds[indices[i]] + " ");
        }
    }
}