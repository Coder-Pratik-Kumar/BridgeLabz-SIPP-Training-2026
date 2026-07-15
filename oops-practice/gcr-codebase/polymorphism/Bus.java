// Bus class - calculates fuel cost specifically for buses
public class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String vehicleId, String vehicleName, int passengerCapacity) {
        super(vehicleId, vehicleName);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double fuelCost(int km) {
        // Cost calculation: Rs. 120 per 100 km
        // Buses consume more fuel
        return (km / 100.0) * 120;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Bus, Passenger Capacity: " + passengerCapacity);
    }
}
