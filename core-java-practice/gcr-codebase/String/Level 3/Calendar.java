import java.util.Scanner;
public class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        displayCalendar(month, year);
        sc.close();
    }

    public static String monthName(int month) {
        String[] names = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return names[month - 1];
    }

    public static int daysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int firstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void displayCalendar(int month, int year) {
        System.out.println("\n   " + monthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start = firstDay(month, year);
        int days = daysInMonth(month, year);
        for (int i = 0; i < start; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((start + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
