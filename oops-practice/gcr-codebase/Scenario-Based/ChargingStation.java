public class ChargingStation {
    public static int totalStations;
    public static double electricityRate = 7.50;

    public String stationId;
    public double unitsConsumed;

    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units consumed: " + unitsConsumed);
        System.out.println("Electricity rate: " + electricityRate);
        System.out.println("Bill: " + calculateBill());
        System.out.println();
    }
}
