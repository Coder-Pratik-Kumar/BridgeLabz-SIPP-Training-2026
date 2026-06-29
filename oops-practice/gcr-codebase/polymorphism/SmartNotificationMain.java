// Smart Notification System Main - demonstrating polymorphism with dynamic dispatch
public class SmartNotificationMain {

    public static void main(String[] args) {
        System.out.println("\n╔═══════════════════════════════════════════╗");
        System.out.println("║  SMART NOTIFICATION SYSTEM                ║");
        System.out.println("╚═══════════════════════════════════════════╝\n");

        // Create a notification array with multiple notification types
        Notification[] notifications = new Notification[6];

        notifications[0] = new EmailNotification("Raj Kumar",
                "Your order #12345 has been shipped!",
                "raj.kumar@gmail.com");

        notifications[1] = new SMSNotification("Priya Sharma",
                "Your appointment is confirmed for tomorrow at 3 PM",
                "+91-9876543210");

        notifications[2] = new PushNotification("Amit Singh",
                "You have earned 500 loyalty points!",
                "MyMallApp");

        notifications[3] = new EmailNotification("Neha Patel",
                "Welcome to our premium membership!",
                "neha.patel@yahoo.com");

        notifications[4] = new SMSNotification("Vikram Reddy",
                "Your password has been changed successfully",
                "+91-8765432109");

        notifications[5] = new PushNotification("Anjali Verma",
                "Flash sale started! Get 50% discount.",
                "ShopHub");

        // Send all notifications using dynamic method dispatch
        System.out.println("╔═════════════════ SENDING NOTIFICATIONS ════════════════╗\n");
        sendAllNotifications(notifications);

        // Display summary
        displayNotificationSummary(notifications);
    }

    // Method demonstrating polymorphic behavior - dynamic method dispatch
    public static void sendAllNotifications(Notification[] notifications) {
        for (int i = 0; i < notifications.length; i++) {
            System.out.println("Sending notification " + (i + 1) + " of " + notifications.length);
            notifications[i].sendNotification(); // Polymorphic call
        }
    }

    // Display summary of all sent notifications
    public static void displayNotificationSummary(Notification[] notifications) {
        System.out.println("╔══════════════════ NOTIFICATION SUMMARY ═════════════════╗\n");
        System.out.println("Total Notifications Sent: " + notifications.length + "\n");

        int emailCount = 0;
        int smsCount = 0;
        int pushCount = 0;

        System.out.println("Recipients and their notification details:\n");
        for (int i = 0; i < notifications.length; i++) {
            Notification notif = notifications[i];
            String channel = "Unknown";

            // Using instanceof to determine the type
            if (notif instanceof EmailNotification) {
                channel = "EMAIL";
                emailCount++;
                System.out.println((i + 1) + ". " + notif.getRecipientName()
                        + " - " + channel + " - "
                        + ((EmailNotification) notif).getEmail());
            } else if (notif instanceof SMSNotification) {
                channel = "SMS";
                smsCount++;
                System.out.println((i + 1) + ". " + notif.getRecipientName()
                        + " - " + channel + " - "
                        + ((SMSNotification) notif).getPhoneNumber());
            } else if (notif instanceof PushNotification) {
                channel = "PUSH";
                pushCount++;
                System.out.println((i + 1) + ". " + notif.getRecipientName()
                        + " - " + channel + " - "
                        + ((PushNotification) notif).getAppName());
            }
        }

        System.out.println("\n═══════════════════════════════════════");
        System.out.println("Email Notifications: " + emailCount);
        System.out.println("SMS Notifications: " + smsCount);
        System.out.println("Push Notifications: " + pushCount);
        System.out.println("═══════════════════════════════════════\n");
    }
}
