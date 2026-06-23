public class Vehicle {
    public String vehicleNumber;
    public String ownerName;
    public String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber + ", Owner: " + ownerName + ", Type: " + vehicleType);
    }

    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null && "car".equalsIgnoreCase(vehicle.vehicleType)) {
                vehicle.displayInfo();
            }
        }
        System.out.println();
    }

    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (Vehicle vehicle : vehicles) {
            if (vehicle != null && "bike".equalsIgnoreCase(vehicle.vehicleType)) {
                vehicle.displayInfo();
            }
        }
        System.out.println();
    }
}
