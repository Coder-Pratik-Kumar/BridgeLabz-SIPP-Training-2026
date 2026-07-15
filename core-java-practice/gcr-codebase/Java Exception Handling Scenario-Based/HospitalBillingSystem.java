// Custom Exception for insufficient funds
class InsufficientFundsException extends Exception {
    private double required;
    private double available;
    
    public InsufficientFundsException(double required, double available) {
        super("Insufficient Funds. Required: " + required + ", Available: " + available);
        this.required = required;
        this.available = available;
    }
    
    public double getShortfall() {
        return required - available;
    }
}

public class HospitalBillingSystem {
    private double[] billAmounts;
    private int[] itemCounts;
    
    public HospitalBillingSystem(double[] billAmounts, int[] itemCounts) {
        this.billAmounts = billAmounts;
        this.itemCounts = itemCounts;
    }
    
    // Calculate average cost per item
    public double getAverageCost(int patientIndex) {
        try {
            // Array out-of-bounds exception
            if (patientIndex < 0 || patientIndex >= billAmounts.length) {
                throw new IndexOutOfBoundsException("Invalid patient index: " + patientIndex);
            }
            
            // Division by zero
            if (itemCounts[patientIndex] == 0) {
                throw new ArithmeticException("Cannot divide: Bill has zero items");
            }
            
            return billAmounts[patientIndex] / itemCounts[patientIndex];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
            return -1;
        } catch (ArithmeticException e) {
            System.out.println("ERROR: " + e.getMessage());
            return -1;
        }
    }
    
    // Process payment
    public boolean processPayment(int patientIndex, String amountStr) {
        try {
            // Array out-of-bounds
            if (patientIndex < 0 || patientIndex >= billAmounts.length) {
                throw new IndexOutOfBoundsException("Invalid patient index");
            }
            
            // Number format exception
            double amount;
            try {
                amount = Double.parseDouble(amountStr);
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Invalid amount '" + amountStr + "' - " + e.getMessage());
                return false;
            }
            
            // Custom exception for insufficient funds
            if (amount < billAmounts[patientIndex]) {
                throw new InsufficientFundsException(billAmounts[patientIndex], amount);
            }
            
            System.out.println("Payment successful! Bill: " + billAmounts[patientIndex] + ", Paid: " + amount);
            return true;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        } catch (InsufficientFundsException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        double[] bills = {5000, 3500, 2500, 4200};
        int[] items = {10, 7, 0, 8};
        
        HospitalBillingSystem hospital = new HospitalBillingSystem(bills, items);
        
        // Test: Division by zero
        System.out.println("Average cost for patient 2: " + hospital.getAverageCost(2));
        
        // Test: Invalid index
        System.out.println("Average cost for patient 10: " + hospital.getAverageCost(10));
        
        // Test: Number format exception
        hospital.processPayment(0, "abc");
        
        // Test: Insufficient funds
        hospital.processPayment(0, "3000");
        
        // Test: Valid payment
        hospital.processPayment(0, "5500");
    }
}
