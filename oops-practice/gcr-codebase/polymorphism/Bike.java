// Bike class - calculates fuel cost specifically for bikes
public class Bike extends Vehicle {
    private String bikeType; // e.g., "Manual", "Automatic"

    public Bike(String vehicleId, String vehicleName, String bikeType) {
        super(vehicleId, vehicleName);
        this.bikeType = bikeType;
    }

    @Override
    public double fuelCost(int km) {
        // Cost calculation: Rs. 60 per liter with 40 km/l efficiency
        double fuelEfficiency = 40; // km per liter
        double literNeeded = km / fuelEfficiency;
        double costPerLiter = 60;
        return literNeeded * costPerLiter;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Bike, Bike Type: " + bikeType);
    }
}
