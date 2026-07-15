public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this(customerName, carModel, rentalDays, 50.0); // default daily rate
    }

    public double totalCost() {
        return rentalDays * dailyRate;
    }

    public void display() {
        System.out.println("Car Rental:");
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + totalCost());
        System.out.println();
    }
}
