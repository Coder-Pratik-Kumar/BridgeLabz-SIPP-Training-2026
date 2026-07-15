public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }

    public void displaySavings() {
        // can access public accountNumber and protected accountHolder
        System.out.println("Savings Account:");
        System.out.println("Account Number (public): " + accountNumber);
        System.out.println("Account Holder (protected): " + accountHolder);
        System.out.println("Balance (via getter): " + getBalance());
        System.out.println();
    }
}
