import java.util.*;

class BookCategory {

    private String category;

    public BookCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return category;
    }
}

class ClothingCategory {

    private String category;

    public ClothingCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return category;
    }
}

class GadgetCategory {

    private String category;

    public GadgetCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return category;
    }
}

class Product<T> {

    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {

        System.out.println("Product : " + name);
        System.out.println("Category: " + category);
        System.out.println("Price   : " + price);
    }
}

class Discount {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {

        double newPrice = product.getPrice() - (product.getPrice() * percentage / 100);

        product.setPrice(newPrice);
    }
}

class ProductCatalog {

    private ArrayList<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void displayCatalog() {

        for (Product<?> p : products) {
            p.display();
            System.out.println();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Product<BookCategory> book =
                new Product<>("Java Programming", 600,
                        new BookCategory("Education"));

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 1200,
                        new ClothingCategory("Men"));

        Product<GadgetCategory> laptop =
                new Product<>("Laptop", 65000,
                        new GadgetCategory("Electronics"));

        Discount.applyDiscount(book, 10);
        Discount.applyDiscount(shirt, 20);
        Discount.applyDiscount(laptop, 5);

        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(laptop);

        System.out.println("===== Product Catalog =====");

        catalog.displayCatalog();
    }
}