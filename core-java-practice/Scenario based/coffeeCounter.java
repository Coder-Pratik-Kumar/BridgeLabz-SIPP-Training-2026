import java.util.*;

class coffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grandTotal = 0;
        final double GST_RATE = 0.05;

        while (true) {
            System.out.println("\n===== RAVI'S CAFE =====");
            System.out.println("1. Espresso ====== 150rs.");
            System.out.println("2. Cappuccino ====== 160rs.");
            System.out.println("3. Latte ====== 170rs.");
            System.out.println("4. Macchiato ====== 180rs.");
            System.out.println("5. Mocha ====== 190");
            System.out.println("6. Exit & Generate Bill");

            System.out.print("Enter the choice: ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("Exit")) {
                break;
            }

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            double itemCost = 0;

            switch (choice.toLowerCase()) {
                case "espresso":
                    itemCost = quantity * 150;
                    break;

                case "cappuccino":
                    itemCost = quantity * 160;
                    break;

                case "latte":
                    itemCost = quantity * 170;
                    break;

                case "macchiato":
                    itemCost = quantity * 180;
                    break;

                case "mocha":
                    itemCost = quantity * 190;
                    break;

                default:
                    System.out.println("Invalid coffee choice!");
                    continue;
            }

            grandTotal += itemCost;

            System.out.println("Added to order: " + itemCost);
            System.out.println("Current Order Total: " + grandTotal);
        }

        double gst = grandTotal * GST_RATE;
        double finalAmount = grandTotal + gst;

        System.out.println("\n========== FINAL BILL ==========");
        System.out.println("Subtotal : " + grandTotal);
        System.out.println("GST (5%): " + gst);
        System.out.println("Total Payable Amount : " + finalAmount);
        System.out.println("Thank you for visiting Ravi's Cafe!");

        sc.close();
    }
}