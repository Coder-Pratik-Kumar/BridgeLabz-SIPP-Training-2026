public class EncapsulationScenarioMain {
    public static void main(String[] args) {
        System.out.println("--- Shape Hierarchy ---");
        Shape[] shapes = new Shape[] {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 4, 5)
        };

        System.out.printf("%-12s %-15s %-15s%n", "Shape", "Area", "Perimeter");
        for (Shape shape : shapes) {
            System.out.printf("%-12s %-15.2f %-15.2f%n", shape.getName(), shape.area(), shape.perimeter());
        }

        System.out.println("\n--- Employee Payroll System ---");
        FullTimeEmployee fullTime = new FullTimeEmployee();
        fullTime.setEmployeeId("E001");
        fullTime.setEmployeeName("Aisha");
        fullTime.setMonthlySalary(65000);

        PartTimeEmployee partTime = new PartTimeEmployee();
        partTime.setEmployeeId("E002");
        partTime.setEmployeeName("Brian");
        partTime.setHoursWorked(120);
        partTime.setHourlyRate(350);

        fullTime.displayEmployeeInfo();
        System.out.println("Calculated Salary: " + fullTime.calculateSalary());
        System.out.println();
        partTime.displayEmployeeInfo();
        System.out.println("Calculated Salary: " + partTime.calculateSalary());

        System.out.println("\n--- Vehicle Rental System ---");
        Car car = new Car();
        car.setVehicleNumber("V001");
        car.setVehicleType("Car");
        car.setDailyRate(2500);

        Bike bike = new Bike();
        bike.setVehicleNumber("V002");
        bike.setVehicleType("Bike");
        bike.setDailyRate(700);

        Truck truck = new Truck();
        truck.setVehicleNumber("V003");
        truck.setVehicleType("Truck");
        truck.setDailyRate(5200);
        truck.setLoadingCharge(1500);

        car.displayVehicleDetails();
        System.out.println("Rental cost for 3 days: " + car.calculateRentalCost(3));
        System.out.println();
        bike.displayVehicleDetails();
        System.out.println("Rental cost for 2 days: " + bike.calculateRentalCost(2));
        System.out.println();
        truck.displayVehicleDetails();
        System.out.println("Rental cost for 4 days: " + truck.calculateRentalCost(4));

        System.out.println("\n--- Banking System ---");
        SavingsAccount savings = new SavingsAccount();
        savings.setAccountNumber("SA001");
        savings.setHolderName("Chitra");
        savings.setBalance(200000);
        savings.setInterestRate(5.0);

        CurrentAccount current = new CurrentAccount();
        current.setAccountNumber("CA001");
        current.setHolderName("Dhruv");
        current.setBalance(120000);
        current.setMonthlyBonusRate(1.5);

        savings.deposit(25000);
        savings.withdraw(30000);
        savings.displayAccountDetails();
        System.out.println("Calculated Interest: " + savings.calculateInterest());
        System.out.println();

        current.deposit(20000);
        current.withdraw(15000);
        current.displayAccountDetails();
        System.out.println("Calculated Interest: " + current.calculateInterest());
    }
}
