// Superclass for transport company fleet management
public abstract class Vehicle {
    protected String vehicleId;
    protected String vehicleName;

    public Vehicle(String vehicleId, String vehicleName) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
    }

    // Abstract method to be overridden by subclasses
    public abstract double fuelCost(int km);

    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Name: " + vehicleName);
    }
}
