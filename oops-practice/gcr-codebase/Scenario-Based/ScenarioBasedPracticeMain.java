public class ScenarioBasedPracticeMain {
    public static void main(String[] args) {
        System.out.println("--- Scenario 1: BankAccount ---");
        BankAccount bank1 = new BankAccount("A001", "Alice", 1000.00);
        BankAccount bank2 = new BankAccount("A002", "Bob", 500.00);
        BankAccount bank3 = new BankAccount("A003", "Carol", 1200.00);

        bank1.deposit(250.00);
        bank1.withdraw(100.00);
        bank1.withdraw(900.00);
        bank1.deposit(125.00);
        bank1.withdraw(450.00);

        bank2.deposit(100.00);
        bank2.withdraw(650.00);
        bank2.withdraw(50.00);
        bank2.deposit(200.00);
        bank2.withdraw(100.00);

        bank3.withdraw(300.00);
        bank3.withdraw(100.00);
        bank3.deposit(400.00);
        bank3.withdraw(1300.00);
        bank3.deposit(150.00);

        System.out.println(bank1.getStatement());
        System.out.println(bank2.getStatement());
        System.out.println(bank3.getStatement());
        System.out.println("Total accounts created: " + BankAccount.totalAccounts);
        System.out.println();

        System.out.println("--- Scenario 2: Drone Delivery System ---");
        Drone drone1 = new Drone("D001", 80.0);
        Drone drone2 = new Drone("D002", 22.0);
        Drone drone3 = new Drone("D003", 55.0);

        drone1.startDelivery();
        drone2.startDelivery();
        drone3.startDelivery();
        System.out.println();

        drone1.displayStatus();
        drone2.displayStatus();
        drone3.displayStatus();
        System.out.println("All drones company name: " + Drone.companyName);
        System.out.println();

        System.out.println("--- Scenario 3: Electric Vehicle Charging Network ---");
        ChargingStation station1 = new ChargingStation("S001", 45.0);
        ChargingStation station2 = new ChargingStation("S002", 32.5);
        ChargingStation station3 = new ChargingStation("S003", 70.0);
        ChargingStation station4 = new ChargingStation("S004", 18.2);
        ChargingStation station5 = new ChargingStation("S005", 56.7);

        station1.displayStationDetails();
        station2.displayStationDetails();
        station3.displayStationDetails();
        station4.displayStationDetails();
        station5.displayStationDetails();

        System.out.println("Total stations: " + ChargingStation.totalStations);
        System.out.println("Updating electricity rate to 8.20 for all stations...\n");
        ChargingStation.electricityRate = 8.20;

        station1.displayStationDetails();
        station2.displayStationDetails();
        station3.displayStationDetails();
        station4.displayStationDetails();
        station5.displayStationDetails();

        System.out.println("--- Scenario 4: Smart Parking Management ---");
        Vehicle[] vehicles = new Vehicle[10];
        vehicles[0] = new Vehicle("KA01AB1234", "David", "Car");
        vehicles[1] = new Vehicle("KA02CD5678", "Emma", "Bike");
        vehicles[2] = new Vehicle("KA03EF9012", "Fiona", "Car");
        vehicles[3] = new Vehicle("KA04GH3456", "George", "Bike");
        vehicles[4] = new Vehicle("KA05IJ7890", "Hannah", "Car");
        vehicles[5] = new Vehicle("KA06KL1122", "Ishaan", "Bike");
        vehicles[6] = new Vehicle("KA07MN3344", "Jade", "Car");
        vehicles[7] = new Vehicle("KA08OP5566", "Kevin", "Bike");
        vehicles[8] = new Vehicle("KA09QR7788", "Lina", "Car");
        vehicles[9] = new Vehicle("KA10ST9900", "Mia", "Bike");

        Vehicle.displayCars(vehicles);
        Vehicle.displayBikes(vehicles);
    }
}
