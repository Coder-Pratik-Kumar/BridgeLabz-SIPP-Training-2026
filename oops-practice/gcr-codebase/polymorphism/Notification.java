// Superclass for Smart Notification System
public abstract class Notification {
    protected String recipientName;
    protected String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    // Abstract method to be overridden by subclasses
    public abstract void sendNotification();

    public String getRecipientName() {
        return recipientName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
