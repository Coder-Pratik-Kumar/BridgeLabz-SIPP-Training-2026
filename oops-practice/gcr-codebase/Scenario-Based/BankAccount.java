import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    public String accountNumber;
    public String holder;
    private double balance;
    public static int totalAccounts;
    private final List<String> statement;

    public BankAccount(String accountNumber, String holder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = initialBalance;
        totalAccounts++;
        this.statement = new ArrayList<>();
        this.statement.add("Account opened with initial balance: " + initialBalance);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            statement.add("Deposited: " + amount + ", new balance: " + balance);
        } else {
            statement.add("Invalid deposit attempt: " + amount);
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            statement.add("Withdrew: " + amount + ", new balance: " + balance);
            return true;
        }
        statement.add("Failed withdrawal attempt: " + amount + " (available balance: " + balance + ")");
        return false;
    }

    public String getStatement() {
        StringBuilder builder = new StringBuilder();
        builder.append("Statement for ").append(holder).append(" (Account #").append(accountNumber).append("):\n");
        for (String entry : statement) {
            builder.append("  - ").append(entry).append("\n");
        }
        builder.append("Current balance: ").append(balance).append("\n");
        return builder.toString();
    }
}
