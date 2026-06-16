public class NullPointerDemo {
    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException generation:");
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught in main: " + e);
        }

        System.out.println("\nDemonstrating NullPointerException handling:");
        handleNullPointerException();
    }

    public static void generateNullPointerException() {
        String text = null;
        System.out.println("Text length: " + text.length());
    }

    public static void handleNullPointerException() {
        try {
            String text = null;
            System.out.println("Text length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }
}
