// Car class - calculates fuel cost specifically for cars
public class Car extends Vehicle {
    private double fuelEfficiency; // km per liter

    public Car(String vehicleId, String vehicleName, double fuelEfficiency) {
        super(vehicleId, vehicleName);
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public double fuelCost(int km) {
        // Cost calculation: Rs. 80 per liter
        double literNeeded = km / fuelEfficiency;
        double costPerLiter = 80;
        return literNeeded * costPerLiter;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Car, Fuel Efficiency: " + fuelEfficiency + " km/l");
    }
}
