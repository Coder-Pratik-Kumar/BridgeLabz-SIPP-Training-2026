public class Drone {
    public String droneId;
    public double batteryPercentage;
    public static String companyName = "SkyLink Delivery";

    public Drone(String droneId, double batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    public void startDelivery() {
        if (batteryPercentage >= 25) {
            System.out.println("Drone " + droneId + " starting delivery.");
        } else {
            System.out.println("Drone " + droneId + " cannot start delivery: low battery (" + batteryPercentage + "%). ");
        }
    }

    public void displayStatus() {
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery: " + batteryPercentage + "%");
        System.out.println("Company: " + companyName);
        System.out.println();
    }
}
