// ElectricCar class - new vehicle type without modifying existing code (Open/Closed Principle)
public class ElectricCar extends Vehicle {
    private double batteryCapacity; // in kWh

    public ElectricCar(String vehicleId, String vehicleName, double batteryCapacity) {
        super(vehicleId, vehicleName);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public double fuelCost(int km) {
        // Cost calculation: Rs. 8 per kWh, 5 km per kWh efficiency
        double efficiency = 5; // km per kWh
        double energyNeeded = km / efficiency;
        double costPerKWh = 8;
        return energyNeeded * costPerKWh;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: ElectricCar, Battery Capacity: " + batteryCapacity + " kWh");
    }
}
