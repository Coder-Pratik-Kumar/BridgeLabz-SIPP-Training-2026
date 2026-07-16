import java.util.*;

public class InsertionSortEmployeeIDs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEmployees = scanner.nextInt();

        int[] employeeIds = new int[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            employeeIds[i] = scanner.nextInt();
        }

        for (int i = 1; i < employeeIds.length; i++) {
            int currentId = employeeIds[i];
            int j = i - 1;

            while (j >= 0 && employeeIds[j] > currentId) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            employeeIds[j + 1] = currentId;
        }

        System.out.println(Arrays.toString(employeeIds));
    }
}