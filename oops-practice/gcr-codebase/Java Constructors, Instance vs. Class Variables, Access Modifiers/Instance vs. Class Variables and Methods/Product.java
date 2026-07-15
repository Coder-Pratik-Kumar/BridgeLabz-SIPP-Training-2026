public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Details:");
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
