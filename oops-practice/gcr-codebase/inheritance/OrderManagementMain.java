import java.time.LocalDate;

public class OrderManagementMain {
    public static void main(String[] args) {
        Order order = new Order("ORD-1001", LocalDate.of(2026, 6, 24));
        ShippedOrder shippedOrder = new ShippedOrder("ORD-1002", LocalDate.of(2026, 6, 23), "TRACK-7733");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD-1003", LocalDate.of(2026, 6, 20), "TRACK-5521", LocalDate.of(2026, 6, 23));

        System.out.println("=== Order Management ===");
        printOrderStatus(order);
        printOrderStatus(shippedOrder);
        printOrderStatus(deliveredOrder);
    }

    private static void printOrderStatus(Order order) {
        System.out.println(order);
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println();
    }
}

class Order {
    private String orderId;
    private LocalDate orderDate;

    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed";
    }

    @Override
    public String toString() {
        return "Order{" + "orderId='" + orderId + "', orderDate=" + orderDate + "}";
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, LocalDate orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Shipped (tracking " + trackingNumber + ")";
    }

    @Override
    public String toString() {
        return "ShippedOrder{" + "trackingNumber='" + trackingNumber + "', " + super.toString() + '}';
    }
}

class DeliveredOrder extends ShippedOrder {
    private LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }

    @Override
    public String toString() {
        return "DeliveredOrder{" + "deliveryDate=" + deliveryDate + ", " + super.toString() + '}';
    }
}
