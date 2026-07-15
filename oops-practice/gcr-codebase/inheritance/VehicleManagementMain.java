public class VehicleManagementMain {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle = new ElectricVehicle("Model E", 180, 85);
        PetrolVehicle petrolVehicle = new PetrolVehicle("Model P", 200, 60);

        System.out.println("=== Vehicle Management ===");
        electricVehicle.showDetails();
        electricVehicle.charge();
        System.out.println();

        petrolVehicle.showDetails();
        petrolVehicle.refuel();
    }
}

class Vehicle {
    private String model;
    private int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void showDetails() {
        System.out.println("Vehicle{model='" + model + "', maxSpeed=" + maxSpeed + " km/h}");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("ElectricVehicle is charging. Battery capacity: " + batteryCapacity + " kWh.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity;

    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println("PetrolVehicle is refueling. Fuel capacity: " + fuelCapacity + " liters.");
    }
}
