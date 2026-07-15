package Q2;
import java.util.*;

abstract class WarehouseItem {

    protected String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public abstract void display();
}

class Electronics extends WarehouseItem {

    public Electronics(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Electronics: " + name);
    }
}

class Groceries extends WarehouseItem {

    public Groceries(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Groceries: " + name);
    }
}

class Furniture extends WarehouseItem {

    public Furniture(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("Furniture: " + name);
    }
}

class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class WarehouseUtility {

    public static void displayItems(List<? extends WarehouseItem> items) {

        for (WarehouseItem item : items) {
            item.display();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Storage<Electronics> electronicStorage = new Storage<>();
        electronicStorage.addItem(new Electronics("Laptop"));
        electronicStorage.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Electronics:");
        WarehouseUtility.displayItems(electronicStorage.getItems());

        System.out.println();

        System.out.println("Groceries:");
        WarehouseUtility.displayItems(groceryStorage.getItems());

        System.out.println();

        System.out.println("Furniture:");
        WarehouseUtility.displayItems(furnitureStorage.getItems());
    }
}

