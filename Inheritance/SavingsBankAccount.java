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
        if (!this.isDepositWithinLimit(amount)) {
            this.announceLimitReached(TRANSACTION_TYPE_DEPOSIT);
            return;
        }
        // deposit logic
        this.balance += amount;
        // Formats message
        System.out.printf("Deposited: $%,.2f (Savings Account)", amount);
        System.out.println();
    }

    @Override
    public void withdraw(double amount) {
        if (!this.isWithdrawalWithinLimit(amount)) {
            this.announceLimitReached(TRANSACTION_TYPE_WITHDRAW);
            return;
        }
        //
        if (amount > balance) {
            this.announceInsufficientBalance();
            return;
        }
        //
        this.balance = balance - amount;

        // Formats message
        System.out.printf("Withdrew: %,.2f (Savings Account)", amount);
        System.out.println();
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
