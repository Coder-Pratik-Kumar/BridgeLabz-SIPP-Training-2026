import java.util.Scanner;

public class SpringSeasonChecker {
    public static void main(String[] args) {
        if (args.length >= 2) {
            try {
                int month = Integer.parseInt(args[0]);
                int day = Integer.parseInt(args[1]);
                boolean spring = isSpringSeason(month, day);
                if (spring) {
                    System.out.println("Its a Spring Season");
                } else {
                    System.out.println("Not a Spring Season");
                }
                return;
            } catch (NumberFormatException ignored) {
                // fall back to prompt-based input
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        scanner.close();
    }

    public static boolean isSpringSeason(int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (month == 3) {
            return day >= 20;
        }
        if (month > 3 && month < 6) {
            return true;
        }
        if (month == 6) {
            return day <= 20;
        }
        return false;
    }
}
