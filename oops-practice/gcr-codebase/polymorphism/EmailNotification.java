// Email Notification subclass
public class EmailNotification extends Notification {
    private String email;

    public EmailNotification(String recipientName, String message, String email) {
        super(recipientName, message);
        this.email = email;
    }

    @Override
    public void sendNotification() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("[EMAIL NOTIFICATION]");
        System.out.println("To: " + email);
        System.out.println("Recipient: " + recipientName);
        System.out.println("Subject: Important Update");
        System.out.println("Message: " + message);
        System.out.println("Status: ✓ Email sent successfully");
        System.out.println("═══════════════════════════════════════\n");
    }

    public String getEmail() {
        return email;
    }
}
