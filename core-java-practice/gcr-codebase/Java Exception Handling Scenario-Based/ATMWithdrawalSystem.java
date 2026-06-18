// Custom Exception for insufficient balance
class InsufficientBalanceException extends Exception {
    private double requestedAmount;
    private double availableBalance;
    
    public InsufficientBalanceException(double requestedAmount, double availableBalance) {
        super("Insufficient Balance. Requested: " + requestedAmount + 
              ", Available: " + availableBalance);
        this.requestedAmount = requestedAmount;
        this.availableBalance = availableBalance;
    }
    
    public double getShortfall() {
        return requestedAmount - availableBalance;
    }
}

public class ATMWithdrawalSystem {
    private double[] balances;
    private String[] accountHolders;
    
    public ATMWithdrawalSystem(String[] accountHolders, double[] balances) {
        this.accountHolders = accountHolders;
        this.balances = balances;
    }
    
    // Withdraw money
    public boolean withdraw(int accountIndex, double amount) {
        try {
            // Array out-of-bounds exception
            if (accountIndex < 0 || accountIndex >= balances.length) {
                throw new IndexOutOfBoundsException("Invalid account index: " + accountIndex);
            }
            
            // Check balance - custom exception
            if (amount > balances[accountIndex]) {
                throw new InsufficientBalanceException(amount, balances[accountIndex]);
            }
            
            balances[accountIndex] -= amount;
            System.out.println("Withdrawal successful! Amount: " + amount + 
                             ", Remaining: " + balances[accountIndex]);
            return true;
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        } catch (InsufficientBalanceException e) {
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }
    
    // Check balance
    public void checkBalance(int accountIndex) {
        try {
            if (accountIndex < 0 || accountIndex >= balances.length) {
                throw new IndexOutOfBoundsException("Invalid account index");
            }
            System.out.println("Account: " + accountHolders[accountIndex] + 
                             ", Balance: " + balances[accountIndex]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        String[] holders = {"Rajesh Kumar", "Priya Singh", "Amit Patel"};
        double[] balances = {5000, 8000, 2000};
        
        ATMWithdrawalSystem atm = new ATMWithdrawalSystem(holders, balances);
        
        System.out.println("=== ATM Withdrawal System ===");
        
        // Test 1: Check balance
        atm.checkBalance(0);
        
        // Test 2: Valid withdrawal
        System.out.println("\nWithdraw 2000:");
        atm.withdraw(0, 2000);
        
        // Test 3: Insufficient balance (Main scenario: balance 5000, request 8000)
        System.out.println("\nWithdraw 8000 (balance 5000 after previous withdrawal -> 3000):");
        atm.withdraw(0, 8000);
        
        // Test 4: Invalid account
        System.out.println("\nInvalid account:");
        atm.withdraw(10, 1000);
        
        // Test 5: Another withdrawal
        System.out.println("\nWithdraw 1000 from account 1:");
        atm.withdraw(1, 1000);
        atm.checkBalance(1);
    }
}
