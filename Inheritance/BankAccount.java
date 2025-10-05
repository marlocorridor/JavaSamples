package Inheritance;

// Abstract base class for different types of bank accounts.
// It includes common properties and methods shared by all account types.
// Abstract class cannot be instantiated directly.
public abstract class BankAccount implements TransactionTypeProvider, AccountTypeProvider {
    private final String accountNumber;
    private final String accountHolder;
    private final String accountType;
    private double balance;
    private boolean isClosed = false;
    private static int createdAccountsCounter = 0;
    private static int closedAccountsCounter = 0;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, String accountType, double initialDeposit) {
        // Set initial values
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = initialDeposit;

        // Account creation tracking
        createdAccountsCounter++;
        // success message
        String message = String.format(
                "Account created successfully for %s with initial deposit of %.2f%n",
                accountHolder,
                initialDeposit);
        System.out.println(message);
    }

    private void showBalance(String transactionType) {
        // using Rule switch expressions
        String messagePrefix = switch (transactionType) {
            case TRANSACTION_TYPE_DEPOSIT -> "New Balance: %.2f%n";
            case TRANSACTION_TYPE_WITHDRAW -> "Remaining Balance: %.2f%n";
            case TRANSACTION_TYPE_CHECK_BALANCE -> "Current Balance: %.2f%n";
            default -> throw new AssertionError();
        };
        System.out.printf(messagePrefix, this.balance);
        System.out.println();
    }

    // Transaction methods
    public void checkBalance() {
        showBalance(TRANSACTION_TYPE_CHECK_BALANCE);
    }

    // Abstract methods declarations, to be implemented in subclasses
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    // Account management methods
    public void closeAccount() {
        // Balance must be zero to close account
        if (this.balance != 0 && !this.isClosed) {
            System.out.println("Account cannot be closed. Balance must be zero.");
            return;
        }
        // Close the account
        closedAccountsCounter++;
        this.isClosed = true;
        System.out.println("Account closed successfully.");
    }

    public String checkAccountType() {
        return this.accountType;
    }

    // Getter methods
    public String getAccountHolder() {
        return this.accountHolder;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountType() {
        return this.accountType;
    }
}
