package Inheritance;

public class CheckingBankAccount extends BankAccount implements AccountLimitProvider {
    private static final double WITHDRAWAL_LIMIT = 15000.00;
    private static final double DEPOSIT_LIMIT = 20000.00;

    // Constructor
    public CheckingBankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        super(accountNumber, accountHolder, ACCOUNT_TYPE_CHECKING, initialDeposit);
    }

    // Override from BankAccount parent class
    @Override
    public void deposit(double amount) {
        // Implement deposit logic specific to CheckingAccount
        System.out.println("Depositing " + amount + " to Checking Account");
    }

    @Override
    public void withdraw(double amount) {
        // Implement withdraw logic specific to CheckingAccount
        System.out.println("Withdrawing " + amount + " from Checking Account");
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
