import java.util.Scanner;

public class CalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.printf("%s %d%n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        scanner.close();
    }

    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        if (month < 1 || month > 12) {
            return "Unknown";
        }
        return months[month - 1];
    }

    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        if (month < 1 || month > 12) {
            return 0;
        }
        return days[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfMonth(int month, int year) {
        int m = month;
        int y = year;
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int K = y % 100;
        int J = y / 100;
        int h = (1 + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + 5 * J) % 7;
        return (h + 6) % 7;
    }
}
