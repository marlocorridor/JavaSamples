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
        if (!this.isDepositWithinLimit(amount)) {
            this.announceLimitReached(TRANSACTION_TYPE_DEPOSIT);
            return;
        }
        // Implement deposit logic specific to CheckingAccount
        System.out.println("Depositing " + amount + " to Checking Account");
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
        System.out.printf("Withdrew: %,.2f (Checking Account)", amount);
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
