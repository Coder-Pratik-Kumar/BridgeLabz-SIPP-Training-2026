// Transport Fleet Management Main - demonstrating polymorphism with instanceof
public class TransportFleetMain {

    public static void main(String[] args) {
        System.out.println("===== TRANSPORT COMPANY FLEET MANAGEMENT =====\n");

        // Create a fleet of different vehicles
        Vehicle[] fleet = new Vehicle[5];
        fleet[0] = new Car("CAR001", "Toyota Fortuner", 12.5);
        fleet[1] = new Bus("BUS001", "Volvo Coach", 50);
        fleet[2] = new Bike("BIKE001", "Hero Splendor", "Manual");
        fleet[3] = new Car("CAR002", "Mahindra XUV700", 11.0);
        fleet[4] = new ElectricCar("ECAR001", "Tesla Model 3", 50.0); // New type

        // Calculate fuel cost for each vehicle
        int testDistance = 100; // 100 km
        double totalCost = 0;

        System.out.println("Fleet Details:\n");
        for (Vehicle vehicle : fleet) {
            vehicle.displayDetails();

            // Using instanceof before casting (not necessary here, but demonstrates the
            // pattern)
            if (vehicle instanceof Car && !(vehicle instanceof ElectricCar)) {
                System.out.println("Category: Fuel-powered Car");
            } else if (vehicle instanceof Bus) {
                System.out.println("Category: Public Transport");
            } else if (vehicle instanceof Bike) {
                System.out.println("Category: Two-wheeler");
            } else if (vehicle instanceof ElectricCar) {
                System.out.println("Category: Electric Vehicle");
            }

            double cost = vehicle.fuelCost(testDistance);
            System.out.println("Fuel Cost for " + testDistance + " km: Rs. " + String.format("%.2f", cost));
            totalCost += cost;
            System.out.println();
        }

        System.out.println("===== FLEET SUMMARY =====");
        System.out.println("Total vehicles: " + fleet.length);
        System.out.println("Total fuel cost for " + testDistance + " km: Rs. " + String.format("%.2f", totalCost));

        // Demonstrate polymorphic behavior
        System.out.println("\n===== POLYMORPHIC FUEL COST CALCULATION =====");
        printFuelCostForAllVehicles(fleet, 250);
    }

    // Method demonstrating polymorphic behavior
    public static void printFuelCostForAllVehicles(Vehicle[] vehicles, int km) {
        System.out.println("\nFuel Cost for " + km + " km journey:\n");
        for (Vehicle vehicle : vehicles) {
            double cost = vehicle.fuelCost(km);
            System.out.println(vehicle.getVehicleName() + " (" + vehicle.getVehicleId() + "): Rs. "
                    + String.format("%.2f", cost));
        }
    }
}
