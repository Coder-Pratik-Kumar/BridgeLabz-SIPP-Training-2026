public class Level_InstanceClassMain {
    public static void main(String[] args) {
        // Product examples
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Mouse", 25.0);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();

        // Course examples
        Course c1 = new Course("Java Programming", 40, 299.99);
        Course c2 = new Course("Data Structures", 30, 199.99);
        c1.displayCourseDetails();
        Course.updateInstituteName("Tech Academy");
        c2.displayCourseDetails();

        // Vehicle examples
        Vehicle v1 = new Vehicle("Ivy", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(150.0);
        Vehicle v2 = new Vehicle("Jack", "Motorcycle");
        v2.displayVehicleDetails();
    }
}
