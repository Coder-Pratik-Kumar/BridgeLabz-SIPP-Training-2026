public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void add(int qty) {
        if (qty > 0) quantity += qty;
    }

    public void remove(int qty) {
        if (qty > 0) {
            quantity -= qty;
            if (quantity < 0) quantity = 0;
        }
    }

    public double totalCost() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Cart Item:");
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + totalCost());
        System.out.println();
    }
}
