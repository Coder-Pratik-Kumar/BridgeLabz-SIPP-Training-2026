public class IllegalArgDemo {
    public static void main(String[] args) {
        String text = "HelloWorld";

        System.out.println("Demonstrating IllegalArgumentException generation:");
        try {
            generateIllegalArgumentException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught in main: " + e);
        }

        System.out.println("\nDemonstrating IllegalArgumentException handling:");
        handleIllegalArgumentException(text);
    }

    public static void generateIllegalArgumentException(String text) {
        System.out.println("Substring result: " + text.substring(5, 2));
    }

    public static void handleIllegalArgumentException(String text) {
        try {
            System.out.println("Substring result: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Handled generic RuntimeException: " + e.getClass().getSimpleName());
        }
    }
}
