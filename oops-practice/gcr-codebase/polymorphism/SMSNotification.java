// SMS Notification subclass
public class SMSNotification extends Notification {
    private String phoneNumber;

    public SMSNotification(String recipientName, String message, String phoneNumber) {
        super(recipientName, message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("[SMS NOTIFICATION]");
        System.out.println("To: " + phoneNumber);
        System.out.println("Recipient: " + recipientName);
        System.out.println("Message: " + message);
        System.out.println("Timestamp: " + java.time.LocalDateTime.now());
        System.out.println("Status: ✓ SMS delivered");
        System.out.println("═══════════════════════════════════════\n");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
