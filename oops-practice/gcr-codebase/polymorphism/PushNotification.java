// Push Notification subclass
public class PushNotification extends Notification {
    private String appName;

    public PushNotification(String recipientName, String message, String appName) {
        super(recipientName, message);
        this.appName = appName;
    }

    @Override
    public void sendNotification() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("[PUSH NOTIFICATION]");
        System.out.println("App: " + appName);
        System.out.println("User: " + recipientName);
        System.out.println("Title: Alert");
        System.out.println("Message: " + message);
        System.out.println("Status: ✓ Notification pushed to device");
        System.out.println("═══════════════════════════════════════\n");
    }

    public String getAppName() {
        return appName;
    }
}
