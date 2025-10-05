package Inheritance;

/**
 * Interface that defines constants for bank account transaction limits.
 * Classes implementing this interface must provide withdrawal and deposit
 * limits.
 */
public interface AccountLimitProvider {

    // Withdrawal limit constants - must be implemented by implementing classes
    double getWithdrawalLimit();

    // Deposit limit constants - must be implemented by implementing classes
    double getDepositLimit();

    // NOTE: `default` methods could be overriden by implementing class
    // Default method to check if withdrawal amount is within limit
    default boolean isWithdrawalWithinLimit(double amount) {
        return amount > 0 && amount <= getWithdrawalLimit();
    }

    // Default method to check if deposit amount is within limit
    default boolean isDepositWithinLimit(double amount) {
        return amount > 0 && amount <= getDepositLimit();
    }

    default void announceLimitReached(String transactionType) {
        if (transactionType == null) {
            throw new IllegalArgumentException("Transaction type cannot be null");
        }

        // Define vars after type check
        String type;
        double limit;

        switch (transactionType) {
            case TransactionTypeProvider.TRANSACTION_TYPE_WITHDRAW -> {
                type = TransactionTypeProvider.TRANSACTION_TYPE_WITHDRAW;
                limit = this.getWithdrawalLimit();
            }
            case TransactionTypeProvider.TRANSACTION_TYPE_DEPOSIT -> {
                type = TransactionTypeProvider.TRANSACTION_TYPE_DEPOSIT;
                limit = this.getDepositLimit();
            }
            default -> throw new IllegalArgumentException("Unsupported transaction type: " + transactionType);
        }

        // Prepare and print out message
        String message = String.format("%s Transaction has reach it's limit of: %,.2f", type, limit);
        System.out.println(message);
    }

    default void announceInsufficientBalance() {
        // Prepare and print out message
        String message = String.format("Insufficient Balance");
        System.out.println(message);
    }
}
