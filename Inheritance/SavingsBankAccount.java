package Inheritance;

public class SavingsBankAccount extends BankAccount {
    // Constructor
    public SavingsBankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        super(accountNumber, accountHolder, ACCOUNT_TYPE_SAVINGS, initialDeposit);
    }

    @Override
    public void deposit(double amount) {
        // Implement deposit logic specific to SavingsAccount
        System.out.println("Depositing " + amount + " to Savings Account");
    }

    @Override
    public void withdraw(double amount) {
        // Implement withdraw logic specific to SavingsAccount
        System.out.println("Withdrawing " + amount + " from Savings Account");
    }
}
