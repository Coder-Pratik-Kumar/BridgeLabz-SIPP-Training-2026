public class Level1PracticeMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 55000.0);
        emp.displayDetails();

        Circle c = new Circle(3.5);
        c.display();

        Item item = new Item("I001", "Notebook", 12.5);
        item.displayDetails();
        System.out.println("Total cost for 4: " + item.totalCost(4));
        System.out.println();

        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S10", 599.99);
        phone.displayDetails();
    }
}
