package Inheritance;

public class SavingsBankAccount extends BankAccount implements AccountLimitProvider {
    private static final double WITHDRAWAL_LIMIT = 5000.00;
    private static final double DEPOSIT_LIMIT = 8000.00;

    // Constructor
    public SavingsBankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        super(accountNumber, accountHolder, ACCOUNT_TYPE_SAVINGS, initialDeposit);
    }

    // Override from BankAccount parent class
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

    // Override from AccountLimitProvider interface
    @Override
    public double getWithdrawalLimit() {
        return WITHDRAWAL_LIMIT;
    }

    @Override
    public double getDepositLimit() {
        return DEPOSIT_LIMIT;
    }
}
